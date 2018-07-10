package com.epam.edu.aryna_tseulovich.model.entity;

public class Pack extends Ingredient {

    private Box box = new Box();
    private Decorating decorating = new Decorating();


    public Pack() {
        super(null, 0);
    }

    @Override
    public String getName() {
        return box.getName() + " " + decorating.getName();
    }

    @Override
    public double getPrice() {
        return box.getPrice() + decorating.getPrice();
    }
}
