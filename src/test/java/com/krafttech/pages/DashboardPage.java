package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//h1[.='Dashboard']")
    public WebElement dashboardPageTitle;

    @FindBy(xpath = "(//span[.='</aFm>'])[1]")
    public WebElement aFmTitle;

    @FindBy(xpath = "//span[@class='d-none d-md-block dropdown-toggle ps-2']")
    public WebElement userPupUp;

    @FindBy(xpath = "(//span[.='My Profile'])[2]")
    public WebElement myProfile;

    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLİnk;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement singOut;

    @FindBy(xpath = "//div[@class='copyright']")
    public WebElement copyright;

    @FindBy(xpath = "//h3[.='isa akyuz']")
    public WebElement userNameLocator;

    @FindBy(xpath = "//span[.='JavaScript']")
    public WebElement tabLocator;

    @FindBy(xpath = "//span[.='Modal']")
    public WebElement moduleLocator;

    @FindBy(css = "li[class*='nav-item dropdown']")
    public List<WebElement> moduleLocator2;

    @FindBy(xpath = "//a[@class='nav-link nav-profile d-flex align-items-center pe-0']")
    public WebElement getUserName;  // ( DDF )

    @FindBy(xpath = "//li[.='Edit User Profile']")
    public WebElement tag;

    public String getHomeName(String homeName){
       BrowserUtils.waitFor(1);
        return  Driver.get().findElement(By.xpath("//li[text()='"+homeName+"']")).getText();

    }




    public String DashboardPageTitle(String title){
        String Title=dashboardPageTitle.getText();
        return Title;
    }


    public String UsersNames(String name){
        String usernameLocator = "//h3[.='"+name+"']";

        BrowserUtils.waitForPresenceOfElement(By.xpath(usernameLocator),5);
        WebElement UserName= Driver.get().findElement(By.xpath(usernameLocator));

        String actualName = UserName.getText();

        return actualName;
    }

    public String getUserName(){

        BrowserUtils.waitForVisibility(getUserName,5);

        return getUserName.getText();
    }



}
