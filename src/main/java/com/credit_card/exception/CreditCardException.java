package com.credit_card.exception;

public class CreditCardException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CreditCardException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreditCardException(String message) {
        super(message);
    }

    public CreditCardException() {
        super();
    }
}
