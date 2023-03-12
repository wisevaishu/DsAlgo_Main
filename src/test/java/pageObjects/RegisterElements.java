package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.*;

public class RegisterElements  extends BaseClass 
{	
	public RegisterElements()
	{		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameinput;
	@FindBy(xpath = "//input[@name='password1']")
	WebElement passwordreg;
	@FindBy(xpath = "//input[@name='password2']")
	WebElement cnfmpasswordreg;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement registerbtn;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement retrievemsg;
	
	public void setregUsername(String username) 
	{
		usernameinput.sendKeys(username);
	}

	public void setregPassword(String regpwd) 
	{
		passwordreg.sendKeys(regpwd);
	}

	public void cnfmpasswordreg(String cnfmpwd) 
	{
		cnfmpasswordreg.sendKeys(cnfmpwd);
	}

	public void clickRegister() 
	{
		registerbtn.click();
	}

	public String printRetrievemsg() 
	{
		try 
		{
			return retrievemsg.getText();
		} 
		catch (NoSuchElementException e) 
		{
			if (usernameinput.getAttribute("value").isEmpty()) 
			{
				return usernameinput.getAttribute("validationMessage");
			} 
			else if (passwordreg.getAttribute("value").isEmpty()) 
			{
				return passwordreg.getAttribute("validationMessage");
			} 
			else if (cnfmpasswordreg.getAttribute("value").isEmpty()) 
			{
				return cnfmpasswordreg.getAttribute("validationMessage");
			}
		}
		return "";
	}	
}
