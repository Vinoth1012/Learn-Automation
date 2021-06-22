package steps;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage {
	
	WebDriver driver = null;
	
	@Given("^Homepage should be displayed$")
	public void homepage_displayed() throws Throwable {
		try {
			pages.Homepage homepage = new pages.Homepage(driver);
			homepage.isPageDisplayed();
			utils.Base.test.log(LogStatus.PASS, "Homepage is displayed successfully");	
			}
		catch(Exception e) {
			e.printStackTrace();
//			utils.Base.test.log(LogStatus.FAIL, utils.Base.test.addScreenCapture(screenshotPath));
			}
	}
	
	@When("^Search for the Product$")
	public void search_for_the_Product() throws Throwable {

	}

	@Then("^Search Results should be displayed$")
	public void search_Results_should_be_displayed() throws Throwable {

	}

}
