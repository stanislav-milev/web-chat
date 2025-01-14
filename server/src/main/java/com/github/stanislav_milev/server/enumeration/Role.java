package com.github.stanislav_milev.server.enumeration;

public enum Role {
    ROOM_ADMIN("ROOM_ADMIN"),
    ROOM_USER("ROOM_USER");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
