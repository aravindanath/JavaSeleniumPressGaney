package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPratialLinkText extends BaseClass{


    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.google.com");

        driver.findElement(By.partialLinkText("Ima")).click();

        driver.findElement(By.name("q")).sendKeys("Bangalore city",Keys.ENTER);


    }


}
