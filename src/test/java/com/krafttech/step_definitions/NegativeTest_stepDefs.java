package com.krafttech.step_definitions;

import com.krafttech.pages.LoginPages;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegativeTest_stepDefs {

    LoginPages loginPages = new LoginPages();


    @Then("The user be able to see {string} and {string}")
    public void the_user_be_able_to_see_and(String expectedEmailFail, String exceptedPassFail) {
        BrowserUtils.waitForVisibility(loginPages.warningPassword,2);
        BrowserUtils.waitForVisibility(loginPages.warningEmail,2);

        BrowserUtils.verifyElementDisplayed(loginPages.warningEmail);
        BrowserUtils.verifyElementDisplayed(loginPages.warningPassword);
    }


    @Then("The user be able to see {string} and {string} and {string} warning message")
    public void theUserBeAbleToSeeAndAndWarningMessage(String expectedEmailFail, String exceptedPassFail, String warningMsj1) {

    }

    @Then("The user be able to see {string} and {string} and {string} and {string} warning message")
    public void theUserBeAbleToSeeAndAndAndWarningMessage(String arg0, String arg1, String arg2, String arg3) {
    }
}
