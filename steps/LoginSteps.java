package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private FailPage failPage;
    private LoggedOutPage loggedOutPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();
    }

    @Step
    public void setCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPassField(password);
    }

    @Step
    public void setUser(String email){
        loginPage.setEmailField(email);
    }
    @Step
    public void setPass(String password){
        loginPage.setPassField(password);
    }
    @Step
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step
    public void checkLoggedIn(String expected){
        String message = myAccountPage.getWelcomeMessage();
        Assert.assertEquals(expected, message);
    }

    @Step
    public void login(String email, String pass, String username) {
        navigateToLoginPage();
        setCredentials(email, pass);
        clickLogin();
        checkLoggedIn(username);
    }
    @Step
    public void checkFailLogin(String expected){
        String message = failPage.getErrorMessage();
       Assert.assertEquals(expected, message);
    }
    @Step
    public void logOut(){

        myAccountPage.clickLogout();
    }
    @Step
    public void clickAccount(){
        homePage.clickAccount();
}
    @Step
    public void checkLogout(String expected){
        String message =loggedOutPage.getLoggedoutMessage();
        Assert.assertEquals(expected,message);
    }
    @Step
   public void checkRequiredPassword(String expected){
        String message = loginPage.getRequiredPass();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void checKRequiredUser(String expected){
        String message =loginPage.getRequiredUser();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void checkInvalidUser(String expected){
        String message = loginPage.getValidUser();
        Assert.assertEquals(expected,message);
    }

    @Step
    public void checkInvalidPass(String expected){
        String message = loginPage.getValidPass();
        Assert.assertEquals(expected,message);
    }
}
