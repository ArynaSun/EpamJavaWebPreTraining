package com.epam.task0_tseulovich;

import com.epam.task0_tseulovich.entity.CheckStringCreator;
import com.epam.task0_tseulovich.entity.IngredientEnum;
import com.epam.task0_tseulovich.entity.Order;
import com.epam.task0_tseulovich.entity.OrderCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Application {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            logger.log(Level.INFO, "Здравствуйте! Как Вас зовут?");
            String clientName = in.nextLine();
            Order order = new Order();
            order.setClientName(clientName);
            order.setNumber(OrderCounter.getOrderNumber());
            logger.log(Level.INFO, "Введите ингредиенты. Ваш ответ должен быть в формате:\n" +
                    "\"название_продукта,название_продукта\" без кавычек\n" +
                    "например: \"JELLY_BEAN,LOLLIPOPS\"");
            outIngredientsConsole();
            String ingredientsLine = in.nextLine();
            parseIngredientsLine(ingredientsLine, order);
            logger.log(Level.INFO, "Нужна ли вам открытка? (Y/N)");
            String hasCardLine = in.nextLine();
            parseHasCardLine(hasCardLine, order);
            logger.log(Level.INFO, "Введите название набора");
            String kitName = in.nextLine();
            order.getCustomKit().setKitName(kitName);
            String contin;
            do {//1.1.4
                logger.log(Level.INFO, "Введите количество набора");
                int countOfCustomKits = in.nextInt();
                order.setCountOfCustomKits(countOfCustomKits);
                Logger logger5 = LogManager.getLogger();
                logger.log(Level.INFO, "Желаете изменить количество? (Y/N)");
                contin = in.nextLine();
                System.out.println();
            } while (contin.toUpperCase().equals("Y"));

            logger.log(Level.INFO, CheckStringCreator.toString(order));
        }
    }

    private static void parseHasCardLine(String hasCardLine, Order order) {
        if (hasCardLine != null && hasCardLine.toUpperCase().equals("Y")) {
            order.getCustomKit().setHasCard(true);
        }
    }

    private static void parseIngredientsLine(String ingredientsLine, Order order) {
        String[] ar1 = ingredientsLine.split(",");
        for (int i = 0; i < ar1.length; i++) {
            order.getCustomKit().addIngredient(IngredientEnum.valueOf(ar1[i].toUpperCase()));
        }
    }


    public static void outIngredientsConsole() {
        for (IngredientEnum ingredientEnum : IngredientEnum.values()) {
            if (ingredientEnum != IngredientEnum.BOX && ingredientEnum != IngredientEnum.DECORATING) {
                logger.info(ingredientEnum);
            }
        }
    }
}

