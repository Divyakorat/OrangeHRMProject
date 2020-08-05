package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util{
    private By _WelcomeMessage= By.xpath("//a[text()=\"Welcome Admin\"]");
   private String expectedResult="Welcome Admin";

    public void verifyUserableToSeeWelcomeMessageSuccessfully(){
        Assert.assertEquals(getTextFromElement(_WelcomeMessage),expectedResult);

    }
}
