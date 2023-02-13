package com.test.nhs.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {
    //Singleton Pattern Design-->private constructor
    //it is a way to centralize your driver
    public static WebDriver driver;

    private DriverHelper(){}//I do not want anyone creates an object

    public static WebDriver getDriver(){
        if(driver==null|| ((RemoteWebDriver)driver).getSessionId()==null){
           switch (ConfigReader.readProperty("browser")){
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
                   break;
               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               default:
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();
           }

        }
        return driver;
    }

}
