package com.github.stanislav_milev.server.enumeration;

public enum UserStatus {
    OK("OK"),
    //BANNED("BANNED)",
    DELETED("DELETED");

    private final String status;

    UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
