package com.epam.task0_tseulovich.validator;

public class CustomKitNameValidator {

    private static final int MIN_NAME_SIZE = 8;
    private static final int MAX_NAME_SIZE = 20;

    public static boolean validate(String customKitName) {
        return customKitName.length() >= MIN_NAME_SIZE && customKitName.length() <= MAX_NAME_SIZE;

    }
}
