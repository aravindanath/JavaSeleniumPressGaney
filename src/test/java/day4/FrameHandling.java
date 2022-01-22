package day4;


import day3.Generic;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameHandling extends BaseClass{



    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");

        driver.switchTo().frame("packageListFrame");

       driver.findElement(By.linkText("java.applet")).click();

       driver.switchTo().defaultContent();

       driver.switchTo().frame("packageFrame");

       driver.findElement(By.xpath("//*[text()='AppletContext']")).click();



    }


}
