package ie.williamswalsh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersExamples {

    WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    @Parameters({"testng_browser","url"})
    void setup(String browser, String app) {

        if(browser.equalsIgnoreCase("CHROME")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FIREFOX")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("EDGE")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Browser selection invalid: " + browser);
        }

        driver.get(app);    // "https://opensource-demo.orangehrmlive.com/"
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void testLogoPresence() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']")));
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

//        If logo is present:
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page.");
    }

    @Test
    public void testHomePageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(expectedTitle, actualTitle, "Title is not matched.");
    }

    @AfterClass
    public void teardown() {
//        .quit()  - Closes all windows not just the window in focus:
//        .close() - Closes only the currently focused window.
        driver.quit();
    }
}
