package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseDev {

    @BeforeSuite
    public void report(){
        System.out.println("Start Report");
    }


    @AfterSuite
    public void closeReport(){
        System.out.println("Stop Report");
    }
    protected  WebDriver driver;


    String browser = "chrome";
    @BeforeClass
    public void setup(){

        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--disable-notifications");
            ops.setAcceptInsecureCerts(true);
//        ops.addArguments("--headless");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(ops);
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
