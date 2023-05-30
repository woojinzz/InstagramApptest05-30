package com.koddev.instagramtest;

public class Dm_Chatlist {
    public String id;
    private String lastMessage;

    public Dm_Chatlist(String id) {
        this.id = id;
    }

    public Dm_Chatlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}


