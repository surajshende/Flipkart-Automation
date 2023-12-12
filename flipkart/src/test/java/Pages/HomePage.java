package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/span")
    WebElement PopUpCloseButton;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")
    WebElement SearchBox;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void closeLoginPopUpButton() {
        if (PopUpCloseButton.isDisplayed()) {
            PopUpCloseButton.click();
        }
    }
    public void enterNameInSearchBox(String Name){
        SearchBox.sendKeys(Name);
    }
    public void sendEnterKey(){
        SearchBox.sendKeys(Keys.ENTER);
    }

}
