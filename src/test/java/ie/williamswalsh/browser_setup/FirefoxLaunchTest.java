package ie.williamswalsh.browser_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Firefox uses the Gecko driver.
 */
public class FirefoxLaunchTest {

    private static WebDriver driver;

    @BeforeClass
    static void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/legoman/code/selenium/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    @Test
    public void getUrlEndpoint() {
        driver.get("https://rahulshettyacademy.com");
    }

    @AfterClass
    static void tearDown() {
        driver.quit();
    }
}
