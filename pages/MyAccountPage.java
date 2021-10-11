package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/index/")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessageParagraph;

    public String getWelcomeMessage(){

        return welcomeMessageParagraph.getText();
    }
    @FindBy(css="skip-account")
    WebElementFacade accountButton;

    @FindBy (css="li.last a[title='Log Out'")
    WebElementFacade logoutButton;

    public void clickLogout(){ clickOn(logoutButton); }


    }

