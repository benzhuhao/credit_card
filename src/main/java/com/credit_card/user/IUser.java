package com.credit_card.user;

public interface IUser {

    public int getUserId();

    public void setUserId(int id);

    public String getUserName();

    public String getUserPassword();

    public void setUserName(String userName);

    public void setUserPassword(String password);

    public boolean isUserAdmin();

    public void setUserAdmin(boolean set);

}
