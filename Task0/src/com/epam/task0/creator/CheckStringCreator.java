package com.epam.task0.creator;

import com.epam.task0.entity.Ingredient;
import com.epam.task0.entity.Order;

public class CheckStringCreator {

    public  static String toString(Order a) {
        String answer =
                "\n*****************\n"+
                        "Заказ: "+a.getNumber() +"\n"+
                        "Клиент: "+a.getClientName()+"\n"+
                        "Название: "+a.getCustomKit().getKitName()+"\n"+
                        "-----------------\n";
        for (Ingredient ingredient : a.getCustomKit().getIngredients()) {
            answer += ingredient.getName() + " " + ingredient.getPrice()+ "€\n";
        }
        answer+=
                "-----------------\n"+
                        "Всего: " + a.countCostOfKit()+"€\n"+
                        "Количество: "+a.getCountOfCustomKits()+"\n"+
                        "-----------------\n"+
                        "Общая сумма: "+a.countCostOfKit()*a.getCountOfCustomKits()+"€\n"+
                        "*****************\n";
        return answer;
    }

}
