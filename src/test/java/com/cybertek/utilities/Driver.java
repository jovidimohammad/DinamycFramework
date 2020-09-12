package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){


    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        String browser = ConfigurationReader.getProperty("browser");
        browser = browser.toLowerCase();
        if(driver == null){
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                case "chrome-remote":
                    ChromeOptions chrome = new ChromeOptions();
                    URL url = null;
                    try {
                        url = new URL("http://35.153.71.50:4000/wd/hub");
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                            driver = new RemoteWebDriver(url,chrome);
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//waits 10 secs implicitly if any exception accuser
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver !=null){
            driver.quit();
            driver = null;
        }

    }

}
