package StepDefinations;

import BasePackage.TestBaseClass;
import Pages.AddToCartPage;
import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartSetpDefinations extends TestBaseClass {
    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;
    AddToCartPage addToCartPage;


    @Given("^: Lunch the flipkart url \"([^\"]*)\"$")
    public void lunchTheFlipkartUrl(String url) {
        driver = setup(url);
    }

    @Then(": Close the login popup if its visible")
    public void closeTheLoginPopupIfItsVisible() {
        homePage = new HomePage(driver);
        homePage.closeLoginPopUpButton();
    }

    @Then(": Enter {string} in search box")
    public void enterInSearchBox(String SearchName) {
        homePage.enterNameInSearchBox(SearchName);
    }

    @And(": Click enter key from keyboard")
    public void clickEnterKeyFromKeyboard() {
        homePage.sendEnterKey();
    }

    @Then(": Verify that we are on {string} page from url")
    public void verifyThatWeAreOnPageFromUrl(String ExpectedPageName) {
        searchPage=new SearchPage(driver);
        Assert.assertTrue(searchPage.validatePageNameFromURL(ExpectedPageName));
    }

    @Then(": Open the first phone which displayed")
    public void openTheFirstPhoneWhichDisplayed() {
        searchPage.clickOnFirstSearchItem();
    }

    @And(": Click on {string} button")
    public void clickOnButton(String arg0) {
        addToCartPage.clickOnAddToCartButton();
    }

    @And(": Close the chrome")
    public void closeTheChrome() {
        tearDown();
    }

    @Then(": Verify that we are on ADD TO CART page from Buttons Visibility")
    public void verifyThatWeAreOnADDTOCARTPageFromButtonsVisibility() {
        addToCartPage=new AddToCartPage(driver);
        Assert.assertTrue(addToCartPage.checkAddToCartButtonVisibility());
    }
}
