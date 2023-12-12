package Pages;

import BasePackage.TestBaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBaseClass {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
    WebElement FirstSearchItem;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean validatePageNameFromURL(String ExpectedPageName) {
        if (searchNameInURL(ExpectedPageName).equals("Present")) {
            return true;
        }
        return false;
    }

    public void clickOnFirstSearchItem() {
        //Get the list of window handles
        FirstSearchItem.click();
        //Clicking on this window
        for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
            driver.switchTo().window(winHandle);        // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
    }
}
