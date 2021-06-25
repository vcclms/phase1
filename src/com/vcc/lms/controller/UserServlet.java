package com.vcc.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vcc.lms.database.UserDao;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		int uid = Integer.parseInt(request.getParameter("uid"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String grade = request.getParameter("grade");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String userrole = request.getParameter("userrole");
		boolean isTrue;
		
		isTrue = UserDao.insertuser(uid, fname, lname, address, grade, username, password, userrole);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("librarianhome.jsp");
			dis.forward(request, response);
			
			
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
