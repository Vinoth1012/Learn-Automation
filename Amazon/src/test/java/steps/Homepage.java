package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Base;

public class Homepage {
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		Base base = new Base();
		base.launchBrowser();
	}

	@Given("^Open the application$")
	public void open_the_application() throws Throwable {
		Base base = new Base();
		base.launchApp();
	}

	@Given("^Homepage should be displayed$")
	public void homepage_displayed() throws Throwable {
		Homepage homepage = new Homepage();
	}
	
	@When("^Search for the Product$")
	public void search_for_the_Product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Search Results should be displayed$")
	public void search_Results_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Close the application$")
	public void close_the_application() throws Throwable {
		Base base = new Base();
		base.closeBrowser();
	}
	

}
