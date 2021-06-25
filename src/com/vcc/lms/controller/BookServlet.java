package com.vcc.lms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vcc.lms.database.BookDao;



@WebServlet("/AddBookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String booktype = request.getParameter("booktype");
		String bookcat = request.getParameter("bookcat");
		String rackno = request.getParameter("rackno");
		String description = request.getParameter("description");
boolean isTrue;
		
		isTrue = BookDao.insertbook(isbn, bookname, author, booktype, bookcat, rackno, description);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("librarianhome.jsp");
			dis.forward(request, response);
			
			
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
