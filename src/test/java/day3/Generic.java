package day3;

import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;

public class Generic {



    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"data"+File.separator+"config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
           value= prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
      return value;
    }


    public static void acceptAlert(WebDriver driver){
        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    public static void dismissAlert(WebDriver driver){
        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }


    public static void acceptAlert(WebDriver driver,String text){
        Alert alert =  driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys(text);
        alert.accept();
    }


    public static void mouseHover(WebDriver driver, WebElement element){
        Actions act = new Actions(driver) ;
        act.moveToElement(element).build().perform();
    }
    public static void click(WebDriver driver, WebElement element){
        Actions act = new Actions(driver) ;
        act.click(element).build().perform();
    }

    public static void dragNDrop(WebDriver driver, WebElement element1,WebElement element2){
        Actions act = new Actions(driver) ;
        act.dragAndDrop(element1,element2).build().perform();
    }

    public static void rightClick(WebDriver driver, WebElement element){
        Actions act = new Actions(driver) ;
        act.contextClick(element).build().perform();
    }


    public static void takeScreenshot(WebDriver driver){
        try {
            TakesScreenshot srcShot = ((TakesScreenshot) driver);
            File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./screenshot.png");
            FileUtils.copyFile(srcFile, destFile);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void scroll(WebDriver driver,WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();",element);

    }


    public static void highlight(WebDriver driver,WebElement element){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",element);

    }


    public static void selectBYValue( WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectBYVisibleText( WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void selectBYIndex( WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void assertText(WebElement element, String expectedText){
        Assert.assertEquals(element.getText(),expectedText,"Actual vs Excepted not match");
    }

    public static void assertTitle(WebDriver driver, String expectedText){
        Assert.assertEquals(driver.getTitle(),expectedText,"Actual title  vs Excepted title not match");
    }


    public static String fullname(){
        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().fullName();
        return fn;

    }


    public static String emailsIds(){
        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().fullName();
        return fn.trim().replace(" ","").replace(".","")+"@testmail.com";

    }
}


