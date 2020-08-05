package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager1 extends Util{
    public static LoadProp loadProp = new LoadProp();
    public static String browser = loadProp.getProperty("Browser");
    public static final String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY ");
    //public static final String URL = "https://" + USERNAME + " : " + ACCESS_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    public String URL ="https://john_34:bddea5ec-75b0-4dda-81a7-852cf5a6b571@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    public static final boolean SAUCE_LAB = true;

    public void BrowserSetup()
    {
        System.out.println(browser);

        if (SAUCE_LAB) {
            System.out.println("running with saucelab" + browser);
            if (browser.equalsIgnoreCase("chrome")) {
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("browserVersion", "83.0");
                try {
                    driver = new RemoteWebDriver(new URL(URL), capabilities);

                } catch (MalformedURLException e) {
                    e.printStackTrace();}
            }else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                MutableCapabilities sauceOptions = new MutableCapabilities();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


            } else if (browser.equalsIgnoreCase("safari")) {
                DesiredCapabilities capabilities = DesiredCapabilities.safari();
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("browserVersion", "latest");
                try {
                    driver = new RemoteWebDriver(new URL(URL), capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else
            {
                System.out.println("browser name is empty" + browser);
            }

            //applying implicity wait of 30 sec to the driver instance
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            //open the URL
            driver.get(loadProp.getProperty("url"));
        } else {
            if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("here");
                //setting up chromedriver path
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
                //creating chromdriver object to open google chrome browser
                driver = new ChromeDriver();
                System.out.println(loadProp.getProperty("url"));

            } else if (browser.equalsIgnoreCase("firefox")) {
                //setting up firefox path
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDrivers\\geckodriver.exe");
                //Now you can Initialize marionette driver to launch firefox
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                //creating firefox object to open firefox browser
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("ie")) {
                //setting up ie path
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDrivers\\IEDriverServer.exe");
                //creating ie object to open ie browser
                driver = new InternetExplorerDriver();
            } else {
                System.out.println("please enter valid browser");
            }


            //maximising screen
            driver.manage().window().maximize();
            //applying implicity wait of 30 sec to the driver instance
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            //open the URL
            driver.get(loadProp.getProperty("url"));

        }
    }public  void closeBrowser() {
        driver.close();
    } //reusable method to close browser
}

