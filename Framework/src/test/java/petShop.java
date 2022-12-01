import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import java.util.List;
//import org.openqa.selenium.support.ui.Wait;

//import java.util.zip.CheckedInputStream;
public class petShop {
    public static void Main() throws InterruptedException {
        String BaseURL = "https://demoqa.com/books";
        // String RegisterURL = "https://demoqa.com/register";
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.id("newUser")).click();
        driver.findElement(By.id("firstname")).sendKeys("Surendra");
        driver.findElement(By.id("lastname")).sendKeys("Jupudi");
        driver.findElement(By.id("userName")).sendKeys("Surendra04");
        driver.findElement(By.id("password")).sendKeys("Surendra@04");
        Thread.sleep(10000);
        driver.findElement(By.id("register")).click();
        Actions scr = new Actions(driver);
        scr.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);

    }
}
