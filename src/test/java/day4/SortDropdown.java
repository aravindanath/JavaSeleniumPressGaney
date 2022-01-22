package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortDropdown {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

        System.out.println("Total Lang "+lang.size());

        ArrayList<String> empty = new ArrayList<>();

        for (WebElement ele :lang) {
            empty.add(ele.getText());
        }

        System.out.println("Unsorted "+ empty);

        Collections.sort(empty);

        System.out.println("Sorted "+ empty);

        driver.quit();
    }
}
