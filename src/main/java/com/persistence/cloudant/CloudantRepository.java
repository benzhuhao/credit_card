package com.persistence.cloudant;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import com.credit_card.creditcard.CreditCard;
import com.credit_card.user.User;
import com.persistence.Repository;
import com.persistence.RepositoryException;
import com.persistence.RepositoryObjectNotFoundException;
import org.springframework.beans.factory.annotation.Value;

import java.net.MalformedURLException;

public class CloudantRepository implements Repository {


    private static final XLogger log = XLoggerFactory.getXLogger(CloudantRepository.class);
    private final CloudantClient client;
    private final String baseDbUri;

    public CloudantRepository(@Value("${cloudant.acc}") String acc,
                              @Value("${cloudant.username}") String username,
                              @Value("${cloudant.password}") String password) throws RepositoryException, MalformedURLException {
        log.entry(client, databaseName);

        if (client == null) {
            throw new RepositoryException("The CloudantCient instance can not be null.");
        }

        if (databaseName == null || databaseName.isEmpty()) {
            throw new RepositoryException("The database name can not be null or empty.");
        }

        log.trace("Received a CloudantClient for {} to access database {}", client.getBaseUri().toString(), databaseName);
        this.client = ClientBuilder.account(acc)
                                    .username(username)
                                    .password(password)
                                    .build();
        this.baseDbUri = client.getBaseUri() + "/" + databaseName + "/";


        log.exit();
    }

    /**
     * Create a new empty user ;
     *
     * @return the new user's ID
     */
    @Override
    public String createUser() throws RepositoryException {
        return null;
    }

    /**
     * Create a new User identified by the specified ID.
     *
     * @param user the user to be saved, must contain a non null ID.
     * @return the new user's ID.
     * @throws RepositoryException
     */
    @Override
    public String createUser(User user) throws RepositoryException {
        return null;
    }

    /**
     * Get the user object identified by the specified ID.
     *
     * @param userId the ID of the user to retrieve.
     * @return a User object representing the retrieved , or null if the block
     * was not found.
     */
    @Override
    public User getUser(String userId) throws RepositoryException {
        return null;
    }

    /**
     * Update user object identified by the specified ID
     *
     * @param userId     the ID of the user to update
     * @param updateBody the body of user info need to be updated
     * @return the updated user's ID
     */
    @Override
    public String updateUser(String userId, User updateBody) throws RepositoryException {
        return null;
    }

    /**
     * Delete the user object identified by the specified ID.
     *
     * @param userId the ID of the user to be deleted.
     * @throws RepositoryException
     * @returns true is the user was deleted, false is no user exists for the specified user ID.
     */
    @Override
    public boolean deleteUser(String userId) throws RepositoryException, RepositoryObjectNotFoundException {

        return false;
    }

    /**
     * Create a new configuration block
     *
     * @param card a Credit Card object representing the Credit Card to be created.
     * @return the saved Credit Card ETag value.
     */
    @Override
    public String storeCreditCard(CreditCard card) throws RepositoryException {
        return null;
    }

    /**
     * Get the configuration block identified by the store ID and block namespace.
     *
     * @param userId              the ID of the user that contains the Credit Card.
     * @param creditCardNamespace the namespace of the Credit Card to be retrieved.
     * @return a Credit Card object representing the retrieved Credit Card, or null if the Credit Card
     * was not found.
     */
    @Override
    public CreditCard getCreditCard(String userId, String creditCardNamespace) throws RepositoryException {
        return null;
    }

    /**
     * Delete the configuration block identified by the store ID and block namespace.
     *
     * @param userId              the ID of the user that contains the credit Cards.
     * @param creditCardNamespace the namespace of the credit Cards to be retrieved.
     * @return true if the credit card was deleted, false if no credit card exists for the specified parameters.
     */
    @Override
    public boolean deleteCreditCard(String userId, String creditCardNamespace) throws RepositoryException, RepositoryObjectNotFoundException {

        return false;
    }
}
