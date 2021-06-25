/******************************************************************************
 * Copyright (c) 2021
 ******************************************************************************/

package com.vcc.lms.model;

import java.io.Serializable;

/**
 * This represents the user object of the VCCLMS
 *
 * @author
 * @date Jun 19, 2021
 *
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String getUserid = null;
    private String firstName;
    private String lastName;
    private String grade;
    private String address;
    private String email;
    private String username;
    private String password;
    private Role role;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns firstName
     * 
     * @return Returns the firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set firstName
     * 
     * @param firstName
     *            The firstName to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns lastName
     * 
     * @return Returns the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set lastName
     * 
     * @param lastName
     *            The lastName to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns role
     * 
     * @return Returns the role.
     */
    public Role getRole() {
        return role;
    }

    /**
     * Set role
     * 
     * @param role
     *            The role to set.
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Returns getuserid
     * 
     * @return Returns the getuserid.
     */
    public static String getGetuserid() {
        return getUserid;
    }

}
