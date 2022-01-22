package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpathStartWith_css extends BaseClass{


    /*
    ^ is starts with
     */
    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        driver.findElement(By.cssSelector("input[id^='two']")).sendKeys("Smart Watch", Keys.ENTER);


    }


}
