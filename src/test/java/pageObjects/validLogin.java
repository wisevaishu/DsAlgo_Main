package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.BaseClass;

public class validLogin extends BaseClass
{
	
	public validLogin ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[contains(text(), 'Sign in')]") WebElement SignInLink;
	@FindBy (xpath="//input[@id='id_username']") WebElement UserNameTextBox;
	@FindBy (xpath="//input[@id='id_password']") WebElement PasswordTextBox;
	@FindBy (xpath="//input[@value='Login']") WebElement LoginButton;
	
	public void SignInLinkClick()
	{
		SignInLink.click();
	}
	
	public void UserNameValue(String UserName)
	{
		UserNameTextBox.sendKeys(UserName);
	}
	
	public void TextBoxValue(String Password)
	{
		PasswordTextBox.sendKeys(Password);
	}
	
	public void LoginButtonClick() 
	{		
		LoginButton.click();
	}
}
