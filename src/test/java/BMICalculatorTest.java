import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest {

    @Test
    public void normalCategoryShouldBeShown(){
        //webdriver == браузер
        //webelement == элемент на странице
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category,"Your category is Normal");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index,"23.89");
        driver.quit();
    }
}
