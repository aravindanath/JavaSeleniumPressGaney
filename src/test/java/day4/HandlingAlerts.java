package day4;


import day3.Generic;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingAlerts extends BaseClass{



    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       Thread.sleep(2000);

        Generic.acceptAlert(driver);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        Generic.dismissAlert(driver);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Generic.acceptAlert(driver,"Hello all");

      String val =   driver.findElement(By.id("result")).getText();

      System.out.println(val);

//      Alert alert =  driver.switchTo().alert();
//      System.out.println(alert.getText());
//      alert.accept();




    }


}
