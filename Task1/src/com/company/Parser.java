package com.company;

public class Parser {
    public static int[] parseLine(String userLine) {

        String[] myString = userLine.split(" ");
        int[] values = new int[myString.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(myString[i]);
        }
        return values;
    }
}
