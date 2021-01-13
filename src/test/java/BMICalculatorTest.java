import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMICalculatorTest extends BasedTest{

    @Test
    public void starvingCategoryShouldBeShown(){
        //webdriver == браузер
        //webelement == элемент на странице
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category,"Your category is Starving");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index,"23.89");
    }

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
    }

    @Test
    public void ObeseCategoryShouldBeShown(){
        //webdriver == браузер
        //webelement == элемент на странице
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");

        driver.findElement(By.name("wg")).sendKeys("142");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category,"Your category is Obese");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index,"42.4");
    }

    @Test
    public void test(){
        //opt1

    }
}
