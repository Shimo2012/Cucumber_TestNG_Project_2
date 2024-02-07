package Step_Definitions;

import CucumberFolder.Pages.PageElements;
import CucumberFolder.Utility.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps extends DriverClass {

    PageElements pe = new PageElements();


    @Given("Navigate to NopCommerce WebSite")
    public void navigateToNopCommerceWebSite() {
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
    }

    @And("Click on Register")
    public void clickOnRegister() {
        pe.getRegister().click();
    }

    @And("Click on Gender")
    public void clickOnGender() {
        pe.getGender().click();
    }


    @And("Click on First name")
    public void clickOnFirstName() {
        pe.getFirstname().sendKeys("Adam");
    }

    @And("Click on Last name")
    public void clickOnLastName() {
        pe.getLastname().sendKeys("Dodo");
    }

    @When("I click on the date picker")
    public void iClickOnTheDatePicker() {
        pe.getDay();
    }

    @And("I select the year {string}")
    public void iSelectTheYear(String arg0) {
    }

    @And("I select the month {string}")
    public void iSelectTheMonth(String arg0) {
    }

    @And("I select the date {string}")
    public void iSelectTheDate(String arg0) {
    }

    @Then("the date {string} should be displayed")
    public void theDateShouldBeDisplayed(String arg0) {
    }

    @And("Click on Email")
    public void clickOnEmail() {
    }

    @And("Click on Company Name")
    public void clickOnCompanyName() {
    }

    @And("Click on Password")
    public void clickOnPassword() {
    }

    @And("Click on Confirm Password")
    public void clickOnConfirmPassword() {
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }

}
