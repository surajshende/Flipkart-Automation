package Pages;

import BasePackage.TestBaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class AddToCartPage extends TestBaseClass {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
    WebElement AddToCartButton;
    public AddToCartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean checkAddToCartButtonVisibility(){

        if(AddToCartButton.isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickOnAddToCartButton(){
        AddToCartButton.click();
        //Clicking on this window
        for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
            driver.switchTo().window(winHandle);        // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }

    }
}
