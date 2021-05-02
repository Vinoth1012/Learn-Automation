package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public String baseUrl = "https://amazon.com";
	public WebDriver driver;
	public WebDriverWait wait;
	
	public void launchBrowser() throws Exception
	{
		 Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		 Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
		 Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
		 Runtime.getRuntime().exec("taskkill /F /IM firefox.exe /T");
		 
		 System.setProperty("webdriver.firefox.bin", "C:\\Users\\vinoth.b\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 wait = new WebDriverWait(driver, 10);
		}
		
	
	public void launchApp() throws Exception
	{
		 driver.get(baseUrl);
		}
		 
		 /*
		 homepage.checkAlertBox();
		 homepage.searchCategoryFilter("Computers");
		 homepage.enterDetails("Search", "Laptops");
		 homepage.clickButton("Search");*/
		
	
	public void closeBrowser() throws Exception
	{
		 driver.close();
		 driver.quit();
		}
	
}
