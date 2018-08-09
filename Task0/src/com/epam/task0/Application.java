package com.epam.task0;

import com.epam.task0.initializer.DataInitializer;
import com.epam.task0.worker.OrderWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Application {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args){
        DataInitializer initializer = new DataInitializer();
        OrderWorker orderWorker = new OrderWorker();

        List<String> data1 = initializer.initializeData("resourses/Order.txt");
        try {
            orderWorker.fillOrder(data1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}

