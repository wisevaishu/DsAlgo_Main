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
	@FindBy (xpath="//a[contains(text(),'Arrays Using List')]")WebElement ArraysUsingList ;
	
	@FindBy (xpath="//a[@href=\"/array/basic-operations-in-lists/\"]")WebElement BasicOperationsinLists ;
	@FindBy (xpath="//a[@href=\"/array/applications-of-array/\"]")WebElement ApplicationsOfArray;
	@FindBy (xpath="//a[@href=\"/array/practice\"]")WebElement PQinArray;
	@FindBy (xpath="//a[@href=\"/question/4\"]")WebElement SquaresOfaSortedArray;
	
	
	public void ClickArrayGetStartedButton() 
	{
		aGetStartedButton.click();
	}
	
	public void ClickArraysInPythonLinkClick() 
	{
		aArraysInPythonLink.click();
	}
	
	public void SelectArraysUsingList() 
	{
		ArraysUsingList.click();
	}
	
	public void BasicOperationsinLists() 
	{
		BasicOperationsinLists.click();
	}
	
	public void ApplicationsOfArray()
	{
		ApplicationsOfArray.click();
	}
	
	public void PQinArray() 
	{
		PQinArray.click();	
	}
	
	public void SquaresOfaSortedArray() 
	{
		SquaresOfaSortedArray.click();	
	}	
	
	
}
