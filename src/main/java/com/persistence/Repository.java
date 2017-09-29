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
     * Update user object identified by the specified ID
     * @param userId the ID of the user to update
     * @param updateBody the body of user info need to be updated
     * @return the updated user's ID
     */
    public String updateUser(String userId, User updateBody) throws RepositoryException;

    /**
     * Delete the user object identified by the specified ID.
     * @param userId the ID of the user to be deleted.
     * @returns true is the user was deleted, false is no user exists for the specified user ID.
     * @throws RepositoryException
     */
    public boolean deleteUser(String userId) throws RepositoryException, RepositoryObjectNotFoundException;

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
     * update Credit card info
     * @param userId the ID of the user that contains the Credit Card
     * @param creditCardNameSpace the namespace of the Credit Card to be updated
     * @param updateBody the namespace of the
     * @return
     */

    /**
     * Delete the configuration block identified by the store ID and block namespace.
     * @param userId the ID of the user that contains the credit Cards.
     * @param creditCardNamespace the namespace of the credit Cards to be retrieved.
     * @return true if the credit card was deleted, false if no credit card exists for the specified parameters.
     */
    public boolean deleteCreditCard(String userId, String creditCardNamespace) throws RepositoryException, RepositoryObjectNotFoundException;

}