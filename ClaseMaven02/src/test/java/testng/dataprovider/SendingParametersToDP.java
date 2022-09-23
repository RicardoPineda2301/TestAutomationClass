package testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SendingParametersToDP {

    @Test
    public void add(int num1, int num2, int result){
        int total = num1 + num2;
        Assert.assertEquals(result, total);
    }

    @Test
    public void substract(int num1, int num2, int result){
        int total = num1 - num2;
        Assert.assertEquals(result, total);
    }

}
