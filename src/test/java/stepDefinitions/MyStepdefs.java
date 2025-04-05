package stepDefinitions;

import Healper.support;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class MyStepdefs  {

    support sup = new support();
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.out.println("THIS IS LOGIN");
        //*[@id="endpoint"]/tp-yt-paper-item/yt-formatted-string

    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        
    }

    @And("clicks the login button")
    public void clicksTheLoginButton() {
        
    }

    @Then("the user should be logged in")
    public void theUserShouldBeLoggedIn() {
    }
}
