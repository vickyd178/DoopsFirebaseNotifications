package com.doops.fcmnotify;


import java.io.Serializable;

public class NotificationData implements Serializable {
    private String title;
    private String message;
    private String action;

    public NotificationData(String title, String message, String action) {
        this.title = title;
        this.message = message;
        this.action = action;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getAction() {
        return action;
    }
}
