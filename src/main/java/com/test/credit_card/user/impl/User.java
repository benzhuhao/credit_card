package com.test.credit_card.user.impl;

import com.test.credit_card.user.IUser;
import java.io.Serializable;

public class User implements IUser, Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String userName;
    private String password;
    private boolean isAdmin;

    public User() {
    }

    public User(int id, String userName, String password, boolean isAdmin) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    @Override
    public int getUserId() {
        return this.id;
    }

    @Override
    public void setUserId(int id) {
        this.id = id;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }

    @Override
    public String getUserPassword() {
        return this.password;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setUserPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean isUserAdmin() {
        return this.isAdmin;
    }

    @Override
    public void setUserAdmin(boolean set) {
        this.isAdmin = set;
    }

}
