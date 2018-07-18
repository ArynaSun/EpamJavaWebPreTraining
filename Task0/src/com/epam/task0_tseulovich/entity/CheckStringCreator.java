package com.epam.task0_tseulovich.entity;

public class CheckStringCreator {

    public String toString(Order a) {//в отдельный класс засунуть
        String answer =
                "*****************\n"+
                        "Заказ: "+a.getNumber() +"\n"+
                        "Клиент: "+a.getClientName()+"\n"+
                        "Название: "+a.getCustomKit().getKitName()+"\n"+
                        "-----------------\n";
        for (IngredientEnum ingredientEnum : a.getCustomKit().getIngredients()) {
            answer += ingredientEnum.getName() + " " + ingredientEnum.getPrice()+ "€\n";
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
