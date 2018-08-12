package com.epam.task0.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    static Logger logger = LogManager.getLogger();
    public List<String> readData(String fileName){
        List<String> data =   new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
             Scanner scan = new Scanner(fileReader)) {
            while (scan.hasNextLine()) {
                data.add(scan.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.info(e.toString());
        }

        return data;
    }
}
