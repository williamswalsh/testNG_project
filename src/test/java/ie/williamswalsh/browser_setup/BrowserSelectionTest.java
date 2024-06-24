package ie.williamswalsh.browser_setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class BrowserSelectionTest {

    private static WebDriver driver;

    @BeforeClass
    static void setUpDriver() {
        Browser browserSelection = (System.getProperty("browser") == null)? Browser.CHROME: Browser.valueOf(System.getProperty("browser"));

        switch (browserSelection) {
            case CHROME -> {
                driver = new ChromeDriver();
            }
            case FIREFOX -> {
                driver = new FirefoxDriver();
            }
            case EDGE -> {
                driver = new EdgeDriver();
            }
            default -> throw new RuntimeException("Browser selection invalid: " + browserSelection);
        }
    }

    @Test
    void actionTests() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement suggestiveDropdown = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        suggestiveDropdown.sendKeys("Ireland");
        Thread.sleep(500);
        String arrowDown = Keys.chord(Keys.ARROW_DOWN);
        String enter = Keys.chord(Keys.ENTER);
        suggestiveDropdown.sendKeys(arrowDown);
        suggestiveDropdown.sendKeys(arrowDown);
        suggestiveDropdown.sendKeys(enter);

        assertEquals("Ireland", suggestiveDropdown.getAttribute("value"));
    }

    @AfterClass
    static void tearDown() {
        driver.quit();
    }
}
