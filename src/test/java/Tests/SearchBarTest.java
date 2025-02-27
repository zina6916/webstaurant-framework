package Tests;

import Pages.HomePage;
import Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SearchBarTest extends TestBase{


    @Test
    public void clickOnSearchField(){
       // Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePage searchBar = new HomePage();

        searchBar.getSearchField().sendKeys("test");
        System.out.println("OK");
    }
    
    @Test
    public void characterInput(){
        HomePage input = new HomePage();
        String key ="####" ;
        input.getSearchField().sendKeys(key, Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class='padded']")).getText().contains("Sorry, we couldn't find any matches for "+"\""+key+"\"" ));
    }
}
