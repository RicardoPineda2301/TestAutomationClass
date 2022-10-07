package Selenium.specs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumHelloWorld {

    @Test
    public void seleniumFirstTestCase(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8081/login.html"); //pagina web que queremos abrir

        WebElement emailInput = driver.findElement(By.id("exampleInputEmail"));
        emailInput.sendKeys("example_email@test.com");

        WebElement pwdInput = driver.findElement(By.xpath("//input[@type='password']"));
        pwdInput.sendKeys("12345");

        WebElement SubmitBtn = driver.findElement(By.xpath("//a[contains(@class, 'btn-primary')]"));
        SubmitBtn.click();

        driver.close();
    }

}
