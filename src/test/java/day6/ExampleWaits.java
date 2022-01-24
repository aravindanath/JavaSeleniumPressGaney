package day6;

import day5.BaseDev;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleWaits extends BaseDev {


    @Test
    public void exampleWaits(){


        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        WebElement msg  = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(msg));

        Assert.assertEquals(msg.getText(),"Hello World!");
        System.out.println(msg.getText());



    }



}
