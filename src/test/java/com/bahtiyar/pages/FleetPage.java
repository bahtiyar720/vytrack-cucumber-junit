package com.bahtiyar.pages;

import com.bahtiyar.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FleetPage {
    public FleetPage() {
        PageFactory.initElements( Driver.getDriver(), this );
    }

    @FindBy(xpath = "//div[@id='main-menu']//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetTab;
    @FindBy(linkText = "Vehicle Services Logs")
    public WebElement VehicleServicesLogs;
    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement errormsg;
    Actions actions = new Actions( Driver.getDriver() );
    public void HoverFleet(){
        actions.moveToElement( fleetTab ).perform();
    }
    public void clickServiceLogs(){
        actions.moveToElement( VehicleServicesLogs ).click().perform();
    }
    public void error(){
        Assert.assertTrue( errormsg.isDisplayed() );
    }
}
