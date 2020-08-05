package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPanel extends Util {
     LoadProp loadProp = new LoadProp();
    private String expectedUrl="https://opensource-demo.orangehrmlive.com/";
    private  String actualURL=driver.getCurrentUrl();

   private By _userName=By.xpath("//input[@id=\"txtUsername\"]");

    private By _password=By.xpath("//input[@name=\"txtPassword\"]");
    private By _loginButton=By.xpath("//input[@id=\"btnLogin\"]");

    private By _expectedErrorMassage = By.id("spanMessage");

    public void verifyUrl(){

        Assert.assertEquals(actualURL,expectedUrl);

    }

    public void userShouldBeAbleToEnterUserName() {
        waituntilElementIsclickable(_userName,30);
        typeText(_userName, loadProp.getProperty("UserName"));
    }
    public void UserShouldBeAbleToEnterPassword(){

        typeText(_password,loadProp.getProperty("PassWord"));
    }
    public void userClickOnLoginButton() {
        clickOnElement(_loginButton);
    }
    public void invalidUserName(String UserName){
        typeText(_userName,UserName);

    }
    public void invalidPassword(String Password){
        typeText(_password,Password);
    }
    public void usershouldbeabletoseeerrormessage(String receivedMessage){
        Assert.assertEquals(getTextFromElement(_expectedErrorMassage),receivedMessage);

    }
}
