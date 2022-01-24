package day5;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.*;

public class ExtentReport {



    ExtentReports extent;
    ExtentSparkReporter spark;
    @BeforeTest
    public void setup(){
        extent = new ExtentReports();
        spark =new ExtentSparkReporter("index.html");
        extent.attachReporter(spark);

        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation reports");
        spark.config().setReportName("Arvind");




    }


    @Test
    public void test1(){
        ExtentTest test = extent.createTest("test1");
        test.info("This is a info");
        test.warning("This is a warning");
        test.pass("This is a pass");

    }


    @Test
    public void test2(){
        ExtentTest test = extent.createTest("test2");
        test.info("This is a info");
        test.warning("This is a warning");
        test.pass("This is a pass");
        test.fail("This is a fail");
    }
    @AfterTest
    public void teardown(){


        extent.flush();
    }
}
