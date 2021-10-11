package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class FailPage extends PageObject {

    @FindBy(css="div.page-title")
    private WebElementFacade titleLink;

    @FindBy (css= "li.error-msg")
private WebElementFacade errorMessage;

    public String getErrorMessage(){

        return errorMessage.getText();
    }

}
