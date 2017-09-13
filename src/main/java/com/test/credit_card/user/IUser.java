package com.test.credit_card.user;

import com.test.credit_card.creditcard.ICreditCard;

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
