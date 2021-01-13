import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasedTest {
    WebDriver driver;
    public static final String URL = "https://healthunify.com/bmicalculator/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown () {
        if (driver != null) {
            driver.quit();
        }
    }
}
