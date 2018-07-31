package com.epam.task0.validator;

public class CustomKitValidator {

    private static final int MIN_NAME_SIZE = 7;
    private static final int MAX_NAME_SIZE = 20;

    public static boolean validateName(String customKitName) {
        return customKitName.length() >= MIN_NAME_SIZE && customKitName.length() <= MAX_NAME_SIZE;

    }
}
