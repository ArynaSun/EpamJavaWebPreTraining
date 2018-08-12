package com.epam.task0.validator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomKitValidator {//написать параметризированный тест

    private static final int MIN_NAME_SIZE = 7;
    private static final int MAX_NAME_SIZE = 20;

    public static boolean validateName(String customKitName) {// param test
        return customKitName.length() >= MIN_NAME_SIZE && customKitName.length() <= MAX_NAME_SIZE;

    }
}
