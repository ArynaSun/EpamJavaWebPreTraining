package epam.test1;


import com.epam.task1.parser.StringParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringParserTest extends Assert {
    @Test
    public void testParserPos(){
        StringParser parser = new StringParser();
        String testInput = "10 23";

        int[] numbers = parser.parseLine(testInput);

        assertEquals(10, numbers[0]);
        assertEquals(23, numbers[1]);
    }

    @Test
    public void testParserNeg(){
        StringParser parser = new StringParser();
        String testInput = "66 13";

        int[] numbers = parser.parseLine(testInput);

        assertNotEquals(44, numbers[0]);
        assertNotEquals(36, numbers[1]);
    }
}
