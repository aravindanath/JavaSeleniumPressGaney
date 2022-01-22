package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BycssLinks extends BaseClass{


    /*
    ^ is starts with
     */
    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Mens watch",Keys.ENTER);
        Thread.sleep(2000);

      List<WebElement>  title =  driver.findElements(By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal"));

      for(WebElement ele : title){
          System.out.println(ele.getText());
      }


    }


}
