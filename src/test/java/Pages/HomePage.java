package Pages;

import Utility.Driver;
import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;
@Data
public class HomePage {

    public  HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//p[@class='text-sm leading-none text-gray-900 group-hover:text-green-500 group-hover:underline mb-0 p-1 transition-all duration-75 ease-in-out mt-2 lt:mt-5' and text()='Restaurant Equipment']")
    private WebElement restaurantEquipment;
    @FindBy(xpath ="//p[@class='text-sm leading-none text-gray-900 group-hover:text-green-500 group-hover:underline mb-0 p-1 transition-all duration-75 ease-in-out mt-2 lt:mt-5' and text()='Smallwares']")
    private WebElement smallwares;

  public void clickOnFeaturedElements(WebElement element){
      if (element != null && element.isDisplayed()){
          element.click();
      }
      else{
          System.out.println("Element is not visible");
      }
  }

}
