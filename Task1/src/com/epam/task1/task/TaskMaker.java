package com.epam.task1.task;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TaskMaker {
    static Logger logger = LogManager.getLogger();

    public void doTask(int[] strings) {
        int minLength = length(strings[0]);
        int maxLength = length(strings[0]);
        int number = 0;
        int number1 = 0;
        for (int i = 0; i < strings.length; i++) {
            if (length(strings[i]) < minLength) {
                number = i;
                minLength = length(strings[i]);
            }
        }
        for (int k = 0; k < strings.length; k++) {
            if (length(strings[k]) > maxLength) {
                number1 = k;
                maxLength = length(strings[k]);
            }
        }
        logger.log(Level.INFO, "Самое короткое число: " + strings[number]);
        logger.log(Level.INFO, "Самое длинное число: " + strings[number1]);

        for (int i = 0; i < strings.length; i++) {
            logger.log(Level.INFO, strings[i] + " length: " + length(strings[i]));
        }
    }

    public int length(int strings){
        int length = (int)(Math.log10(strings) +1);
        return length;
    }


}
