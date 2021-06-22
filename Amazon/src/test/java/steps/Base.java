package steps;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Base{

	@Given("^Launch the browser$")
	public void launchbrowser() throws Throwable {
		utils.Base base = new utils.Base();
		base.launchBrowser();
		utils.Base.test.log(LogStatus.PASS, "Browser launched successfully");
	}

	@Given("^Open the application$")
	public void openapplication() throws Throwable {
		utils.Base base = new utils.Base();
		base.launchApp();
		utils.Base.test.log(LogStatus.PASS, "Application launched successfully");
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		utils.Base base = new utils.Base();
		base.closeBrowser();
		utils.Base.test.log(LogStatus.PASS, "Browser closed successfully");
	}

}