package com.epam.edu.aryna_tseulovich.view;

import java.util.Observable;

public class ConsoleView implements ApplicationView {
    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void print(Object o) {
        System.out.println(o);
    }
}
