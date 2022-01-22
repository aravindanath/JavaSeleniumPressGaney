package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class OpenChrome {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


    }
}
