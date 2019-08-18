package com.rafalqa.pages;

import com.rafalqa.framework.DriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

    protected WebDriver driver = DriverFactory.getDriver();
    private String baseUrl = System.getProperty("test.base_url");

    protected void getRelativeUrl(String relativeUrl) {
        driver.get(baseUrl + relativeUrl);
    }

}
