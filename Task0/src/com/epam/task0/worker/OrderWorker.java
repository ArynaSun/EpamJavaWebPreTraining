package com.epam.task0.worker;

import com.epam.task0.counter.OrderCounter;
import com.epam.task0.creator.CheckStringCreator;
import com.epam.task0.entity.Order;
import com.epam.task0.parser.StringParser;
import com.epam.task0.printer.ConsolePrinter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OrderWorker {
    static Logger logger = LogManager.getLogger();

    public void fillOrder(List<String> data) throws IOException {
        StringParser stringParser = new StringParser();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        File file = new File("resourses/Output.txt");

        if (!file.exists())
            file.createNewFile();
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //logger.log(Level.INFO, "Здравствуйте! Как Вас зовут?");

        for (int i = 0; i < data.size(); i ++) {
            Order order = new Order();
            order.setClientName(data.get(i++));
            order.setNumber(OrderCounter.getOrderNumber());
            // logger.log(Level.INFO, "Введите ингредиенты. Ваш ответ должен быть в формате:\n" +
            //"\"название_продукта,название_продукта\" без кавычек\n" +
            // "например: \"JELLY_BEAN,LOLLIPOPS\"");
            //consolePrinter.outIngredientsConsole();
            try {
                stringParser.parseIngredientsLine(data.get(i++), order);
            } catch (IllegalArgumentException e){
                i+= 2;
                continue;
            }
            //logger.log(Level.INFO, "Нужна ли вам открытка? (Y/N)");
            stringParser.parseHasCardLine(data.get(i++), order);
            //logger.log(Level.INFO, "Введите название набора");
            order.getCustomKit().setKitName(data.get(i++));
            try {

            order.setCountOfCustomKits(Integer.parseInt(data.get(i)));
            } catch (NumberFormatException e){
                continue;
            }
//                boolean contin;
//                do {
//                    contin = stringParser.parseNumberOfKitsLine(in, order);
//                } while (contin);

            String check = CheckStringCreator.toString(order);


            bufferedWriter.append(check);

            //logger.log(Level.INFO, check);
        }


        bufferedWriter.close();

    }

}
