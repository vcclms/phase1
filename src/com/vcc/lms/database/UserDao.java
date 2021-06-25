/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

//This class can be used to  initialize the database connection

public class UserDao {
	
	
	public static boolean insertuser(int uid, String fname,String lname, String address, String grade, String username, String password, String userrole) {
		boolean isSuccess = false;
		
		// create db connection
		String url = "jdbc:mysql://localhost:3306/vcc";
		 String uname = "root";
		 String pass = "";
		
		 try {
			 
			 Class.forName("com.mysql.jdbc.Driver"); 
			 Connection con = DriverManager.getConnection(url, uname, pass);
			 Statement stmt = con.createStatement();
			 String sql = "insert into user values ('"+uid+"','"+fname+"','"+lname+"','"+address+"','"+grade+"','"+username+"','"+password+"','"+userrole+"')";
			 int rs = stmt.executeUpdate(sql);
			 if(rs>0) {
				 isSuccess = true;
				 
			 }else {
				 isSuccess = false;
				 
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return isSuccess;
	}

}
