package com.rafalqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static String browser = System.getProperty("test.browser");

    private DriverFactory() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = getSpecifiedBrowserDriver();
        }
        return driver;
    }

    private static WebDriver getSpecifiedBrowserDriver() {
        if (browser.equals("chrome")) {
            return getChromeDriver();
        } else if (browser.equals("firefox")) {
            return getFirefoxDriver();
        } else {
            throw new RuntimeException("Unknown browser name: " + browser);
        }
    }

    private static WebDriver getChromeDriver() {
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }

    public static void close() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

}
