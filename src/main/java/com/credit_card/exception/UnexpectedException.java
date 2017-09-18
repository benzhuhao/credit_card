package com.credit_card.exception;

public class UnexpectedException extends CreditCardException {
    private static final long serialVersionUID = 1L;

    public UnexpectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedException(String message) {
        super(message);
    }

    public UnexpectedException() {
        super();
    }
}
