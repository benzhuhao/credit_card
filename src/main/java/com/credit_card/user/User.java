package com.credit_card.user;

import com.credit_card.creditcard.CreditCard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String userName;
    private String password;
    private boolean isAdmin;
    private List<CreditCard> cards;

    public User() {
    }

    public User(int id, String userName, String password, boolean isAdmin) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
        cards = new ArrayList<CreditCard>();
    }

    public int getUserId() {
        return this.id;
    }

    public User setUserId(int id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserPassword() {
        return this.password;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User setUserPassword(String password) {
        this.password = password;
        return this;
    }

    public boolean isUserAdmin() {
        return this.isAdmin;
    }

    public User setUserAdmin(boolean set) {
        this.isAdmin = set;
        return this;
    }

    public List<CreditCard> getCards() {
        return cards;
    }

    public User setCard(CreditCard card) {
        cards.add(card);
        return this;
    }

}
