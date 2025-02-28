package Tests;

import Pages.HomePage;
import Pages.SearchPage;
import Utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void searchValidProduct() throws InterruptedException {
        SearchPage search = new SearchPage();
        String validProduct = "Napkin";
        search.searchProduct(validProduct);

        List<WebElement> elements = search.getSearchResults();
        for (WebElement el : elements) {

            String elTitle = el.getText().toLowerCase();
            System.out.println(elTitle);
            Assert.assertTrue(elTitle.contains("napkin"));

        }
        System.out.println("Results contain " + validProduct + "in product description");

    }
}
