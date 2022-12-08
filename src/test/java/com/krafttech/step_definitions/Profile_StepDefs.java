package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPages;
import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class Profile_StepDefs {

    LoginPages loginPages = new LoginPages();
    ProfilePage profilePage = new ProfilePage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("User should go to My profile")
    public void user_should_go_to_my_profile() {
        dashboardPage.myProfile.click();

    }
    @When("User should navigate to {string}")
    public void user_should_navigate_to(String tabName) {
        profilePage.profileTabs(tabName);

    }
    @When("User should input the information boxes")
    public void user_should_input_the_information_boxes() {
        // profilePage.fullName.sendKeys("Mustafa");
        profilePage.about.sendKeys("This is great work");
        //  profilePage.company.sendKeys("Kraft Technologie");

        BrowserUtils.waitForVisibility(profilePage.slider,5);
        BrowserUtils.dragAndDropBy(profilePage.slider,150,0);  // yatay eksen

        //  Select select = new Select(profilePage.job);
        //  select.selectByVisibleText("QA Engineer");

        profilePage.website.sendKeys("krafttechnologie.com");
        profilePage.location.sendKeys("Ankara");
        // profilePage.skills.sendKeys("Selenium, TestNG, Java, Cucumber");

        BrowserUtils.clickWithJS(profilePage.save);
    }
    @Then("User should verify the profile updated message")
    public void user_should_verify_the_profile_updated_message() {

        String actualMessage = profilePage.profileUpdate.getText();
        String exceptedMessage = "Profile Updated";
        Assert.assertEquals(exceptedMessage,actualMessage);
    }


    @Then("User should see he profile options")
    public void user_should_see_he_profile_options(List <String> options) {
        List <String> actualOptions = BrowserUtils.getElementsText(profilePage.profileOptions);
        System.out.println("actualOptions.size() = " + actualOptions.size());

        System.out.println("actualOptions = " + actualOptions);
        System.out.println("options = " + options);
        Assert.assertEquals(options,actualOptions);
    }

}
