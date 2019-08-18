package com.rafalqa.pages.home;

import com.rafalqa.pages.AbstractPage;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends AbstractPage {

    private By summaryActiveLink = By.cssSelector("a[data-report='summary'].active");
    private By resourcesLink = By.cssSelector("a[data-report='resources']");

    private HomePage() {}

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public HomePage goTo() {
        getRelativeUrl("/index.html");
        return this;
    }

    public HomePage assertIsAt() {
        assertThat(driver.getTitle()).isEqualTo("Summary");
        assertThat(driver.findElement(summaryActiveLink).isDisplayed()).isTrue();
        return this;
    }

    public HomePage clickResourcesLink() {
        driver.findElement(resourcesLink).click();
        return this;
    }

}
