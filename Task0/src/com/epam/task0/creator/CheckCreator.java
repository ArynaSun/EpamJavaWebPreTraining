package com.epam.task0.creator;

import com.epam.task0.entity.Ingredient;
import com.epam.task0.entity.Order;

public class CheckCreator {

    public  static String toString(Order order) {
        StringBuilder check =
                new StringBuilder("\n*****************\n" +
                        "Заказ: " + order.getNumber() + "\n" +
                        "Клиент: " + order.getClientName() + "\n" +
                        "Название: " + order.getCustomKit().getKitName() + "\n" +
                        "-----------------\n");
        for (Ingredient ingredient : order.getCustomKit().getIngredients()) {
            check.append(ingredient.getName()).append(" ").append(ingredient.getPrice()).append("€\n");
        }
        check.append("-----------------\n" + "Всего: ")
                .append(order.countCostOfKit())
                .append("€\n").append("Количество: ")
                .append(order.getCountOfCustomKits())
                .append("\n").append("-----------------\n")
                .append("Общая сумма: ")
                .append(order.countCostOfKit() * order.getCountOfCustomKits())
                .append("€\n").append(order.getLocalTime().toString())
                .append("\n*****************\n");
        return check.toString();
    }

}
