package com.epam.task1.validator;

import com.epam.task1.parser.StringParser;
import com.epam.task1.reader.InfoReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static final String PATTERN = "[A-Za-zА-Яа-я]+";

    public static boolean validate(String input) {
        Pattern p = Pattern.compile(PATTERN);
        Matcher m = p.matcher(input);
        return !(m.find() && m.group() != null && !m.group().isEmpty());
    }
    public String makeValidInput(){
        String input;
        boolean isNotValid;
        InfoReader infoReader = new InfoReader();
        do {
            input = infoReader.readLine();
            isNotValid = !Validator.validate(input);
        } while (isNotValid);
        return input;
    }
}