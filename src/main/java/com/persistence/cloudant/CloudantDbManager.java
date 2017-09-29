package com.persistence.cloudant;

import com.cloudant.client.api.CloudantClient;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
@Component
public class CloudantDbManager {
    private static final XLogger log = XLoggerFactory.getXLogger(CloudantDbManager.class);
    private CloudantClient client = null;


    private CloudantDBInfo dbInfo;

    public CloudantDbManager() {
        log.info("Creating the Cloudant clients.");
        this.initializeClients();
    }

    private void initializeClients() {
        log.entry();
        try {
            log.info("Initializing the cloudant clients.");

            log.info("Attempting to get the database accounts information");

            System.out.println("should see me: "+dbInfo);

        } catch (Exception e) {

        }
    }

    public static void main(String[] args){
        CloudantDbManager ma = new CloudantDbManager();

    }
}
