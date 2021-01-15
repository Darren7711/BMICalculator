import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalculatorTest extends BaseTest {

    @Test
    public void starvationCategoryShouldBeShown() {

        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "14.93");

        driver.findElement(By.cssSelector("[data-qa='search-input']"));
    }

    @Test
    public void normalCategoryShouldBeShown() {

        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "23.89");
    }

    @Test
    public void overweightCategoryShouldBeShown() {

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

        driver.findElement(By.name("wg")).sendKeys("120");
        driver.findElement(By.name("ht")).sendKeys("183");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "35.83");
    }

//    @Test
//    public void chosePounds() {
//        driver.findElement(By.name("wg")).sendKeys("120");
//        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
//        weightSelect.selectByVisibleText("pounds");
//    }
//
//    @Test
//    public void choseFeet() {
//        Select weightSelect = new Select(driver.findElement(By.name("opt2")));
//        weightSelect.selectByVisibleText("6'");
//    }
//
//    @Test
//    public void choseInches() {
//        Select weightSelect = new Select(driver.findElement(By.name("opt3")));
//        weightSelect.selectByVisibleText("2''");
//    }
}
