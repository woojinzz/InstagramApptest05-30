package com.koddev.instagramtest.FCM;

public class Notification {
    private String title;
    private String body;
    private int imageResourceId;

    public Notification(String title, String body, int imageResourceId) {
        this.title = title;
        this.body = body;
        this.imageResourceId = imageResourceId;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
