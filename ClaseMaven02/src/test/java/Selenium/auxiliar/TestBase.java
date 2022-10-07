package Selenium.auxiliar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.logging.*;

public class TestBase {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static final String APPLICATION_URL = "http://localhost:8081/login.html";

    private final static Logger LOGGER = Logger.getLogger(TestBase.class.getName());

    @BeforeMethod(alwaysRun = true)
    public void initDriver(){
        try{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("test-type");
            options.addArguments("disable-popup-blocking");

            driver.set(new ChromeDriver(options));

            this.getDriver().get(APPLICATION_URL);
        }catch (Exception e){
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

    public WebDriver getDriver(){
        return this.driver.get();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        try{
            if (this.getDriver() != null) this.getDriver().quit();
        } catch (Exception e){
            LOGGER.log(Level.WARNING, e.getMessage());
        }
    }

}
