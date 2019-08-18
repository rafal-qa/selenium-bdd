package com.rafalqa;

import com.rafalqa.framework.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void startBrowser() {
        DriverFactory.getDriver();
    }

    @AfterEach
    public void closeBrowser() {
        DriverFactory.close();
    }

}
