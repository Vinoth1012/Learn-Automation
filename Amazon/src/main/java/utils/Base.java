package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	
	public static String baseUrl = "https://amazon.com";
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports report = new ExtentReports("D:/Automation/Reports/ExtentReport.html");
	public static ExtentTest test = report.startTest("ReportDemo");
	
	public void launchBrowser() throws Exception
	{
		try {
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
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception();
			}
	}
		
	
	public void launchApp() throws Exception
	{
		 driver.get(baseUrl);
		}
		 
	
	public void closeBrowser() throws Exception
	{
		 driver.close();
		 driver.quit();
		}
	
	
}
