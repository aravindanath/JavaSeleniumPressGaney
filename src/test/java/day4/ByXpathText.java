package day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpathText extends BaseClass{


    /**
     /html/body/div/div[3]/form/div/div/div/div/div[2]/input

     //Tagname[@atrribute ='value']
     //Tagname[@atrribute ='value' and @atrribute ='value']
     //Tagname[@atrribute ='value' or @atrribute ='value']
     //Tagname[contains(@atrribute ,'value')]
     //Tagname[text() ="value"]
     //Tagname[starts-with(@atrribute ,'value')]
     followwing
     preceding-
     */

    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://www.amazon.in");

        driver.findElement(By.xpath("//*[text()='Amazon Pay']")).click();


    }


}
