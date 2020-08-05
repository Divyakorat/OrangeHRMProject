package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
    HomePage homePage=new HomePage();
    LoginPanel loginPanel=new LoginPanel();

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        loginPanel.verifyUrl();

    }

    @When("^user enter username$")
    public void user_enter_username()  {
        loginPanel.userShouldBeAbleToEnterUserName();

    }

    @When("^user enter password$")
    public void user_enter_password()  {
        loginPanel.UserShouldBeAbleToEnterPassword();

    }

    @When("^user click on login button$")
    public void user_click_on_login_button()  {
        loginPanel.userClickOnLoginButton();

    }

    @Then("^user should be able to see welcome message successfully$")
    public void user_should_be_able_to_see_welcome_message_successfully()  {
        homePage.verifyUserableToSeeWelcomeMessageSuccessfully();

    }


    @When("^user enter invalid username \"([^\"]*)\"$")
    public void userEnterInvalidUsername(String UserName ) {
        loginPanel.invalidUserName(UserName);

    }

    @And("^user enter invalid password \"([^\"]*)\"$")
    public void userEnterInvalidPassword(String Password)  {
        loginPanel.invalidPassword(Password);

    }

    @Then("^user should not be able to logged in successfully and \"([^\"]*)\"$")
    public void userShouldNotBeAbleToLoggedInSuccessfullyAnd(String receivedMessage) {
        loginPanel.usershouldbeabletoseeerrormessage(receivedMessage);

    }
}
