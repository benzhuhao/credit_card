package com.credit_card.exception;

public class NotFoundException extends CreditCardException {
    private static final long serialVersionUID = 1L;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException() {
        super();
    }
}
