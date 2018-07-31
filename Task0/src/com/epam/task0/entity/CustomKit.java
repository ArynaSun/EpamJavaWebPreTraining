package com.epam.task0.entity;

import com.epam.task0.validator.CustomKitValidator;

public class CustomKit {
    private String kitName;
    private Ingredient[] ingredients = new Ingredient[0];
    private boolean hasCard;
    private static final String DEFAULT_KIT_NAME = "Client ";

    public CustomKit(){
        addIngredient(Ingredient.DECORATING);
        addIngredient(Ingredient.BOX);
    }

    public String getKitName() {
        return kitName;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public boolean hasCard(){
        return hasCard;
    }

    public void setKitName(String kitName) {
        if (CustomKitValidator.validateName(kitName)) {
            this.kitName = kitName;
        } else {
            this.kitName = DEFAULT_KIT_NAME;
            for (Ingredient ingredient : ingredients) {
                this.kitName += ingredient.getName();
            }
        }
    }

    public void setIngredientsEnum(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
     public void setHasCard(boolean hasCard){
        this.hasCard = hasCard;
     }
     
    public void addIngredient(Ingredient ingredient) {
        Ingredient[] newArray = new Ingredient[ingredients.length + 1];
        for (int i = 0; i < ingredients.length; i++) {
            newArray[i] = ingredients[i];
        }
        newArray[ingredients.length] = ingredient;
        ingredients = newArray;
    }

    public void remove(Ingredient ingredient) {
        int i = 0;
        do{
            if (ingredient.equals(ingredients[i])){
                remove(i);
                break;
            }
            i++;
        }while (i<ingredients.length);
    }

    public void remove(int i) {
        Ingredient[] newArray = new Ingredient[ingredients.length - 1];
        for (int j = 0; j < newArray.length; j++) {
            if (j != i) {
                newArray[j] = ingredients[j];
            }
        }
        ingredients = newArray;
    }
}
