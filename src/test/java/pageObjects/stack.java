package pageObjects;

import org.openqa.selenium.support.PageFactory;
import stepDefinition.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class stack extends BaseClass
{
	public stack() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stackgetstartTab;
	
	@FindBy(xpath = "//a[normalize-space()='Operations in Stack']")
	WebElement OperationsinstackTab;
	
	@FindBy (xpath = "//a[normalize-space()='Implementation']")
	WebElement implementationTab;
	
	@FindBy (xpath = "//a[normalize-space()='Applications']")
	WebElement applicationTab;
	
	public void stackgetclick() 
	{		
		stackgetstartTab.click();
	}
	
	public void opinstack() 
	{
		OperationsinstackTab.click();
	}
	
	public void implementation() 
	{
		implementationTab.click();
	}
	
	public void application() 
	{
		applicationTab.click();
	}
}
