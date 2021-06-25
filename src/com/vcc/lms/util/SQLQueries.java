/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.util;

/**
 * Contains all the SQL queries for VCCLMS
 * 
 * @author 
 * @date Jun 19, 2021
 * 
 */
public class SQLQueries {    
    public static final String GET_USER = "select * from librarianlogin where username=? and password=?";

}
