package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExampleTest {
    private WebDriver driver;

    @Test
    public void testChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.quit();
    }

    @Test
    public void testFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.quit();
    }

    @Test
    public void testEdge() {
        System.setProperty("webdriver.edge.driver", "C:\\webdriver\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
        driver.quit();
    }
}