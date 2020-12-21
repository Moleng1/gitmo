package StepDefination;

 

 

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

 

 
@RunWith(Cucumber.class)
public class Stepdefination {
	@Given("^User is on netbanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("card are displayed");
	  
	  //System.out.println();//this is new 
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		System.out.println(arg2);
	}

	@Then("^home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page");
	}

	@Then("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	 
	 
	}

	@Given("^Home page default login$")
	public void home_page_default_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("go mate");
	 
	}}