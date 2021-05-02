package org.amazon.test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.amazon.pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "features", glue = {"org.amazon.steps"}, tags = {"@test"} )

public class NewTest {
	
	public String baseUrl = "https://amazon.com";
	public WebDriver driver;
	public WebDriver driver2;
	public WebDriverWait wait;

	 @BeforeSuite
	  public void beforeSuite() throws IOException {
		 
		 Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		 Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		 
		 Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
		 Runtime.getRuntime().exec("taskkill /F /IM firefox.exe /T");
		 
		 System.setProperty("webdriver.firefox.bin", "C:\\Users\\vinoth.b\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver, 10);
		 
		 driver2 = new FirefoxDriver();
		 driver2.manage().window().maximize();
		 driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver2, 10);
	  }
	 
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("Launching the application");
	  }
	 
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before class");
	  }
	 
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before method");
	  }
	 
	 @Test
	  public void test() throws Exception {
		 driver.get(baseUrl);
		 Homepage homepage = new Homepage(driver);
		 homepage.isPageDisplayed();	 
		 homepage.checkAlertBox();
		 homepage.searchCategoryFilter("Computers");
		 homepage.enterDetails("Search", "Laptops");
		 homepage.clickButton("Search");
	  }
	 
	 @Test
	  public void test2() throws Exception {
		 driver2.get(baseUrl);
		 Homepage homepage = new Homepage(driver2);
		 homepage.isPageDisplayed();	 
		 homepage.checkAlertBox();
		 homepage.searchCategoryFilter("Computers");
		 homepage.enterDetails("Search", "Laptops");
		 homepage.clickButton("Search");
	  }
	 
	 @AfterMethod
	  public void afterMethod() {
		  System.out.println("After method");
	  }
	 
	 @AfterClass
	  public void afterClass() {
		  System.out.println("After class");
	  }
	 
	 @AfterTest
	  public void afterTest() {
		  System.out.println("After test");
	  }
	 
	 @AfterSuite
	  public void afterSuite() {
		  driver.close();
		  driver.quit();
		  
		  driver2.close();
		  driver2.quit();
	  }
  
}
