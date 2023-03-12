package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomeElements;
import utilities.ExcelReader;

public class HomeStepDefinition extends BaseClass
{
	ExcelReader reader = new ExcelReader();
	String links;
	List<Map<String, String>> homelinks;
	
	@Given("User navigate to home page")
	public void user_navigate_to_home_page() 
	{
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}
		
	@When("User clicks get started button of each link from excel {string}")
	public void user_clicks_get_started_button_of_each_link_from_excel(String sheetname) throws InvalidFormatException, IOException
	{
		he=new HomeElements();
		homelinks= reader.getData(System.getProperty("user.dir") + "/src/test/resources/Exceldata/HomeLinksList.xlsx", sheetname);
		
		for(int i =0;i<homelinks.size();i++) 
		{			 
			String LinkClickString=homelinks.get(i).get("HomeListLinks");
			he.LinkClick(LinkClickString);			
			Screenshot("withoutloginclickinggetstarted");
		}		
	}
	
	@When("User clicks links from Drop-Down from excel {string}>")
	public void user_clicks_links_from_drop_down_from_excel(String string) throws IOException 
	{		
		String DataStructureDropDownLink=homelinks.get(0).get("ListLinks");
		
		for(int i =1;i<homelinks.size();i++) 
		{	
			he.DropDownLinksClick(DataStructureDropDownLink);
			Screenshot("checkingdropdownlistlinkswithoutsignin");
			String DropDownLinkNameString=homelinks.get(i).get("ListLinks");
			he.DropDownLinksClick(DropDownLinkNameString);			
		}		
	}
	
	@Then("User Should not go further")
	public void user_should_not_go_further() throws IOException 
	{
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}	
}
