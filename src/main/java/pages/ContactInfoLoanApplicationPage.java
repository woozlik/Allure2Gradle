package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoLoanApplicationPage extends BasePage {
    @FindBy(xpath = "//*[text() = 'Weiter']")
    private WebElement nextButton;

    @FindBy(css = ".block.side-help")
    private WebElement sideHelpBlock;

    public ContactInfoLoanApplicationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Verify page completely loaded")
    public boolean isCompletelyLoaded() {
        //page is considered loaded when longest loaded webElement is displayed
        return waitVisibilityOf(sideHelpBlock).isDisplayed() && waitVisibilityOf(nextButton).isDisplayed();
    }
}
