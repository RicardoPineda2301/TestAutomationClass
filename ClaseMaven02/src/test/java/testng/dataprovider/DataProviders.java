package testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "two-numbers-addup")
    public Object[][] twoNumbersAddUp(){
        return new Object[][] {{2,3,5}, {4,3,7}, {2,4,9}};
}}
