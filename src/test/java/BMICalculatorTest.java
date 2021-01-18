import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest extends BaseTest {

    @Test
    public void starvationCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "14.93");
    }

    @Test
    public void underWeightCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("55");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "16.42");
    }

    @Test
    public void normalCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "23.89");
    }

    @Test
    public void overWeightCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("100");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "29.86");
    }

    @Test
    public void obeseCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("120");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "35.83");
    }
}
