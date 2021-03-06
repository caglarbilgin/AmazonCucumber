package base;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        PropertyConfigurator.configure("properties/log4j.properties");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.tr");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}
