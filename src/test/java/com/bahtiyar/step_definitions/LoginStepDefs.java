package com.bahtiyar.step_definitions;


import com.bahtiyar.pages.LoginPage;
import com.bahtiyar.utilities.ConfigurationReader;
import com.bahtiyar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Opening the login page");
        Driver.getDriver().get( ConfigurationReader.getProperty( "url" ) );
        Driver.getDriver().manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );
    }

    @When("I login as a driver")
    public void i_login_as_a_driver() {
        LoginPage loginPage = new LoginPage();
        System.out.println("Logging in as a driver");
       loginPage.truckDriverLogin();
    }
    @Then("I should be able to see the dashboard page")
    public void i_should_be_able_to_see_the_dashboard_page() throws InterruptedException {
        System.out.println("Verifying dashboard page");
        Thread.sleep( 2000 );
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


}
