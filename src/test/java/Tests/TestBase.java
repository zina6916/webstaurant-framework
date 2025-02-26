package Tests;

import Utility.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase {
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

