package day4;


import day3.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling extends BaseClass{



    @Test
    public void  name() throws InterruptedException {


        driver.navigate().to("https://canarabank.com/");

        System.out.println("Parent Window Title "+ driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//p[text()='LOGIN']"));

        Generic.mouseHover(driver,element);

        Thread.sleep(2000);

       String win1 =  driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='Net Banking - Canara']")).click();

        Set<String> wins = driver.getWindowHandles();

        for(String w :wins){
            System.out.println(w);
            driver.switchTo().window(w);

        }
        System.out.println("Child Window Title "+ driver.getTitle());
        Generic.takeScreenshot(driver);
        driver.close();

        driver.switchTo().window(win1);
        System.out.println("Parent Window Title "+ driver.getTitle());
        driver.close();

    }


}
