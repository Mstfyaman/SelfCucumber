package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_stepDefs {

    DashboardPage dashboardPage = new DashboardPage();



    @Then("The user name should be {string}")
    public void the_user_name_should_be(String exceptedName) {

        String actualName = dashboardPage.getUserName();
        System.out.println("actualName = " + actualName);
        System.out.println("exceptedName = " + exceptedName);
        Assert.assertEquals("Verify that name is match",exceptedName,actualName);
    }


    @When("The user navigates to {string} menu")
    public void theUserNavigatesToMenu(String arg0) {
        dashboardPage.navigateToTab(arg0);  // buraya kendisi Edit profile yazacak

    }

    @Then("The user should be able to see home name as {string}")
    public void theUserShouldBeAbleToSeeHomeNameAs(String exceptedName) {
       String actualHomeName= dashboardPage.getHomeName(exceptedName);
       Assert.assertEquals(exceptedName,actualHomeName);

    }
}
