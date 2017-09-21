package com.persistence;

public class RepositoryException extends Exception {

    private String userId;
    private String creditCardIds;

    public RepositoryException() {
        super();
    }

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(String message, Throwable cause) {
        this(message, null, null, cause);
    }

    public RepositoryException(String message, String storeId, Throwable cause) {
        this(message, storeId, null, cause);
    }

    public RepositoryException(String message, String userId, String creditCardIds) {
        this(message, userId, creditCardIds, null);
    }

    public RepositoryException(String message, String userId, String creditCardIds, Throwable cause) {
        super(message, cause);
        this.userId = userId;
        this.creditCardIds = creditCardIds;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getCreditCardIds() {
        return this.creditCardIds;
    }


    @Override
    public String getMessage() {
        String msg = super.getMessage();

        if (this.getUserId() != null) {
            msg += " User: '" + this.getUserId() + "'";
        }

        if (this.getCreditCardIds() != null) {
            msg += " Block: '" + this.getCreditCardIds() + "'";
        }

        return msg;
    }
}
