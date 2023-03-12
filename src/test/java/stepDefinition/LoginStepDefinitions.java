package stepDefinition;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginElements;
import pageObjects.validLogin;

public class LoginStepDefinitions extends BaseClass
{
	
	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_username_and_password(String arg1, String arg2) 
	{
		vl=new validLogin();
		vl.SignInLinkClick();
		le = new LoginElements();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (arg1.equalsIgnoreCase("config_user")) 
		{
			le.setUsername(username);
			le.setPassword(password);			
		}
		else
		{
			le.setUsername(arg1);
			le.setPassword(arg2);
		}
	}

	@When("^I click Login button$")
	public void i_click_login_button() throws IOException 
	{
		le.clickSubmit();
		Screenshot("Login Page");
	}

	@Then("Success message {string} is displayed")
	public void success_message_is_displayed(String message) throws IOException 
	{
		Assert.assertEquals(le.retrieveMsg(), message);		
	}

	@Then("Error message {string} is displayed")
	public void error_message_is_displayed(String message) throws IOException 
	{
		Assert.assertEquals(le.retrieveMsg(), message);
	}
}
