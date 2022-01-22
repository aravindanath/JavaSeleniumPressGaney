package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class OpenFirefox {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");


    }
}
