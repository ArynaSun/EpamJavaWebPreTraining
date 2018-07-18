package com.epam.task0_tseulovich.entity;

public class OrderCounter {

    private static int orderNumber = 10000;


    public static int getOrderNumber() {
        return orderNumber++;
    }
}
