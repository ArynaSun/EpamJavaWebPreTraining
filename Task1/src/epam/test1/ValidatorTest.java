package epam.test1;

import com.epam.task1.validator.Validator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatorTest extends Assert {
    @Test
    public void testValidateFalse(){
        String testLine = "123 65gh 9k l777";

        boolean isValid = Validator.validate(testLine);

        Assert.assertFalse(isValid);
    }

    @Test
    public void testValidateTrue(){
        String testLine = "123 65 9 l777";

        boolean isValid = Validator.validate(testLine);

        Assert.assertTrue(isValid);
    }
}
