package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExampleDataProvider extends BaseDev {

    @Test(dataProvider = "data" )
    public void test_01(String email, String password) throws Exception {
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Reporter.log("User is on "+ driver.getTitle());

        WebElement emailTextField = driver.findElement(By.id("Email"));
        WebElement passwordTextField = driver.findElement(By.id("Password"));

        emailTextField.clear();
        emailTextField.sendKeys(email);

        passwordTextField.clear();
        passwordTextField.sendKeys(password, Keys.ENTER);




    }


    @DataProvider
    public Object[][] data(){

        Object[][] obj = new Object[3][2];

        obj[0][0]="arvidn@dsfg.com";
        obj[0][1]="password";
        obj[1][0]="arvidn@dsfg.com";
        obj[1][1]="password";
        obj[2][0]="admin@yourstore.com";
        obj[2][1]="admin";

        return obj;

    }
}
