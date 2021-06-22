package utils;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	
	public static String strBaseUrl;
	public static String strBrowser;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public void launchBrowser() throws Exception
	{
		try {
			 report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport\\ExtentReportResults.html");
			 test = report.startTest("ExtentDemo");
			 strBrowser = Config.readPropertyFile("Browser");
			 
			 if(strBrowser.equalsIgnoreCase("Chrome"))
			 {
				 Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
				 Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				 wait = new WebDriverWait(driver, 10);
			 }
			 
			 if(strBrowser.equalsIgnoreCase("Firefox"))
			 {
				 Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
				 Runtime.getRuntime().exec("taskkill /F /IM firefox.exe /T");
				 System.setProperty("webdriver.firefox.bin", "C:\\Users\\vinoth.b\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
				 driver = new FirefoxDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				 wait = new WebDriverWait(driver, 10);
			 }
			 
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new Exception();
			}
	}
		
	
	public void launchApp() throws Exception
	{
		 strBaseUrl = Config.readPropertyFile("URL");
		 driver.get(strBaseUrl);
		}
		 
	
	public void closeBrowser() throws Exception
	{
		 driver.close();
		 driver.quit();
		 report.endTest(test);
		 report.flush();
//		 report.close();
		}
	
	
}
