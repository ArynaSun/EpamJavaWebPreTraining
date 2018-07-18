package com.epam.task0_tseulovich.entity;

public enum IngredientEnum {
    CHOCOLATE_FIGURES("Шоколаднные фигурки", 8),//лучше английский
    PLATES_CHOCOLATE_WHITE("Слитки белого шоколада", 10),
    PLATES_CHOCOLATE_MILK("Слитки молочного шоколада", 10),
    PLATES_CHOCOLATE_BLACK("Слитки черного шоколада", 10),
    LOLLIPOPS("Леденцы", 3),
    CHOCOLATE_CEREALS("Шоколадные хлопья", 4),
    CANDIES_BOX("Коробка конфет", 8),
    CHUPA_CHUPS("Чупа-чупс", 1),
    LIQUEUR_CANDIES("Конфеты с ликером", 9),
    JELLY_BEAN("Жевательные конфеты", 5),
    BOX("Обычная коробка", 3),
    DECORATING("Украшения и ленточки", 5);

    private String name;
    private double price;

    IngredientEnum(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

