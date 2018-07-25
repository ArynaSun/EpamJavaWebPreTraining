package com.epam.task1.reader;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class InfoReader {

    static Logger logger = LogManager.getLogger();
    public String readLine(){
        logger.log(Level.INFO, "Введите ЧИСЛА через пробел");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

}
