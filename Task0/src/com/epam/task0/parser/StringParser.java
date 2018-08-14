package com.epam.task0.parser;

import com.epam.task0.entity.Ingredient;
import com.epam.task0.entity.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class StringParser {
   static Logger logger = LogManager.getLogger();
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
        if ("Y".equalsIgnoreCase(hasCardLine)) {
            order.getCustomKit().setHasCard(true);
        }
    }
    public void parseIngredientsLine(String ingredientsLine, Order order) {
        String[] strings = ingredientsLine.split(",");
        for (int i = 0; i < strings.length; i++) {
            order.getCustomKit().addIngredient(Ingredient.valueOf(strings[i].toUpperCase()));
        }
    }

}
