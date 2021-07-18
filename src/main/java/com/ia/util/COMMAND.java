package com.ia.util;

public enum COMMAND {
    ADD("Add"),
    MULTIPLY("Multiply"),
    SUBTRACT("Subtract"),
    DIVIDE("Divide");

    private final String command;

    COMMAND(String command) {
        this.command = command;
    }

    public String getCommand() {
        return this.command;
    }

    public static COMMAND fromString(String text) {
        for (COMMAND b : COMMAND.values()) {
            if (b.command.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

}
