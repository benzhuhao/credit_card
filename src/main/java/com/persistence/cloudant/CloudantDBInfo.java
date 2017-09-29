package com.persistence.cloudant;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:application.properties"},encoding="utf-8")
public class CloudantDBInfo {

    @Value("${cloudant.account}")
    private String account;

    @Value("${cloudant.username}")
    private String username;

    @Value("${cloudant.password}")
    private String password;

    @Value("${cloudant.dbname}")
    private String dbname;

    @Getter
    @Setter


    public void setAccount(String acc) {
        this.account = acc;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void setPassword(String pw) {
        this.password = pw;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getAccount() {
        return this.account;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDbname() {
        return this.dbname;
    }

}
