package org.amazon.test;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
//			WebDriver driver;
			System.setProperty("webdriver.gecko.driver","D:\\Automation\\Workspace\\Amazon\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Users\\vinoth.b\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
			
//			driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//			driver.get("https://amazon.com");
	}

}
