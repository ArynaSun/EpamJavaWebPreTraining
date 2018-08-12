package epam.test0;

import com.epam.task0.entity.Order;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderTest extends Assert {
    private Order order;

    @BeforeTest
    public void initOrder(){
        order = new Order();
    }

    @Test
    public void testCountCostOfKit(){
        double expectedCost = 8.0;

        double actualCost = order.countCostOfKit();

        assertEquals(actualCost, expectedCost);

    }

}
