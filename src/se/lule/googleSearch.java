package se.lule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.*;


public class googleSearch {

    void DoSearch() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\larse\\OneDrive\\Skrivbord\\Skola\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Software Testing\n");
        element.submit();

        driver.quit();

    }
}
