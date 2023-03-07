package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import stepDefinition.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class LoginElements extends BaseClass
{
	public LoginElements() 
	{
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//input[@type='submit']") WebElement submit;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement successnerrormsg;
	@FindBy(xpath="//a[contains(text(),'Sign out')]") WebElement SignOutLink;
	
	public void setUsername(String name) 
	{
		username.sendKeys(name);
	}

	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}

	public void clickSubmit() 
	{
		submit.click();
	}

	public String retrieveMsg() 
	{
		return successnerrormsg.getText();
	}
	
	public void SignOutLinkClick()
	{
		SignOutLink.click();
	}
}
