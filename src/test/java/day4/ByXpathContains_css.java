package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpathContains_css extends BaseClass{


    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        driver.findElement(By.cssSelector("input[id*='searchtext']")).sendKeys("Smart Watch", Keys.ENTER);


    }


}
