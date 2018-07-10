package com.epam.edu.aryna_tseulovich.model.entity;

public class Order {
    private int number;
    private String clientName;
    private CustomKit customKit;


    public int getNumber() {
        return number;
    }

    public String getClientName() {
        return clientName;
    }

    public CustomKit getCustomKit() {
        return customKit;
    }
}
