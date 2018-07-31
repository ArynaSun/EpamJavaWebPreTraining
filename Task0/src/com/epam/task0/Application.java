package com.epam.task0;

import com.epam.task0.counter.OrderCounter;
import com.epam.task0.creator.CheckStringCreator;
import com.epam.task0.entity.*;
import com.epam.task0.parser.StringParser;
import com.epam.task0.printer.ConsolePrinter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader("resourses/Order.txt"));

        for ( int i = 0; i<2;i++){
            StringParser stringParser = new StringParser();
            ConsolePrinter consolePrinter = new ConsolePrinter();
            //logger.log(Level.INFO, "Здравствуйте! Как Вас зовут?");
            String clientName = in.nextLine();
            Order order = new Order();
            order.setClientName(clientName);
            order.setNumber(OrderCounter.getOrderNumber());
           // logger.log(Level.INFO, "Введите ингредиенты. Ваш ответ должен быть в формате:\n" +
                    //"\"название_продукта,название_продукта\" без кавычек\n" +
                   // "например: \"JELLY_BEAN,LOLLIPOPS\"");
            //consolePrinter.outIngredientsConsole();
            String ingredientsLine = in.nextLine();
            stringParser.parseIngredientsLine(ingredientsLine, order);
            //logger.log(Level.INFO, "Нужна ли вам открытка? (Y/N)");
            String hasCardLine = in.nextLine();
            stringParser.parseHasCardLine(hasCardLine, order);
            //logger.log(Level.INFO, "Введите название набора");
            String kitName = in.nextLine();
            order.getCustomKit().setKitName(kitName);
            boolean contin;
            do {
                contin = stringParser.parseNumberOfKitsLine(in, order);
            } while (contin);

            logger.log(Level.INFO, CheckStringCreator.toString(order));
        }
    }




}

