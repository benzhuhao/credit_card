package com.persistence.cloudant;

import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProjectProp {

    private Properties prop;
    private static final XLogger log = XLoggerFactory.getXLogger(ProjectProp.class);

    public ProjectProp() {
        this.loadProperty();
    }

    private void loadProperty() {
        log.entry("Starting load property file : application.properties");
        prop = new Properties();
        InputStream in = ProjectProp.class.getClassLoader().getResourceAsStream("application.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {

        }
    }

    public Properties getPropObj() {
        return prop;
    }

    public String getAccount() {
        return prop.getProperty("cloudantDBInfo.account");
    }

    public String getUsername() {
        return prop.getProperty("cloudantDBInfo.username");
    }

    public String getPassword() {
        return prop.getProperty("cloudantDBInfo.password");
    }

    public String getDbname() {
        return prop.getProperty("cloudantDBInfo.dbname");
    }

}
