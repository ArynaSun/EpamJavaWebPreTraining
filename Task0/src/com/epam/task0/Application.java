package com.epam.task0;

import com.epam.task0.reader.DataReader;
import com.epam.task0.worker.OrderWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class Application {
    private static final String RESOURSES_ORDER_TXT = "resourses/Order.txt";
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        OrderWorker orderWorker = new OrderWorker();

        List<String> data1 = reader.readData(RESOURSES_ORDER_TXT);

        orderWorker.fillOrder(data1);

    }


}

