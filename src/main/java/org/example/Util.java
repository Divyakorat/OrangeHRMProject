package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BasePage {
    public static void waituntilElementIsclickable(By by , int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);

        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //reusable method for sleep
    public static void sleep1(int n)
    {
        try
        {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    //reusable method to click on elements
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    //reusable method to type text elements
    public static void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //reusable method to get text from elements
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //Time stamp
    public static long timestamp()
    {
        return (System.currentTimeMillis());

    }
    //reusable method for select from dropdown by visible text
    public static void selectFromDropDownByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //reusable method for select from dropdown by text value
    public static void selectFromDropDownByTextvalue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }
    //reusable method to get String text
    public static String getTextFromEliment(By by, String text)
    {
        return driver.findElement(by).getText();
    }


    public static String alertMethod()
    {
        driver.switchTo().alert().accept();
        return driver.switchTo().alert().getText();

    }
    public static String  getUrl(){
        return driver.getCurrentUrl();


    }

}
