package com.epam.edu.aryna_tseulovich.view;

import java.util.Observer;

public interface ApplicationView extends Observer {
    void print(Object o);
}
