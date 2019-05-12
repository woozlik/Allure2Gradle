package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import wait.WebElementWait;

import static org.openqa.selenium.By.cssSelector;

abstract public class BasePage {
    WebDriver driver;
    private WebElementWait webElementWait;

    BasePage(WebDriver driver){
        this.driver = driver;
        webElementWait = new WebElementWait(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    void waitVisibilityAndClickOn(WebElement webElement){
        webElementWait.waitVisibilityOf(webElement).click();
    }

    WebElement waitVisibilityOf(WebElement webElement){
        return webElementWait.waitVisibilityOf(webElement);
    }

    void waitVisibilityAndType(WebElement webElement, String text){
        webElementWait.waitVisibilityOf(webElement).sendKeys(text);
    }

    void waitVisibilityAndClickOn(By by){
        webElementWait.waitVisibilityOf(by).click();
    }
}
