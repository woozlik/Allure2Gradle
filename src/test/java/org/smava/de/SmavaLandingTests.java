package org.smava.de;

import org.junit.Test;
import pages.ContactInfoLoanApplicationPage;
import pages.SmavaLandingPage;
import pages.components.Amount;
import pages.components.Category;
import pages.components.Duration;

import static org.hamcrest.MatcherAssert.assertThat;

public class SmavaLandingTests extends BaseTest {
    @Test
    public void userShouldBeAbleToAskForLoan() {
        ContactInfoLoanApplicationPage contactInfoLoanApplicationPage =
                new SmavaLandingPage(driver)
                .openSmavaLandingPage()
                .selectCategoryInLoanCalculator(Category.WOHNEN)
                .selectAmountInLoanCalculator(Amount._2750)
                .selectDurationInLoanCalculator(Duration._24_Monate)
                .clickNextButtonInLoanCalculator();

        assertThat(
                "Contact Info Loan Application page is not completely load",
                contactInfoLoanApplicationPage.isCompletelyLoaded()
        );
    }

    @Test
    public void userCannotLoginWithIncorrectEmailAndPassword() {
        SmavaLandingPage smavaLandingPage = new SmavaLandingPage(driver)
                .openSmavaLandingPage()
                .clickOnLoginButtonOnTopMenu()
                .typeEmailInLoginPopupContent("some.email@anyDomain.com")
                .typePasswordInLoginPopupContent("verySecurePassword")
                .clickOnLoginButtonLoginPopup();

        assertThat("It's not Smava landing page", smavaLandingPage.isSmavaLandingPage());
        assertThat(
                "Login button on TopMenu is not displayed",
                smavaLandingPage.isLoginButtonOnTopMenuDisplayed()
        );
    }
}
