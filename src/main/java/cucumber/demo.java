package cucumber;

public class demo {

}
package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class Stepdefination {

    @Given("^user is on netBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	  System.out.println("mooooo");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	  System.out.println("mooooo");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	  System.out.println("mooooo");
    }

    @And("^card are displayed$")
    public void card_are_displayed() throws Throwable {
     System.out.println("mooooo");
    }

}