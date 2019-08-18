package com.rafalqa;

import com.rafalqa.pages.home.HomePage;
import com.rafalqa.pages.resources.ResourcesPage;
import org.junit.jupiter.api.Test;

class ExampleTest extends BaseTest {

    private HomePage home = HomePage.getHomePage();
    private ResourcesPage resources = ResourcesPage.getResourcesPage();

    @Test
    void openResourcesReportFromHomePage() {
        home.goTo()
                .assertIsAt()
                .clickResourcesLink();

        resources.assertIsAt();
    }

    @Test
    void resourcesReportTableHasData() {
        resources.goTo()
                .assertIsAt()
                .assertTableHasRowsCount(10);
    }

}
