package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.BaseClass;

public class HomeElements  extends BaseClass 
{
	public HomeElements()
	{		
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement successmsg;
	@FindBy(xpath = "//ul/a[contains(text(),'Register')]")
	WebElement registerurl;
	@FindBy(xpath = "//a[@href='graph']")
	WebElement graphurlclick;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement siginUrl;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement loginerrormsg;
	
	@FindBy(xpath="//button[contains(text(),'Get Started')]")
	WebElement HomeGetStartedButton;
	
	public String getsuccessmsg() 
	{
		return successmsg.getText();
	}

	public void clickregisterurl() 
	{
		registerurl.click();
	}

	public void clickgraphUrl() 
	{
		graphurlclick.click();
	}

	public void clickSignin() 
	{
		siginUrl.click();
	}

	public String retrieveLoginMsg() 
	{
		return loginerrormsg.getText();
	}
	
	public void LinkClick(String ContainsTextName)
	{
		String GetStartedButtonXpath = "//h5[contains(text(), '"+ContainsTextName+"')]/following::a[1]";
		driver.findElement(By.xpath(GetStartedButtonXpath)).click();;
	}
	
	public void DropDownLinksClick(String AHREFNamesofDropDown)
	{
		String DropDownXpath = "//a[contains(text(),'"+AHREFNamesofDropDown+"')]";
		driver.findElement(By.xpath(DropDownXpath)).click();;
	}
	
	public void HomeGetStartedButtonClick() 
	{
		HomeGetStartedButton.click();
	}
	
}
