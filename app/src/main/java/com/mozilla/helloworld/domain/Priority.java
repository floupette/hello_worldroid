package com.mozilla.helloworld.domain;

public enum Priority {
    LOW(0, "faible"),
    HIGH(100, "haut");

    private final Integer level;

    public int getLevel() {
        return level;
    }

    private final String name;

    public String getName() {
        return name;
    }

    Priority(int level, String name) {
        this.level = level;
        this.name = name;
    }
}