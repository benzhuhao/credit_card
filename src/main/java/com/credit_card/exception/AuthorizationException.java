package com.credit_card.exception;

public class AuthorizationException extends CreditCardException{
    private static final long serialVersionUID = 1L;

    public AuthorizationException(String message) {
        super(message);
    }
}
