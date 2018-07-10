package com.epam.edu.aryna_tseulovich.model.entity;

public class Ingredient {

    private final String name;
    private final double price;


    protected Ingredient(String name, double price){
        this.name = name;
        this.price = price;
    }


    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
