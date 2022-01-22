package day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpathFollowing extends BaseClass{


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
        driver.navigate().to("https://www.moneycontrol.com/markets/global-indices/");

        String com [] ={"GOLD","SILVER","COTTON"};

        for (String c : com){
            String val =  driver.findElement(By.xpath("(//table[@class='mctable1'])[3]/tbody/tr/td/p/a[contains(text(),'"+c+"')]//following::td[1]")).getText();
            System.out.println(c+" ---> "+val);


        }







    }


}
