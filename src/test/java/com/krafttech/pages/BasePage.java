package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver;

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
        driver= Driver.get();
    }

   @FindBy(xpath = "//span[.='Edit Profile']")
   public WebElement tabMenu;

    public void navigateToTab(String tabName){
        driver= Driver.get();
        driver.findElement(By.xpath("//nav//span[.='"+tabName+"']")).click();

    }

    public void navigateToModule(String tab, String module){

        String tabLocator= "//li[@class='nav-item']//span[.='"+tab+"']";

        String moduleLocator="//span[.='"+module+"']";

        BrowserUtils.waitForClickablility(By.xpath(tabLocator),5);
        WebElement tabElement=Driver.get().findElement(By.xpath(tabLocator));
        tabElement.click();

        BrowserUtils.waitForClickablility(By.xpath(moduleLocator),5);
        Driver.get().findElement(By.xpath(moduleLocator)).click();
    }


    public String subTitle(String subTitle){
        String subTitleLocator="//h1[.='"+subTitle+"']";
        BrowserUtils.waitForPresenceOfElement(By.xpath(subTitleLocator),5);

        WebElement SubTitle = Driver.get().findElement(By.xpath(subTitleLocator));
        String actualSubTitle = SubTitle.getText();

        return actualSubTitle;
    }

    public String getAccountName_mtd(String accountName){
        return Driver.get().findElement(By.xpath("//span[.='"+accountName+"']")).getText();

    }





}




