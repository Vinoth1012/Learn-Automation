package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.TestRunner;

public class Homepage extends TestRunner {
	
WebDriver driver;
Select drpSearchCategory;

@FindBy(xpath="//div/input[@id='twotabsearchtextbox']")
WebElement inputSearch;

@FindBy(xpath="//div//input[@id='nav-search-submit-button']")
WebElement btnSearch;
	
@FindBy(xpath="//div[@role='alertdialog']")
WebElement alertDialog;

@FindBy(xpath="//a[@id='nav-hamburger-menu']/i")
WebElement menuHamburger;

@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")
WebElement btnHamburgerClose;

@FindBy(xpath="//select[@name='url']")
WebElement drpSearch;


public Homepage(WebDriver driver)
			{
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}

public void isPageDisplayed()
			{
			if(btnSearch.isDisplayed())
			System.out.println("Homepage displayed successfully");
	}

public void enterDetails(String inputField, String inputValue) throws Exception 
			{
			inputField = inputField.trim().replace(" ", "").toUpperCase();
			switch(inputField)
			{
				case "SEARCH":
					inputSearch.clear();
					inputSearch.sendKeys(inputValue);
					break;
					
				default:
					System.out.println(inputField+" field is not available on the page");
					throw new Exception();
			}		
		System.out.println("Search details entered successfully");
}

public void clickButton(String btnClick) throws Exception 
		{
		btnClick = btnClick.trim().replace(" ", "").toUpperCase();
		switch(btnClick)
		{
			case "SEARCH":
				btnSearch.isDisplayed();
				btnSearch.click();
				break;
				
			case "HAMBURGER":
				menuHamburger.isDisplayed();
				menuHamburger.click();
				break;
				
			case "CLOSE":
				btnHamburgerClose.isDisplayed();
				btnHamburgerClose.click();
				break;
				
			default:
				System.out.println(btnClick+" button is not available on the page");
				throw new Exception();
		}
	}

public void checkAlertBox() throws Exception
	{
		if(alertDialog.isDisplayed())
			System.out.println("Alert box is displayed");
		else 
			throw new Exception();
	}


public void footersMoreOnAmazon()
	{
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j < 8; j++)
			{
				if(driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr["+ i +"]/td["+ j +"]/a")).size() != 0  &&
					driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr["+ i +"]/td["+ j +"]/a/span")).size() != 0)
				{
					String strFooterItem = driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr[" +
							+ i +"]/td["+ j +"]/a")).getText();
					String strFooterDescText = driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr["+ 
							+ i +"]/td["+ j +"]/a/span")).getText();
				
					System.out.println("Header - " + strFooterItem + " Text - "+ strFooterDescText);
					
					}	
				}
			}
	
		}


public void selectHamburgerList(String strSelectMenu, String strSelectSubMenu)
	{
		driver.findElement(By.xpath("//div[@id='hmenu-content']//ul//li//a//div[contains(text(),'"+strSelectMenu+"')]")).isDisplayed();
		driver.findElement(By.xpath("//div[@id='hmenu-content']//ul//li//a//div[contains(text(),'"+strSelectMenu+"')]")).click();
		
		driver.findElement(By.xpath("//div[@id='hmenu-content']//ul//li//a[contains(text(),'"+strSelectSubMenu+"')]")).isDisplayed();
		driver.findElement(By.xpath("//div[@id='hmenu-content']//ul//li//a[contains(text(),'"+strSelectSubMenu+"')]")).click();
		}


public void searchCategoryFilter(String strSearchCategory) throws Exception
	{
		try {
			drpSearchCategory = new Select(drpSearch);
			drpSearchCategory.selectByVisibleText(strSearchCategory);
			System.out.println(strSearchCategory+" category selected succesfully");
		}
		catch(Exception e){
			e.printStackTrace();
			throw new Exception();	
			}
		}


}
