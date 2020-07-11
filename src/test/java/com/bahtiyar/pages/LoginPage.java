package com.bahtiyar.pages;

import com.bahtiyar.utilities.ConfigurationReader;
import com.bahtiyar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
    public LoginPage(){
        PageFactory.initElements( Driver.getDriver(),this );
    }

    @FindBy(id="prependedInput")
    public WebElement usernameInput;
    //locating password input
    @FindBy(id="prependedInput2")
    public WebElement passwordInput;
    //locating login button
    @FindBy(id="_submit")
    public WebElement loginButton;
    public void truckDriverLogin(){
        usernameInput.sendKeys( ConfigurationReader.getProperty( "truckDriver_username" ) );
        passwordInput.sendKeys( ConfigurationReader.getProperty( "password" ) );
        loginButton.click();
    }
    public void storemanagerLogin(){
        usernameInput.sendKeys( ConfigurationReader.getProperty( "storemanager_username" ) );
        passwordInput.sendKeys( ConfigurationReader.getProperty( "password" ) );
        loginButton.click();
    }

}
