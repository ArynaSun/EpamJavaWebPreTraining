package com.epam.task0.counter;

public class OrderCounter {

    private static int orderNumber = 10000;
    public static final int DEFAULT_NUMBER = 0;
    public static final String DEFAULT_NAME = "Ivanov AA";
    public static int getOrderNumber() {
        return orderNumber++;
    }
}
