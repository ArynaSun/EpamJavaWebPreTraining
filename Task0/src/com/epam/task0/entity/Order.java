package com.epam.task0.entity;

import com.epam.task0.counter.OrderCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Time;
import java.time.LocalTime;

public class Order {
    private static Logger logger = LogManager.getLogger();

    private int number;
    private int countOfCustomKits;
    private String clientName;
    private CustomKit customKit;
    private LocalTime localTime;


    public Order() {
        customKit = new CustomKit();
        clientName = OrderCounter.DEFAULT_NAME;
        number = OrderCounter.DEFAULT_NUMBER;
        localTime = LocalTime.now();
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

    public LocalTime getLocalTime() {
        return localTime;
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

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }


    public void printOrderToConsole() {
        logger.log(Level.INFO, ("[" + number + ": " + clientName + ": " + customKit.getKitName() + ": " + countOfCustomKits + "]"));
    }

    public double countCostOfKit() {
        double answer = 0;
        for (Ingredient ingredient : customKit.getIngredients()) {
            answer += ingredient.getPrice();
        }
        return answer;
    }
}
