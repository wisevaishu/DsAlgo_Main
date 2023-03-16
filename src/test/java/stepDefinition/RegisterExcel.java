package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Epic;
import pageObjects.*;
import utilities.ExcelReader;

import utilities.TestListener;
import utilities.testUtil;

@Epic ("Ds-Algo Register Page")
@Listeners ({TestListener.class})
public class RegisterExcel extends BaseClass
{
	String expectedmessage,status, username;
	TestListener tl = new TestListener();
	testUtil tu = new testUtil();
	
	
	
	@Given("User navigate to Register page")
	public void user_navigate_to_register_page() 
	{
		he=new HomeElements();
		he.clickregisterurl();
	}	
	
	@When("User enters user data {string} and {int}")
	public void user_enters_user_data_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException
	{
		re=new RegisterElements();
		
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(System.getProperty("user.dir") + "/src/test/resources/Exceldata/Registration.xlsx", sheetname);
		username = testdata.get(rownumber).get("username");	
		if (username.equals("RandomUser"))
		{
			username = tu.UserData();
		}
		
		String password = testdata.get(rownumber).get("password");
		String confirmpassword = testdata.get(rownumber).get("confirmpassword");
		
		expectedmessage = testdata.get(rownumber).get("expectedmessage");
		if (expectedmessage.equals("New Account Created. You are logged in as"))
		{
			expectedmessage = "New Account Created. You are logged in as " + username;
		}
				
		status = testdata.get(rownumber).get("status");
		re.setregUsername(username);
		re.setregPassword(password);
		re.cnfmpasswordreg(confirmpassword);		
	}
	
	@When("User clicks Register button")
	public void user_clicks_register_button() throws IOException 
	{
		re.clickRegister();
		if (status.equals("valid"))
		{			
			Screenshot("LoginSuccesfulPage");
			tl.saveScreenshotPNG(driver);
			tl.saveTextLog(expectedmessage);			
		}
		else if (status.equals("invalid"))
		{
			Screenshot("passwordMismatch");
			tl.saveScreenshotPNG(driver);
			tl.saveTextLog(expectedmessage);
		}
		else if (status.equals("passwordempty"))
		{
			Screenshot("passwordempty");
			tl.saveScreenshotPNG(driver);
			tl.saveTextLog(expectedmessage);
		}
		else if (status.equals("cpasswordempty"))			
		{
			Screenshot("currentpasswordempty");
			tl.saveScreenshotPNG(driver);
			tl.saveTextLog(expectedmessage);
		}
		else if (status.equals("usernameempty"))
		{
			Screenshot("usernameempty");
			tl.saveScreenshotPNG(driver);
			tl.saveTextLog(expectedmessage);
		}
	}
	
	@Then("User sees a an approriate message")
	public void user_sees_a_an_approriate_message() 
	{
		
		//if (username.equals("RandomUser"))
		if (status.equals("valid"))
		{
			Assert.assertEquals(re.printRetrievemsg(), expectedmessage);
		}
		Assert.assertEquals(re.printRetrievemsg(), expectedmessage);		
	}
}
