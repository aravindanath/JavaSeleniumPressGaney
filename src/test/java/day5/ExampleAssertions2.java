package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleAssertions2 extends BaseDev {

    @Test
    public void test1(){

        driver.get("https://www.google.com");

        String actual =  driver.getTitle();

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(actual,"Google","Title mis match");

        WebElement signin = driver.findElement(By.xpath("//*[text()='Sign in']"));

        System.out.println("Sign in button "+ signin.isDisplayed());
        sf.assertTrue(signin.isDisplayed(),"Sign in is not displayed");
        sf.assertAll();
        System.out.println("Ending");





    }

}
