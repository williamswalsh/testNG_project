package ie.williamswalsh.browser_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EdgeLaunchTest {

    private static WebDriver driver;

    @BeforeClass
    static void setUp() {
        System.setProperty("webdriver.edge.driver", "/Users/legoman/code/selenium/drivers/edge_driver_m1_mac");
        driver = new EdgeDriver();
    }

    @Test
    void getUrlEndpoint() {
        driver.get("https://rahulshettyacademy.com");
    }

    @AfterClass
    static void tearDown() {
        driver.quit();
    }
}
