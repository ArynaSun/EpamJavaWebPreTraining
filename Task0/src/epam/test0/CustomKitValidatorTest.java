package epam.test0;

import com.epam.task0.validator.CustomKitValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CustomKitValidatorTest {
    private CustomKitTest customKitTest;

    @BeforeTest
    public void initCustomKitValidator(){
        customKitTest = new CustomKitTest();
    }

    @Test(dataProvider = "dataProvider")
    public void testValidateName(String str, boolean expected){
        boolean actual = CustomKitValidator.validateName(str);

        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name="dataProvider")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"Hello", false},
                {"jiojyuoi", true}
        };
    }


}
