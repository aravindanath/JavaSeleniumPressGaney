package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ById_Css extends BaseClass{

    /*
         # is ID in CSS
     */

    @Test
    public void id() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }


}
