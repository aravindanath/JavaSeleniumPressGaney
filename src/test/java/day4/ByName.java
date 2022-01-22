package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BaseClass{


    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("iphone 13 max",Keys.ENTER);
    }


}
