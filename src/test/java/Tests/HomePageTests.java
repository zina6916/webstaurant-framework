package Tests;

import Pages.HomePage;
import Utility.ConfigReader;
import Utility.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class HomePageTests extends TestBase{

    @Test
    public void clickOnFeaturedElements(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage homePage = new HomePage();
        homePage.clickOnFeaturedElements(homePage.getSmallwares());
        Assert.assertTrue(Objects.requireNonNull(Driver.getDriver().getCurrentUrl()).contains("smallwares"));
        System.out.println("Smallwares is verified");
        Driver.getDriver().navigate().back();
        homePage.clickOnFeaturedElements(homePage.getRestaurantEquipment());
        Assert.assertTrue(Objects.requireNonNull(Driver.getDriver().getCurrentUrl()).contains("restaurant-equipment"));
        System.out.println("Restaurant Equipment is verified");
    }
}
