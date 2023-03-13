package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import stepDefinition.BaseClass;

public class Array extends BaseClass
{
	public Array()
	{
		
		PageFactory.initElements(driver, this);
	}
	
		@FindBy (xpath="//a[@href=\"/array\"]")WebElement Arrays;
	
		@FindBy (xpath="//a[@href=\"arrays-in-python\"]")WebElement ArraysInPython;
		@FindBy (xpath="//a[@href=\"arrays-using-list\"]")WebElement ArraysUsingList ;
		@FindBy (xpath="//a[@href=\"basic-operations-in-lists\"]")WebElement BasicOperationsinLists ;
		@FindBy (xpath="//a[@href=\"applications-of-array\"]")WebElement ApplicationsOfArray;
		@FindBy (xpath="//a[@href=\"/array/practice\"]")WebElement PQinArray;
		@FindBy (xpath="//a[@href=\"/question/4\"]")WebElement SquaresOfaSortedArray;
		@FindBy (xpath="//input[@type=\"submit\"]")WebElement Submit;
		@FindBy (xpath="//button[@type=\"button\"]")WebElement run;
		@FindBy (xpath ="//a[@href=\"/tryEditor\"]")WebElement TryHere;
		
		@FindBy (className="nav-item")WebElement Dropdown;
		
		public void SelectArrays () {
			Dropdown.click();
			Arrays.click();
		}

		public void SelectArraysInPython() {
			ArraysInPython.click();
		}
		public void SelectArraysUsingList() {
			ArraysUsingList.click();
		}
		public void BasicOperationsinLists() {
			BasicOperationsinLists.click();
		}
		public void ApplicationsOfArray() {
			ApplicationsOfArray.click();
		}
		public void PQinArray() {
			PQinArray.click();	
		}
		public void SquaresOfaSortedArray() {
			
			SquaresOfaSortedArray.click();	
		}
		public void ClickTryHere() {
			TryHere.click();
		}
		
		public void PrintCode(String Code) 
		{
			WebElement focuselement=driver.switchTo().activeElement();
			focuselement.sendKeys(Code);
		}
		
		
		public void  run() {
			run.click();
		}
		public void Submit() {
			Submit.click();
		}
		
}
