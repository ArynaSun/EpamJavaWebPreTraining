package com.epam.task0_tseulovich.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Time;

public class Order { // 1.1.1
    private int number;
    private int countOfCustomKits;
    private String clientName;
    private CustomKit customKit;
    private Time localTime;
    private static final String example = "Ivanov AA";
    private static final int a = 0;
    Logger logger = LogManager.getLogger();

    public Order() {
        customKit = new CustomKit();//1.1.2
        clientName = example;
        number = a;
    }


    public int getCountOfCustomKits() {
        return countOfCustomKits;
    }

    public void setCountOfCustomKits(int countOfCustomKits) {
        this.countOfCustomKits = countOfCustomKits;
    }

    public int getNumber() {

        return number;
    }

    public String getClientName() {

        return clientName;
    }

    public CustomKit getCustomKit() {
        return customKit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setCustomKit(CustomKit customKit) {
        this.clientName = clientName;
    }

    public void outAttributes() {//1.1.5
        logger.log(Level.INFO,("[" + number + ": " + clientName + ": " + customKit.getKitName() + ": " + countOfCustomKits + "]"));
    }

    public double countCostOfKit() {
        double answer = 0;
        for (IngredientEnum ingredientEnum : customKit.getIngredients()) {
            answer+= ingredientEnum.getPrice();
        }
        return answer;
    }
}
