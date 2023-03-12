package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.BaseClass;

public class LinkedList extends BaseClass
{
	public LinkedList()
	{		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='linked-list']")	WebElement LinkedListGetStartedButton;
	@FindBy(linkText = "Introduction") WebElement LLIntroLink;
		
	public void LinkedListGetStartedButtonClick()
	{
		LinkedListGetStartedButton.click();
	}
	
	public void LLIntroLinkClcik()
	{
		LLIntroLink.click();
	}
	
//	public void LLTryHereButtonClick()
//	{
//		LLTryHereButton.click();
//	}
//	
//	public void RunButtonClick()
//	{
//		RunButton.click();
//	}
}
