package com.epam.task0.printer;

import com.epam.task0.entity.Ingredient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsolePrinter {
    static Logger logger = LogManager.getLogger();
    public  void outIngredientsConsole() {
        for (Ingredient ingredient : Ingredient.values()) {
            if (ingredient != Ingredient.BOX && ingredient != Ingredient.DECORATING) {
                logger.info(ingredient);
            }
        }
    }
}
