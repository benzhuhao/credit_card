package com.persistence;

public class RepositoryObjectNotFoundException extends RepositoryException {
    public RepositoryObjectNotFoundException(String message) {
        super(message);
    }

    public RepositoryObjectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryObjectNotFoundException(String message, String userId, Throwable cause) {
        super(message, userId, cause);
    }

    public RepositoryObjectNotFoundException(String message, String userId, String creditCardNamespace) {
        super(message, userId, creditCardNamespace);
    }

    public RepositoryObjectNotFoundException(String message, String userId, String creditCardNamespace, Throwable cause) {
        super(message, userId, creditCardNamespace, cause);
    }
}
