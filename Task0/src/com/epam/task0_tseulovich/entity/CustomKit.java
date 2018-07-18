package com.epam.task0_tseulovich.entity;

import com.epam.task0_tseulovich.validator.CustomKitNameValidator;

public class CustomKit {
    private String kitName;
    private IngredientEnum[] ingredients = new IngredientEnum[0];
    private boolean hasCard;
    private static final String exampleKitName = "Client ";

    public CustomKit(){
        addIngredient(IngredientEnum.DECORATING);
        addIngredient(IngredientEnum.BOX);
    }

    public String getKitName() {
        return kitName;
    }

    public IngredientEnum[] getIngredients() {
        return ingredients;
    }

    public boolean hasCard(){
        return hasCard;
    }

    public void setKitName(String kitName) {
        if (CustomKitNameValidator.validate(kitName)) {
            this.kitName = kitName;
        } else {
            this.kitName = exampleKitName;
            for (IngredientEnum ingredient : ingredients) {
                this.kitName += ingredient.getName();
            }
        }
    }

    public void setIngredientsEnum(IngredientEnum[] ingredients) {
        this.ingredients = ingredients;
    }
     public void setHasCard(boolean hasCard){
        this.hasCard = hasCard;
     }
     
    public void addIngredient(IngredientEnum ingredient) {
        IngredientEnum[] newArray = new IngredientEnum[ingredients.length + 1];
        for (int i = 0; i < ingredients.length; i++) {
            newArray[i] = ingredients[i];
        }
        newArray[ingredients.length] = ingredient;
        ingredients = newArray;
    }

    public void remove(IngredientEnum ingredient) {
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
        IngredientEnum[] newArray = new IngredientEnum[ingredients.length - 1];
        for (int j = 0; j < newArray.length; j++) {
            if (j != i) {
                newArray[j] = ingredients[j];
            }
        }
        ingredients = newArray;
    }
}
