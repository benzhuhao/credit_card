package com.persistence;

import com.credit_card.creditcard.CreditCard;
import com.credit_card.user.User;

public interface Repository {

    /**
     * Create a new empty user ;
     * @return the new user's ID
     */
    public String createUser() throws RepositoryException;

    /**
     * Create a new User identified by the specified ID.
     * @param user the user to be saved, must contain a non null ID.
     * @return the new user's ID.
     * @throws RepositoryException
     */
    public String createUser(User user) throws RepositoryException;

    /**
     * Get the user object identified by the specified ID.
     * @param userId the ID of the user to retrieve.
     * @return a User object representing the retrieved , or null if the block
     * was not found.
     */
    public User getUser(String userId) throws RepositoryException;

    /**
     * Delete the user object identified by the specified ID.
     * @param userId the ID of the user to be deleted.
     * @returns true is the user was deleted, false is no user exists for the specified user ID.
     * @throws RepositoryException
     */
    public void deleteUser(String userId) throws RepositoryException, RepositoryObjectNotFoundException;

    /**
     * Create a new configuration block
     * @param card a Credit Card object representing the Credit Card to be created.
     * @return the saved Credit Card ETag value.
     */
    public String storeCreditCard(CreditCard card) throws RepositoryException;

    /**
     * Get the configuration block identified by the store ID and block namespace.
     * @param userId the ID of the user that contains the Credit Card.
     * @param creditCardNamespace the namespace of the Credit Card to be retrieved.
     * @return a Credit Card object representing the retrieved Credit Card, or null if the Credit Card
     * was not found.
     */
    public CreditCard getCreditCard(String userId, String creditCardNamespace) throws RepositoryException;

    /**
     * Delete the configuration block identified by the store ID and block namespace.
     * @param userId the ID of the user that contains the credit Cards.
     * @param creditCardNamespace the namespace of the credit Cards to be retrieved.
     * @return true if the credit card was deleted, false if no credit card exists for the specified parameters.
     */
    public void deleteCreditCard(String userId, String creditCardNamespace) throws RepositoryException, RepositoryObjectNotFoundException;

}