package Tests;

import Utility.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
protected static ExtentReports report;
protected static ExtentSparkReporter htmlReport;
protected static ExtentTest logger;



    @BeforeSuite
    public void setupReport(){
report = new ExtentReports();
String pathToHtmlFile = System.getProperty("user.dir")+"/target/extentReports/report.html";
htmlReport = new ExtentSparkReporter(pathToHtmlFile);
report.attachReporter(htmlReport);
report.setSystemInfo("Project name", "Webstaurants Framework");
report.setSystemInfo("QA name", "Joan Doe");
report.setSystemInfo("Operating System", System.getProperty("os.name"));



    }
@AfterSuite
public void tearDownReport(){
        report.flush();
}



    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.webstaurantstore.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        Driver.quitDriver();
    }

}

