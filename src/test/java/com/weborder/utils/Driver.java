package com.weborder.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class   Driver {
    // refrence Variable, pointer on Onject
    private  static WebDriver driver;
    // if refrence variable doesnot print any object it will have a null value
    //whenever we type new  class == we create  a new object
    //refrence type can be class , parent class or an interface implemented by class or parent class
    //since webdriver is an interface implemented by remotewebdriver class
    // and remote webdriver is a parent class of chromeDriver,firefoxDriver ETC
    //we can specific
    private Driver(){

    }
    public static WebDriver getDriver(){
        if(driver == null){
            String browser = "chrome";
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;
                default:
                    throw new RuntimeException("Browser is not implemented yet: "+browser);
            }
        }
        return driver;
    }

}
