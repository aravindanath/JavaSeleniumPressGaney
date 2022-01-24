package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class SuiteTest04 extends BaseClass {

    @Test
    public void test_04() throws Exception {
        driver.get("https://www.google.com/ncr");
        Reporter.log("User is on "+ driver.getTitle());
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("BrowserStack Test 04");
        element.submit();
        Thread.sleep(7000);

        Assert.assertEquals("BrowserStack Test 04 - Google Search", driver.getTitle());
    }
}
