package epam.test0;

import com.epam.task0.entity.CustomKit;
import com.epam.task0.entity.Ingredient;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomKitTest extends Assert {
    private CustomKit customKit;

    @BeforeTest
    public void initCustomKit(){
        customKit = new CustomKit();
    }
    @Test
    public void testSetKitName(){
        String kitName = "test";

        customKit.setKitName(kitName);

        assertFalse(customKit.getKitName().equals(kitName));
    }


    @Test
    public void testAddIngredient(){
        Ingredient ingredient = Ingredient.LOLLIPOPS;

        customKit.addIngredient(ingredient);

        assertTrue(customKit.contains(ingredient));
    }

    @Test
    public void testRemove(){
        Ingredient ingredient = Ingredient.BOX;

        customKit.remove(ingredient);

        assertFalse(customKit.contains(ingredient));
    }
}
