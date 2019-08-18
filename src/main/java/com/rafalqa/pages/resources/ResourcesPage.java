package com.rafalqa.pages.resources;

import com.rafalqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourcesPage extends AbstractPage {

    private By tableRow = By.cssSelector("#DataTables_Table_0 tbody tr");

    private ResourcesPage() {}

    public static ResourcesPage getResourcesPage() {
        return new ResourcesPage();
    }

    public ResourcesPage goTo() {
        getRelativeUrl("/resources.html");
        return this;
    }

    public ResourcesPage assertIsAt() {
        assertThat(driver.getTitle()).isEqualTo("Resources");
        return this;
    }

    public ResourcesPage assertTableHasRowsCount(int rowsCount) {
        List<WebElement> tableRows = driver.findElements(tableRow);
        assertThat(tableRows).hasSize(rowsCount);
        return this;
    }

}
