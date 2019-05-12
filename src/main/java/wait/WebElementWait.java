package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

final public class WebElementWait {
    private WebDriverWait webDriverWait;

    public WebElementWait(WebDriver driver){
        webDriverWait = new WebDriverWait(driver, 5);
    }

    public WebElement waitVisibilityOf(WebElement webElement){
        return webDriverWait.until(visibilityOf(webElement));
    }

    public WebElement waitVisibilityOf(By by){
        return webDriverWait.until(visibilityOfElementLocated(by));
    }

}
