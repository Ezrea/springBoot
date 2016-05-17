package com.twist.springBoot.model;

/**
 * @author Yingjie Chen
 * @date 2016/5/18
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
