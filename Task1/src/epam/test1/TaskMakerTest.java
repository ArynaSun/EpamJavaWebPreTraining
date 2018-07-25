package epam.test1;

import com.epam.task1.task.TaskMaker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskMakerTest {
    @Test
    public void testLength(){
        TaskMaker taskMaker = new TaskMaker();
        int number = 15, expectedLength = 2;

        int actualLength = taskMaker.length(number);

        Assert.assertEquals(actualLength, expectedLength);
    }
}
