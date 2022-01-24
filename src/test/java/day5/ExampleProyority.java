package day5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleProyority extends BaseDev {

    @Test(priority = 1)
    public void test1(){

        driver.get("https://www.google.com");

        String actual =  driver.getTitle();

        Assert.assertEquals(actual,"Google","Title mis match");

        System.out.println("Ending");



    }


    @Test(priority = 2)
    public void test2(){

        driver.get("https://www.amazon.com");

        String actual =  driver.getTitle();

        Assert.assertEquals(actual,"Google","Title mis match");

        System.out.println("Ending");



    }

    @Test
    public void test3(){

        driver.get("https://www.flipkart.com");

        String actual =  driver.getTitle();

        Assert.assertEquals(actual,"Google","Title mis match");

        System.out.println("Ending");



    }
}
