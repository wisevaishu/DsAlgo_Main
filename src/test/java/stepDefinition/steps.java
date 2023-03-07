package stepDefinition;

import java.time.Duration;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import pageObjects.validLogin;

public class steps extends BaseClass
{			
	//Linked List
	@Given("Click Linked list start button")
	public void click_linked_list_start_button() 
	{
		ll = new LinkedList();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ll.LinkedListGetStartedButtonClick();
	}
			
	@Given("Click Introduction Link")
	public  void click_introduction_link() 
	{		
		ll.LLIntroLinkClcik();
	}
			
	@Then("User should redirect to Introduction List Page")
	public  void user_should_redirect_to_introduction_list_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Introduction");
	}
			
	@When("User clicks try here button")
	public  void user_clicks_try_here_button() 
	{
		ll.LLTryHereButtonClick();
	}
			
	@When("user redirect to try editor page")
	public  void user_redirect_to_try_editor_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
			
	@When("user enter python program {string}")
	public  void user_enter_python_program(String string) 
	{
		RunPythonProgram();
	}
			
	@Then("python program print down")
	public  void python_program_print_down() 
	{
		ll.RunButtonClick();
		logger.info("Run Python Program Succesfully at Linked List - Introduction in Linked List Page");
		
	}
	
	// Stack
	@Given("The user clicks on Get Started tab of stack box")
	public void the_user_clicks_on_get_started_tab_of_stack_box()  
	{				
		s = new stack();
		s.stackgetclick();
	}
	@Then("The user directed to stack data structure page")
	public void the_user_directed_to_stack_data_structure_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Stack");
	}
	@When("The user click on operation in stack link")
	public void the_user_click_on_operation_in_stack_link() 
	{
		 s.opinstack();
	}
	@Then("The user directed to operation in stack page")
	public void the_user_directed_to_operation_in_stack_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Operations in Stack");
	}
	@When("The user click on try here button on operations in stack page")
	public void the_user_click_on_try_here_button_on_operations_in_stack_page() 
	{
		 s.optryhere();		
	}
	@Then("The user directed to Try Editor page of operations in stack page having run button to test")
	public void the_user_directed_to_try_editor_page_of_operations_in_stack_page_having_run_button_to_test() 
	{
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	@When("The user enter valid python code in tryEditor")
	public void the_user_enter_valid_python_code_in_try_editor() throws InterruptedException 
	{		
		s.RunPythonProgram();
		Thread.sleep(1000);
	}
	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() 
	{
		s.testCodeRunButton();
	}
	@Then("The user should be getting run result")
	public void the_user_should_be_getting_run_result() 
	{
		logger.info("Run Python Program Succesfully at Stack - Operations in Stack Page");		
	}
}
