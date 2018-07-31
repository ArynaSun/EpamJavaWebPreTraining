package com.epam.task0.entity;

import com.epam.task0.counter.OrderCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Time;

public class Order {
    private int number;
    private int countOfCustomKits;
    private String clientName;
    private CustomKit customKit;
    private Time localTime;
    private static  Logger logger = LogManager.getLogger();


    public Order() {
        customKit = new CustomKit();
        clientName = OrderCounter.DEFAULT_NAME;
        number = OrderCounter.DEFAULT_NUMBER;
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

    public void printOrderToConsole() {// и что-то еще
        logger.log(Level.INFO,("[" + number + ": " + clientName + ": " + customKit.getKitName() + ": " + countOfCustomKits + "]"));
    }

    public double countCostOfKit() {
        double answer = 0;
        for (Ingredient ingredient : customKit.getIngredients()) {
            answer+= ingredient.getPrice();
        }
        return answer;
    }
}
