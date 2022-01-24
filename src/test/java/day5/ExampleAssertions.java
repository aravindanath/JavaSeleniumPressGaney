package day5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleAssertions extends BaseDev {

    @Test
    public void test1(){

        driver.get("https://www.google.com");

        String actual =  driver.getTitle();

        Assert.assertEquals(actual,"Google","Title mis match");

        System.out.println("Ending");



    }

}
