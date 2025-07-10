package stepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("I am on the login page")
    public void onLoginPage() {
        System.out.println("Navigated to login page");
    }

    @When("I enter a valid username and password")
    public void enterValidCredentials() {
        System.out.println("Entered valid credentials");
    }

    @When("I click on the login button")
    public void clickLogin() {
        System.out.println("Clicked on login button");
    }

    @Then("I should be redirected to the dashboard")
    public void verifyDashboard() {
        System.out.println("User is on dashboard");
    }
}