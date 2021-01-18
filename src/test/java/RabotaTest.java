import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RabotaTest extends BaseTest {

    @Test
    public void qaJob() {
        driver.get(URL2);
        driver.findElement(By.cssSelector("[data-qa='search-input']")).sendKeys("qa engineer");
        driver.findElement(By.cssSelector("[data-qa='search-button']")).click();
        driver.findElement(By.cssSelector("[data-qa='vacancy-serp__vacancy-title'][data-position='0']")).click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String name = driver.findElement(By.cssSelector("[data-qa='vacancy-company-name']")).getText();
        System.out.println("Company name: " + name);
    }
}
