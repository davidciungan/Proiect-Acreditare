package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/logoutSuccess/")
public class LoggedOutPage extends PageObject {

    @FindBy(css="div.page-title h1")
  private  WebElementFacade loggedOutMessage;

    public String getLoggedoutMessage (){
        return loggedOutMessage.getText();
    }
}
