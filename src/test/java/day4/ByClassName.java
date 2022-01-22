package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClassName extends BaseClass{


    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.icicibank.com/#");
        driver.findElement(By.className("ic-btn")).click();
    }


}
