package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class EampleDragNDrop extends BaseClass {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.myntra.com/");

        WebElement women = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
        WebElement shrugs = driver.findElement(By.xpath(" (//a[text()='Shrugs'])[1]"));


        Actions act = new Actions(driver) ;
        act.moveToElement(women).build().perform();

        Thread.sleep(2000);

        act.click(shrugs).build().perform();

    }

}
