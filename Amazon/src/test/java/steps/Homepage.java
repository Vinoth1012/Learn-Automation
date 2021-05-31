package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage {
	
	WebDriver driver = null;
	
	@Given("^Homepage should be displayed$")
	public void homepage_displayed() throws Throwable {
		pages.Homepage homepage = new pages.Homepage(driver);
		homepage.isPageDisplayed();
	}
	
	@When("^Search for the Product$")
	public void search_for_the_Product() throws Throwable {

	}

	@Then("^Search Results should be displayed$")
	public void search_Results_should_be_displayed() throws Throwable {

	}

	 /*
	 homepage.checkAlertBox();
	 homepage.searchCategoryFilter("Computers");
	 homepage.enterDetails("Search", "Laptops");
	 homepage.clickButton("Search");*/

}
