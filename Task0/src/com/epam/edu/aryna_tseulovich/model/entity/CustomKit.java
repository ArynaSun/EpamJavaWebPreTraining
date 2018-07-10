package com.epam.edu.aryna_tseulovich.model.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomKit {
    private List<Ingredient> ingredients = new ArrayList<>();
    private String name;

    public CustomKit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Ingredient ingredient){
        ingredients.add(ingredient);
    }
    public void remove(Ingredient ingredient){
        ingredients.remove(ingredient);
    }

    public Ingredient[] getIngredients(){
        return (Ingredient[]) ingredients.toArray();
    }

    public Ingredient getIngredient(int i){
        return ingredients.get(i);
    }
}
