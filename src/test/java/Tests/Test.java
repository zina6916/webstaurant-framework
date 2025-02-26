package Tests;

import Utility.Driver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test extends TestBase {


   @org.testng.annotations.Test(groups = "smoke")
    public void  validateUrl(){
        Driver.getDriver().get("https://www.webstaurantstore.com/");
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.webstaurantstore.com/");
    }
}


