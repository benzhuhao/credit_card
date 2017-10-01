package com.persistence.cloudant;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.credit_card.creditcard.CreditCard;
import com.credit_card.user.User;
import com.google.gson.GsonBuilder;
import com.persistence.RepositoryException;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class CloudantDbManager {

    private static final XLogger log = XLoggerFactory.getXLogger(CloudantDbManager.class);
    private CloudantClient client = null;

    private ProjectProp dbInfo = new ProjectProp();

    private String account = "xup2";
    private String user = "xup2";
    private String password = "npk3s3bb";
    private String dbName = "test";

    public CloudantDbManager() throws RepositoryException {
        log.info("Creating the Cloudant clients.");
        log.info("Attempting to get the database accounts information");
        loadDatabaseConnectionInfo();
        this.initializeClients();
    }

    private void loadDatabaseConnectionInfo() {
        log.entry("load database connection info");

        String account = dbInfo.getAccount();
        String user = dbInfo.getUsername();
        String password = dbInfo.getPassword();
        String dbName = dbInfo.getDbname();

        if(account != null) this.account = account;
        if(user != null) this.user = user;
        if(password != null) this.password = password;
        if(dbName != null) this.dbName = dbName;
    }

    private void initializeClients() throws RepositoryException {
        log.entry();
        try {
            log.info("Initializing the cloudant clients.");
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(CreditCard.class, new CreditCardTypeAdapter());
            builder.registerTypeAdapter(User.class, new UserTypeAdapter());

            client = ClientBuilder.account(account)
                                    .username(account)
                                    .password(user)
                                    .gsonBuilder(builder)
                                    .build();


        log.exit();


        } catch (Exception e) {
            log.exit();
            throw log.throwing(new RepositoryException("A error occurred while initializing the database client", e));
        }
    }

}
