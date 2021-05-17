package se.lule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;


public class adlibris {


    void DoFill() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\larse\\OneDrive\\Skrivbord\\Skola\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.adlibris.com/se");
        driver.manage().window().setSize(new Dimension(1755, 891));
        driver.findElement(By.id("q")).click();
        driver.findElement(By.id("q")).sendKeys("praktisk mjukvarutestning");
        driver.findElement(By.cssSelector(".material-icons__search")).click();
        driver.findElement(By.linkText("Praktisk mjukvarutestning")).click();
        driver.findElement(By.cssSelector(".product__add-to-cart:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".page-header__toggler > .material-icons__shopping_cart")).click();
        driver.findElement(By.linkText("Till kassan")).click();
        driver.quit();

    }   }
