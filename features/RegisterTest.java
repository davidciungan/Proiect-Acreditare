package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void ValidRegister() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Email,
                Constants.NEWUSER_Pass,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkReg("Hello, David Test!");

    }

    @Test
    public void sameMailReg() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.USER_EMAIL,
                Constants.NEWUSER_Pass,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkAlreadyRegEmail("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.");
    }

    @Test
    public void sameNameReg() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.DifferentMail,
                Constants.NEWUSER_Pass,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkReg("Hello, David Test!");
    }

    @Test
    public void InvalidMail() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.Invalid_User,
                Constants.NEWUSER_Pass,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkInvalidMail("Please enter a valid email address. For example johndoe@domain.com.");

    }


    @Test
    public void InvalidPass() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Email,
                Constants.Invalid_Pass,
                Constants.Invalid_Pass);
        registerSteps.clickRegister();
        registerSteps.checkInvalidPass("Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void PassMissMatch() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setCredentials(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Email,
                Constants.USER_PASSWORD,
                Constants.Invalid_Pass);
        registerSteps.clickRegister();
        registerSteps.checkConfirmPassMissmatch("Please make sure your passwords match.");
    }

    @Test
    public void NoUser() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setNoUser(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Pass,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkNoUser("This is a required field.");
    }

    @Test
    public void NoPass() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setNoPass(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Email,
                Constants.NEWUSER_ConfirmPass);
        registerSteps.clickRegister();
        registerSteps.checkNoPass("This is a required field.");
    }

    @Test
    public void NoPassConfirm(){
        registerSteps.navigateToRegisterPage();
        registerSteps.setNoPassConfirm(
                Constants.FirstName,
                Constants.LastName,
                Constants.NEWUSER_Email,
                Constants.NEWUSER_Pass);
        registerSteps.clickRegister();
        registerSteps.checkNoPassConfirm("This is a required field.");
    }
}
