package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.BaseClass;

public class Array extends BaseClass
{
	public Array ()
	{		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//h5[contains(text(), 'Array')]/following::a[1]") WebElement aGetStartedButton;
	@FindBy (xpath="//a[contains(text(),'Arrays in Python')]")WebElement aArraysInPythonLink;	
	
	public void ClickArrayGetStartedButton() 
	{
		aGetStartedButton.click();
	}
	
	public void ClickArraysInPythonLinkClick() 
	{
		aArraysInPythonLink.click();
	}
}
