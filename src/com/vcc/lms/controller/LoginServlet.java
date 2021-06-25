/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vcc.lms.database.AuthenticationDao;
import com.vcc.lms.model.User;
import com.vcc.lms.util.Constants;

/**
 * Accepts all the login requests from the users
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType(Constants.RES_CONTENT_TYPE);
        String username = request.getParameter(Constants.REQ_USERNAME);
        String password = request.getParameter(Constants.REQ_PASSWORD);
        
        //This specific object creations can be removed when we use SPRING. Lets see at the end. For the moment 
        //DO it with 'new' keyword which is not that good :). But okay for the beginning.
        AuthenticationDao authDao = new AuthenticationDao();
        User user = null;

        if ((user = authDao.validateUser(username, password)) != null) {

            // Create the session for successful user login
            HttpSession session = request.getSession();
            session.setAttribute(Constants.KEY_USER, user.getUsername());

            // Setting session to expire in 30 mins
            session.setMaxInactiveInterval(30 * 60);

            // Set user in cookies
            Cookie userName = new Cookie(Constants.KEY_USER, user.getUsername());

            // Set max life time for the cookie
            userName.setMaxAge(30 * 60);

            // Add cookies to the response
            response.addCookie(userName);

            // Send response back to UI
            response.sendRedirect("home.jsp");
        } else {
            // Send response back to login page
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");            
            rd.include(request, response);         
        }
    }
}
