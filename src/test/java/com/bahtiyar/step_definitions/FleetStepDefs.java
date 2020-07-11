package com.bahtiyar.step_definitions;


import com.bahtiyar.pages.FleetPage;
import com.bahtiyar.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FleetStepDefs {
    FleetPage fleetPage = new FleetPage();
    @Then("I should be able to hover on fleet module")
    public void i_should_be_able_to_hover_on_fleet_module() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(),20 );
        wait.until( ExpectedConditions.visibilityOf( fleetPage.fleetTab ) );
       fleetPage.HoverFleet();
       Thread.sleep( 3000 );
    }

    @Then("I should be able to click on Vehicle Services Logs tab")
    public void i_should_be_able_to_click_on_vehicle_services_logs_tab() {
        fleetPage.clickServiceLogs();
    }
    @Then("I should be able to see the Vehicle Services Logs page")
    public void i_should_be_able_to_see_the_vehicle_services_logs_page() {
        String actualTitle = Driver.getDriver().getTitle();
        WebDriverWait wait = new WebDriverWait( Driver.getDriver(),20 );
        wait.until( ExpectedConditions.titleIs( actualTitle ) );
        String expectTitle = "Dashboard";
        Assert.assertEquals( actualTitle,expectTitle );
    }

}
