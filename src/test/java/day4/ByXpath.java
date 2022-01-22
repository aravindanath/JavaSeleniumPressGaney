package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByXpath extends BaseClass{


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
        driver.navigate().to("https://www.google.com");

        driver.findElement(By.xpath("//input[@name ='q' or @class='gLFyf gsfi']")).sendKeys("iphoen ", Keys.ENTER);


    }


}
