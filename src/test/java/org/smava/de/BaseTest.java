package org.smava.de;

import driver.WebDriverService;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract public class BaseTest {
    protected WebDriver driver;
    private WebDriverService webDriverService;

    @Before
    public void beforeTest() {
        webDriverService = new WebDriverService();
        driver = webDriverService.getDriver();
    }

    @After
    public void closeBrowser() {
        webDriverService.quitDriver();
    }
}
