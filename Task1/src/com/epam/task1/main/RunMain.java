package com.epam.task1.main;


import com.epam.task1.parser.StringParser;
import com.epam.task1.validator.Validator;
import com.epam.task1.task.TaskMaker;

public class RunMain {

    public static void main(String[] args) {
        Validator validator = new Validator();
        String input = validator.makeValidInput();
        StringParser stringParser = new StringParser();
        int[] numbers = stringParser.parseLine(input);
        TaskMaker taskmaker = new TaskMaker();
        taskmaker.doTask(numbers);

    }


}
