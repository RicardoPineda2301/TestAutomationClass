package testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void upperCaseTest() {
        String actualResult = "Hard Assert";
        String expectedResult = "HARD ASSERT";

        Assert.assertEquals(actualResult, expectedResult);

        System.out.println("--> Hard Assertion");

    }

}
