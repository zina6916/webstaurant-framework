package Pages;

import Utility.Driver;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
@Data
public class SearchPage extends HomePage {
    public  SearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@data-testid='itemDescription']")
    private List<WebElement> searchResults;



    public void searchProduct(String product){
        getSearchField().sendKeys(product, Keys.ENTER);
    }
}
