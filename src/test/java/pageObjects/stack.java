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
	
//	public void enteremail(String emailadd) 
//	{
//		email.sendKeys(emailadd);
//	}
//	
//	public void enterpassword(String pwd) 
//	{
//		password.sendKeys(pwd);
//	}
//	
//	public void clickonloginbttn() 
//	{
//		loginbttn.click();	
//	}
//		
//	
//	
//	
//	
//	public void practicQ() 
//	{
//		PracticeQuestiontab.click();
//	}
//	
//	public void optryhere() 
//	{
//		operatryHereTab.click();
//	}
//	
//	public void testCode1() throws InterruptedException 
//	{
//		WebElement focuselement = driver.switchTo().activeElement();
//		focuselement.sendKeys(code);
//	}
//	
//	public void testCodeRunButton() 
//	{
//		runButton1.click();
//	}
//	
//
//	
//	public void implementationtryhere() 
//	{
//		impletryHeretab.click();
//	}
//	
//	public void testCode2() 
//	{
//		testCode2.sendKeys("print(\"Hello World\"");	
//	}
//	
//	public void testCodeRunButton2() 
//	{
//		runButton1.click();
//	}	
//	
//	public void applicationtryheretab() 
//	{
//		applitryHeretab.click();
//	}
//	@FindBy(id = "id_username" )
//	WebElement email;
//	
//	@FindBy (id = "id_password")
//	WebElement password;
//	
//	@FindBy (xpath = "//input[@type='submit']")
//	WebElement loginbttn;
//	
//
//	
//	
//	
//	@FindBy (xpath = "//a[@class='list-group-item list-group-item-light text-info']")
//	WebElement practicequestionTab;
//	
//	@FindBy(xpath = "//a[@class='btn btn-info']")
//	WebElement operatryHereTab;
//	
//	@FindBy (xpath = "//pre[@class=' CodeMirror-line ']")
//	WebElement testCode1;
//	
//	@FindBy (xpath = "//button[@type='button']")
//	WebElement runButton1;
//	
//
//	@FindBy (xpath = "//a[@class='btn btn-info']")
//	WebElement impletryHeretab;
//	
//	@FindBy (xpath = "//div[@class='CodeMirror-scroll']")
//	WebElement testCode2;
//	
//	
//	
//	@FindBy (xpath = " //a[@class='btn btn-info']")
//	WebElement applitryHeretab;
//	
//	@FindBy (xpath = "//a[@class='list-group-item list-group-item-light text-info']")
//	WebElement PracticeQuestiontab;
//	
//	@FindBy (xpath = "//button[@type='button']")
//	WebElement runButton;
}
