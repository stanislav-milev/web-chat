package com.github.stanislav_milev.server.enumeration;

public enum MessageStatus {
    SENDING("SENDING"),
    SENT("SENT"),
    //FILTERED("FILTERED)",
    //CENSORED("CENSORED"),
    DELETED("DELETED");

    private final String status;

    MessageStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
