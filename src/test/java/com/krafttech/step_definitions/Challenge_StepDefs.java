package com.krafttech.step_definitions;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPages;
import com.krafttech.pages.ProfilePage;
import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Challenge_StepDefs {

    LoginPages loginPages = new LoginPages();
    DashboardPage dashboardPage = new DashboardPage();
    ProfilePage profilePage = new ProfilePage();


    @Given(": The user is on the Login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enter self credentials")
    public void the_user_enter_self_credentials() {

        loginPages.loginUser();
    }
    @Then("The user see titles on the right of page")
    public void the_user_see_titles_on_the_right_of_page(List<String> list) {

    List <String> actualOpt = BrowserUtils.getElementsText(dashboardPage.moduleLocator2);
        System.out.println("actualOpt.size() = " + actualOpt.size());

        System.out.println("actualOpt = " + actualOpt);
        System.out.println("list = " + list);
        Assert.assertEquals(list,actualOpt);
    }



    @When("Gecerli kriterleri giris yapar")
    public void gecerli_kriterleri_giris_yapar() {
        loginPages.loginUser();

    }
    @When("My profile e gider")
    public void my_profile_e_gider() {
      dashboardPage.myProfile.click();
    }
    @When("Tiklar {string}")
    public void tiklar(String tabName) {
        profilePage.profileTabs(tabName);
    }
    @When("Bilgileri doldurur")
    public void bilgileri_doldurur() {
        profilePage.jobTitle.sendKeys("SDET");
        profilePage.companyexperience.sendKeys("Krafttech");
        profilePage.locationExperience.sendKeys("Ankara");
        profilePage.startYear.sendKeys("25/07/2022");
        profilePage.endYear.sendKeys("25/03/2022");
        profilePage.jobDescription.sendKeys("Bu odev karman corman oldu");

        BrowserUtils.clickWithJS(profilePage.addExperienceBtn);
    }
    @Then("Overview Sayfasina geldigini dogrular")
    public void overview_sayfasina_geldigini_dogrular() {
        BrowserUtils.verifyElementDisplayed(profilePage.overview);
    }


}
