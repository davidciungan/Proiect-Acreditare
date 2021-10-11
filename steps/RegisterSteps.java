package org.fasttrackit.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.PostReg;
import org.fasttrackit.pages.RegisterPage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.internal.FindsByCssSelector;


public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private PostReg postReg;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegisterPage() {

        homePage.open();
        homePage.clickAccount();
        homePage.clickRegister();
    }

    @Step
    public void setCredentials(String firstName, String lastName, String emailAdress, String password, String confirmPassword) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAdress(emailAdress);
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(confirmPassword);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegister();
    }

    @Step
    public void checkReg(String expected) {
        String message = postReg.getThanks();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkAlreadyRegEmail(String expected) {
        String message = registerPage.getAlreadyRegEmail();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkInvalidMail(String expected) {
        String message = registerPage.getValidationEmail();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkInvalidPass(String expected) {
        String message = registerPage.getValidationPass();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkConfirmPassMissmatch(String expected) {
        String message = registerPage.getConfirmPassError();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void setNoUser(String firstName, String lastName, String password, String confirmPassword) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(confirmPassword);
    }

    @Step
    public void setNoPass(String firstName, String lastName, String emailAdress, String confirmPassword) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAdress(emailAdress);
        registerPage.setConfirmPassword(confirmPassword);

    }

    @Step
    public void setNoPassConfirm(String firstName, String lastName, String emailAdress, String password) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAdress(emailAdress);
        registerPage.setPassword(password);
    }

    @Step
    public void checkNoUser(String expected) {
        String message = registerPage.getRequiredUser();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkNoPass(String expected) {
        String message = registerPage.getRequiredPass();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void checkNoPassConfirm(String expected) {
        String message = registerPage.getRequiredPassConfirm();
        Assert.assertEquals(expected, message);
    }
}


