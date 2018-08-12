package com.epam.task0.parser;

import com.epam.task0.entity.Ingredient;
import com.epam.task0.entity.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class StringParser {
    Logger logger = LogManager.getLogger();
//    public boolean parseNumberOfKitsLine(Scanner in, Order order) {
//        //logger.log(Level.INFO, "Введите количество набора");
//        int countOfCustomKits = in.nextInt();
//        order.setCountOfCustomKits(countOfCustomKits);
//
//        //logger.log(Level.INFO, "Желаете изменить количество? (Y/N)");
//        String str = in.nextLine().toUpperCase();
//        return "Y".equals(str);
//    }
    public void parseHasCardLine(String hasCardLine, Order order) {
        if (hasCardLine != null && hasCardLine.toUpperCase().equals("Y")) {
            order.getCustomKit().setHasCard(true);
        }
    }
    public void parseIngredientsLine(String ingredientsLine, Order order) {
        String[] ar1 = ingredientsLine.split(",");
        for (int i = 0; i < ar1.length; i++) {
            order.getCustomKit().addIngredient(Ingredient.valueOf(ar1[i].toUpperCase()));
        }
    }

}
