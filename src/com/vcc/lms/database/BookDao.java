package com.vcc.lms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BookDao extends BaseDao {

    public static boolean insertbook(int isbn, String bookname, String author, String booktype, String bookcat,
                    String rackno, String description) {
        boolean isSuccess = false;

        // create db connection
        String url = "jdbc:mysql://localhost:3306/vcc";
        String uname = "root";
        String pass = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement stmt = con.createStatement();
            String sql = "insert into book values ('" + isbn + "','" + bookname + "','" + author + "','" + booktype
                            + "','" + bookcat + "','" + rackno + "','" + description + "')";
            int rs = stmt.executeUpdate(sql);
            if (rs > 0) {
                isSuccess = true;

            } else {
                isSuccess = false;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

}
