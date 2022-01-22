package day4;

import com.google.gson.Gson;
import day3.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleScroll extends BaseClass{



    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Back to top')]"));

        Generic.scroll(driver,element);
        Generic.highlight(driver,element);
        Thread.sleep(2000);

        element.click();


    }


}
