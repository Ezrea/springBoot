package com.twist.springBoot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Yingjie Chen
 * @date 2016/5/17
 */
@Component
@ConfigurationProperties(prefix = "twist",locations = {"classpath:application.yml"})
public class AuthorSettings {
    private String author;
    private String date;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
