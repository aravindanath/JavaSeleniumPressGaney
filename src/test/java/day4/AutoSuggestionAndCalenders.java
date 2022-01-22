package day4;


import day3.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class AutoSuggestionAndCalenders extends BaseClass{



    @Test
    public void  name() throws InterruptedException {


        driver.navigate().to("https://www.redbus.in/");

        driver.findElement(By.id("src")).sendKeys("Bang");
        Thread.sleep(2000);
        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']/li"));
        System.out.println("Total pickup "+ src.size() );

        for(WebElement ele : src){
            if(ele.getText().equals("White Field, Bangalore")){
                ele.click();
                break;
            }
        }

        driver.findElement(By.id("dest")).sendKeys("Kukatpally, Hyderabad");

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        List<WebElement> cal = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

        for(WebElement c : cal){
            if(!c.getText().equals("Feb 2022")){
               driver.findElement(By.xpath("//button[text()='>']")).click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> nxtMonth = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));

        for(WebElement c : nxtMonth){
            if(c.getText().equals("28")){
                c.click();
                break;
            }
        }

        Thread.sleep(2000);

        driver.findElement(By.id("search_btn")).click();
    }


}
