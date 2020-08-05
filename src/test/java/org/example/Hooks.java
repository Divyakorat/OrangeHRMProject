package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util{
    BrowserManager1 browserManager=new BrowserManager1();
    @Before
    public void OpenBrowser(){
        browserManager.BrowserSetup();
    }
    @After
    public void closeBrowser(){
        browserManager.closeBrowser();
    }
}
