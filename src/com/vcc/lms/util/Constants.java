/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.util;

/**
 * Contains all the constants for VCCLMS
 * 
 * @author 
 * @date Jun 19, 2021
 * 
 */
public class Constants {
    
    //DB connection related
    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/vcc";
    public static final String DB_USER = "root";
    public static final String DB_PWD = "";
    
    //Request params related
    public static final String REQ_USERNAME = "username";
    public static final String REQ_PASSWORD = "password";
    
    //Cookie/Session related
    public static final String KEY_USER= "user";
    
    //Response related
    public static final String RES_CONTENT_TYPE = "text/html;charset=UTF-8";
}
