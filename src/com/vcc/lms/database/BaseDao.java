/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vcc.lms.util.Constants;

/**
 * This represents the base class for Data Access Objects
 * 
 * @author
 * @date Jun 19, 2021
 * 
 */
public class BaseDao {

    public static Connection createDBConnection() {
        // Loading drivers for mysql
        try {
            Class.forName(Constants.DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            // We need to catch this exception and return/redirect to a error page on the UI
            throw new RuntimeException(e);
        }

        // Creating connection with the database
        try {
            return DriverManager.getConnection(Constants.CONNECTION_STRING, Constants.DB_USER, Constants.DB_PWD);
        } catch (SQLException e) {
            // We need to catch this exception and return/redirect to a error page on the UI
            throw new RuntimeException(e);
        }
    }
}
