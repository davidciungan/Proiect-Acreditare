package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css=".fieldset h2")
    WebElementFacade alreadyRegistered;

    @FindBy (css= "#advice-required-entry-pass")
    private WebElementFacade requiredPass;

    @FindBy (css= "#advice-required-entry-email")
    private WebElementFacade requiredUser;

    @FindBy (css="#advice-validate-email-email")
    private WebElementFacade validEmail;

    @FindBy (css= "#advice-validate-password-pass")
    private WebElementFacade validPass;

    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField, email);
    }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void clickLogin(){
        clickOn(loginButton);
    }

    public String getAlready (){
        return alreadyRegistered.getText();
    }

    public String getRequiredPass (){ return requiredPass.getText(); }

    public String getRequiredUser(){ return requiredUser.getText(); }

    public String getValidUser (){ return validEmail.getText(); }

    public String getValidPass(){ return validPass.getText(); }
}
