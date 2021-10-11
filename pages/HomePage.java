package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerButton;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "div.input-box button")
    private WebElement searchIcon;

   @FindBy (css=".nav-2")
   private  WebElementFacade menButton;

   @FindBy (css=".nav-1")
    private WebElementFacade   womenButton;

    @FindBy(css= ".nav-5 ")
    private WebElementFacade saleButton;


    public void clickAccount() {
        clickOn(accountLink);
    }

    public void clickLogin() {
        clickOn(loginLink);
    }

    public void clickRegister() {
        clickOn(registerButton);
    }

    public void setSearchField(String value) {
        waitFor(searchField);
        typeInto(searchField, value);
    }

    public void clickSearch(){
        clickOn(searchIcon);
    }

    public void clickSale(){ clickOn(saleButton);}

    public void clickWomen(){ clickOn(womenButton);}

    public void clickMen(){ clickOn(menButton); }

}
