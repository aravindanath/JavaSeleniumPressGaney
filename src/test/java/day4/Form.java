package day4;


import day3.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Form extends BaseClass{



    @Test
    public void  name() throws InterruptedException {


        driver.navigate().to("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("dateOfBirthInput")).click();

       WebElement month =  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        WebElement year =  driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

        Generic.selectBYVisibleText(month,"October");
        Thread.sleep(2000);
        Generic.selectBYVisibleText(year,"1950");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='19']")).click();

    }
}
