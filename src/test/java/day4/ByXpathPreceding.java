package day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpathPreceding extends BaseClass{


    /**
     /html/body/div/div[3]/form/div/div/div/div/div[2]/input

     //Tagname[@atrribute ='value']
     //Tagname[@atrribute ='value' and @atrribute ='value']
     //Tagname[@atrribute ='value' or @atrribute ='value']
     //Tagname[contains(@atrribute ,'value')]
     //Tagname[text() ="value"]
     //Tagname[starts-with(@atrribute ,'value')]
     followwing
     preceding-
     */

    @Test
    public void  name() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/tables");

        String com [] ={"John","Frank","Tim"};

        for (String c : com){
            String val =  driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+c+"')]//preceding-sibling::td")).getText();
            System.out.println(c+" ---> "+val);


        }







    }


}
