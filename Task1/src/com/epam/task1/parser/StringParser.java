package com.epam.task1.parser;

public class StringParser {
    public static final String REGEX = "\\s";

    public int[] parseLine(String input) {

        String[] strings = input.split(REGEX);
        int[] values = new int[strings.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(strings[i]);
        }
        return values;
    }
}
