package com.company;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {//вывести тестами

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        String userLine;
        do {
            userLine = Reader.readLine();
        } while (!Validator.validate(userLine));
        int[] myString = Parser.parseLine(userLine);
        doTask(myString);
    }

    private static void doTask(int[] myString) {
        int minLength = length(myString[0]);
        int maxLength = length(myString[0]);
        int number = 0;
        int number1 = 0;
        for (int i = 0; i < myString.length; i++) {
            if (length(myString[i]) < minLength) {
                number = i;
                minLength = length(myString[i]);
            }
        }
        for (int k = 0; k < myString.length; k++) {
            if (length(myString[k]) > maxLength) {
                number1 = k;
                maxLength = length(myString[k]);
            }
        }
        logger.log(Level.INFO, "Самое короткое число: " + myString[number]);
        logger.log(Level.INFO, "Самое длинное число: " + myString[number1]);

        for (int i = 0; i < myString.length; i++) {
            logger.log(Level.INFO, myString[i] + " length: " + length(myString[i]));
        }
    }

    public static int length(int myString){
        int length = (int)(Math.log10(myString) +1);
        return length;
    }
}
