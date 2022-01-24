package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class SuiteTest03 extends BaseClass {

    @Test
    public void test_03() throws Exception {
        driver.get("https://www.google.com/ncr");
        Thread.sleep(5000);
        Reporter.log("User is on "+ driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("BrowserStack Test 03");
        Thread.sleep(5000);
        element.submit();
        Thread.sleep(5000);

        Assert.assertEquals("BrowserStack Test 03 - Google Search1", driver.getTitle());
    }
}
