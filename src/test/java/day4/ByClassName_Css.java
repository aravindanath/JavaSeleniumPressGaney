package day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByClassName_Css extends BaseClass{

    /**
     *
     * . Class in CSS
     */

    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.icicibank.com/#");
        driver.findElement(By.cssSelector(".ic-btn")).click();
    }


}
