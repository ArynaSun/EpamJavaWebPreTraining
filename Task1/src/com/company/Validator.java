package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean validate(String userLine) {
        String pattern = "[A-Za-zА-Яа-я]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(userLine);
        return !m.find();
    }
    @Test
    public void testValidate(){
        Assert.assertFalse(validate("123 65 9 l777jj"));
    }
}
