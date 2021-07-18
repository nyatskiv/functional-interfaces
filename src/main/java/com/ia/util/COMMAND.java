package com.ia.util;

import java.util.Arrays;

public enum COMMAND {
    ADD("Add"),
    MULTIPLY("Multiply"),
    SUBTRACT("Subtract"),
    DIVIDE("Divide");

    private final String command;

    COMMAND(String command) {
        this.command = command;
    }

    public static COMMAND fromString(String value) {
        return Arrays.stream(COMMAND.values())
                .filter(commandEnum -> commandEnum.command.equalsIgnoreCase(value))
                .findFirst()
                .orElse(null);
    }

}
