package com.epam.task0;

import com.epam.task0.reader.DataReader;
import com.epam.task0.worker.OrderWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Application {//обработать ноль, написать тесты,
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        OrderWorker orderWorker = new OrderWorker();

        List<String> data1 = reader.readData("resourses/Order.txt");

        orderWorker.fillOrder(data1);

    }


}

