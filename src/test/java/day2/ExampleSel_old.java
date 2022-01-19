package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class ExampleSel_old {

    public static void main(String[] args) {
        String browser = "chrome";
        WebDriver driver = null;
       // /Users/aravindanathdm/Documents/JavaSeleniumCropTrainingJan22/driver/chromedriver

        String path = System.getProperty("user.dir")+ File.separator+"driver"+File.separator+"chromedriver";

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",path);
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else{
            System.out.println("Enter correct browser");
        }

        driver.get("https://www.amazon.in");
    }
}
