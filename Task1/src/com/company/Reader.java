package com.company;



import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Reader {

    static Logger logger = LogManager.getLogger();
    public static String readLine(){
        logger.log(Level.INFO, "Введите ЧИСЛА через пробел");
        Scanner scan = new Scanner(System.in);
        String userLine = scan.nextLine();
        return userLine;
    }

}
