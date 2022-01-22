package day4;


import day3.Generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class FileUploadAndDownload extends BaseClass{



    @Test
    public void  name() throws InterruptedException {


        driver.navigate().to("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("/Users/aravindanathdm/Documents/JavaSeleniumCropTrainingJan22/screenshot.png");

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(2000);

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("screenshot.png")).click();


    }


}
