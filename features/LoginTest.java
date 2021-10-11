package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest  extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, Cosmin Fast!");
    }
    @Test
    public void testWrongPassword() {

        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.Fail_Password);
        loginSteps.clickLogin();
        loginSteps.checkFailLogin("Invalid login or password.");
    }
    @Test
    public void navigateHome (){
        loginSteps.navigateToLoginPage();
    }

    @Test
    public void testWrongUser(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.Fail_User,Constants.USER_PASSWORD );
        loginSteps.clickLogin();
        loginSteps.checkFailLogin("Invalid login or password.");
    }

    @Test
    public void testNoPass(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUser(Constants.USER_EMAIL);
        loginSteps.clickLogin();
        loginSteps.checkRequiredPassword("This is a required field.");
    }
    @Test
    public void testNoUser(){
        loginSteps.navigateToLoginPage();
        loginSteps.setPass(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checKRequiredUser("This is a required field.");
    }

    @Test
    public void testInvalidUser(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.Invalid_User, Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.checkInvalidUser("Please enter a valid email address. For example johndoe@domain.com.");
    }

    @Test
    public void testInvalidPass(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.Invalid_Pass);
        loginSteps.clickLogin();
        loginSteps.checkInvalidPass("Please enter 6 or more characters without leading or trailing spaces.");
    }
    @Test
    public void logOut(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.clickAccount();
        loginSteps.logOut();
        loginSteps.checkLogout("YOU ARE NOW LOGGED OUT");
    }
}

