/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.database;

import com.vcc.lms.model.User;

public class AuthenticationDao extends BaseDao {

    public User validateUser(String username, String password) {
        User loggedInUser = null;
        try {
            /* Uncomment this part. I have commented as I don't have the db set up
            PreparedStatement ps = BaseDao.createDBConnection().prepareStatement(SQLQueries.GET_USER);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            rs.next(); */

            // Create a user object here and populate all the values using above result set
            loggedInUser = new User();
            loggedInUser.setUsername("Sahan");
            // loggedInUser... do the rest
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loggedInUser;
    }
}
