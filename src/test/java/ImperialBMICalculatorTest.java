import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImperialBMICalculatorTest extends BaseTest {

    @Test
    public void starvationCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("11");
        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
        weightSelect.selectByVisibleText("pounds");
        Select feetSelect = new Select(driver.findElement(By.name("opt2")));
        feetSelect.selectByValue("6");
        Select inchesSelect = new Select(driver.findElement(By.name("opt3")));
        inchesSelect.selectByValue("2");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "3.11");
    }

    @Test
    public void underWeightCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("27");
        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
        weightSelect.selectByVisibleText("pounds");
        Select feetSelect = new Select(driver.findElement(By.name("opt2")));
        feetSelect.selectByValue("6");
        Select inchesSelect = new Select(driver.findElement(By.name("opt3")));
        inchesSelect.selectByValue("2");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "7.64");
    }

    @Test
    public void normalCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("30");
        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
        weightSelect.selectByVisibleText("pounds");
        Select feetSelect = new Select(driver.findElement(By.name("opt2")));
        feetSelect.selectByValue("6");
        Select inchesSelect = new Select(driver.findElement(By.name("opt3")));
        inchesSelect.selectByValue("2");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "8.49");
    }

    @Test
    public void overWeightCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("45");
        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
        weightSelect.selectByVisibleText("pounds");
        Select feetSelect = new Select(driver.findElement(By.name("opt2")));
        feetSelect.selectByValue("6");
        Select inchesSelect = new Select(driver.findElement(By.name("opt3")));
        inchesSelect.selectByValue("2");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "12.73");
    }

    @Test
    public void obeseCategoryShouldBeShown() {

        driver.get(URL1);
        driver.findElement(By.name("wg")).sendKeys("50");
        Select weightSelect = new Select(driver.findElement(By.name("opt1")));
        weightSelect.selectByVisibleText("pounds");
        Select feetSelect = new Select(driver.findElement(By.name("opt2")));
        feetSelect.selectByValue("6");
        Select inchesSelect = new Select(driver.findElement(By.name("opt3")));
        inchesSelect.selectByValue("2");
        driver.findElement(By.name("cc")).click();

        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Obese");
        String index = driver.findElement(By.name("si")).getAttribute("value");
        Assert.assertEquals(index, "14.15");
    }
}
