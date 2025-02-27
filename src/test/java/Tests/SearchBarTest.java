package Tests;

import Pages.HomePage;
import Utility.ConfigReader;
import Utility.Driver;
import org.testng.annotations.Test;
public class SearchBarTest extends TestBase{


    @Test
    public void clickOnSearchField(){
       // Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage searchBar = new HomePage();

        searchBar.getSearchField().sendKeys("test");
        System.out.println("OK");
    }
}
