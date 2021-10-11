package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
        private WebElementFacade FirstNameField;

    @FindBy(id="lastname")
        private WebElementFacade LastNameField;

    @FindBy(css="#email_address")
         private  WebElementFacade EmailAdress;

    @FindBy(id="password")
         private WebElementFacade Password;

    @FindBy(id="confirmation")
         private WebElementFacade ConfirmPassword;

    @FindBy(css="#form-validate > div.buttons-set > button > span > span")
        private WebElementFacade RegisterButton;

    @FindBy (css= "li.error-msg")
        private WebElementFacade alreadyRegEmail;

    @FindBy (css = "#advice-validate-email-email_address")
        private WebElementFacade validationMail;

    @FindBy(css= "#advice-validate-password-password")
        private WebElementFacade validationPass;

    @FindBy(css="#advice-validate-cpassword-confirmation")
        private WebElementFacade confirmPassMissmatch;

    @FindBy (css="#advice-required-entry-password")
    private WebElementFacade requiredPassword;

    @FindBy (css= "#advice-required-entry-email_address")
    private  WebElementFacade requiredEmail;


    @FindBy (css="#advice-required-entry-confirmation")
    private WebElementFacade requiredPassConfirm;

    public void setFirstNameField(String firstName){
        waitFor(FirstNameField);
        typeInto(FirstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        waitFor(LastNameField);
        typeInto(LastNameField, lastName);
    }

    public void setEmailAdress(String emailAdress){
        waitFor(EmailAdress);
        typeInto(EmailAdress, emailAdress);
    }

    public void setPassword(String password){
       waitFor(Password);
        typeInto(Password, password);
    }
    public void setConfirmPassword(String confirmPassword){
       waitFor(ConfirmPassword);
        typeInto(ConfirmPassword, confirmPassword);
    }
    public void clickRegister(){
        clickOn(RegisterButton);
    }

    public String getAlreadyRegEmail(){return alreadyRegEmail.getText();}

    public String getValidationEmail(){ return validationMail.getText();}

    public String getValidationPass(){ return validationPass.getText();}

    public String getConfirmPassError(){return confirmPassMissmatch.getText();}

    public String getRequiredUser(){return requiredEmail.getText();}

    public String getRequiredPass(){return  requiredPassword.getText();}

    public String getRequiredPassConfirm(){ return requiredPassConfirm.getText();}
}


