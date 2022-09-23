package testng.listeners.itestlistener.isuitelistener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestClass {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This method runes before suite, first test class" );
    }

    @Test
    public void testCase(){
        System.out.println("Test case was executed, first test class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This method runs afer suite, first test class");
    }
}
