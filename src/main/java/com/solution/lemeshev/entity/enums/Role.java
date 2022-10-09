package com.solution.lemeshev.entity.enums;

public enum Role {
    ADMIN("admin"),
    USER("user"),
    MODERATOR("moderator");

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
