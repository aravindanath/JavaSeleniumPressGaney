package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends BaseClass{


    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.google.com");

       List<WebElement> links =  driver.findElements(By.tagName("a"));

       System.out.println("Total Links "+ links.size());


       for(WebElement element : links){
           System.out.println(element.getText() +" ---> "+ element.getAttribute("href"));
       }

    }


}
