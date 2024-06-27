package ie.williamswalsh.parallel_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class ParallelTest2 {

    private static WebDriver driver;
    private static WebDriverWait wait;

    @Test(enabled = false)
    public void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/legoman/code/selenium/drivers/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.className("oxd-input")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @Test
    public void testLogoPresence() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/legoman/code/selenium/drivers/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

//        If logo is present:
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page.");
        Thread.sleep(5000);
    }
}
