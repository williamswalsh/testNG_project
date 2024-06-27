package ie.williamswalsh.parallel_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTest1 {

    private static WebDriver driver;
    private static WebDriverWait wait;

//    NB: Cannot share driver instance if using parallel testing
//    @BeforeClass
//    static void setup() {
//        driver.get("https://opensource-demo.orangehrmlive.com/");
//    }


    @Test
    public void testLogoPresence() {
        System.setProperty("webdriver.chrome.driver", "/Users/legoman/code/selenium/drivers/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

//        If logo is present:
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page.");
    }

    @Test
    public void testHomePageTitle() {
        System.setProperty("webdriver.chrome.driver", "/Users/legoman/code/selenium/drivers/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(expectedTitle, actualTitle, "Title is not matched.");
    }

    @Test
    public void testHomePageTitleAgain() {
        System.setProperty("webdriver.chrome.driver", "/Users/legoman/code/selenium/drivers/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(expectedTitle, actualTitle, "Title is not matched.");
    }

    @AfterClass
    public void teardown() throws InterruptedException {
//        .quit()  - Closes all windows not just the window in focus:
//        .close() - Closes only the currently focused window.
//        driver.close();
        Thread.sleep(5000);
        driver.quit();
    }
}
