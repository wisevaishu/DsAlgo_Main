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
import utilities.LoggerLoad;

public class steps extends BaseClass
{			
	steps()
	{
		array = new Array();
	}
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
		LoggerLoad.info("Run Python Program Succesfully at Stack - Operations in Stack Page");		
	}
	//Array
	
	
	
	//@Given("I enter username and password")
	//public void i_enter_username_and_password() {
		//array= new Array();
		//array=
	    
	//}
	/*@Given("I enter username and password")
	public void i_enter_username_and_password() {
		
		array.SetUsername("sucithracj@gmail.com");
		
		array.SetPassword("suci@1993");
	   
	}*/
	@Given("The user click on the GetSTarted button in Array")
	public void the_user_click_on_the_get_s_tarted_button_in_array() {

		array.SelectArrays();
		
	}

	@Then("Open Array page")
	public void open_array_page() {
	 
		Assert.assertEquals(driver.getTitle(), "Array");
	}

	@Given("The user click on the ArraysInPython")
	public void the_user_click_on_the_arrays_in_python() {
		
	   array.SelectArraysInPython();
	}

	@Then("the User able to navigate about ArraysInPython")
	public void the_user_able_to_navigate_about_arrays_in_python() {
	   
		Assert.assertEquals(driver.getTitle(), " ArraysInPython");
	}

	@Given("the user click on the Try here button")
	public void the_user_click_on_the_try_here_button() {
	    
		array.ClickTryHere();
	}

	@Then("the user directed to text editor box of ArraysInPython")
	public void the_user_directed_to_text_editor_box_of_arrays_in_python() {
	    
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	
	@When("the user enter valid python code for Array in the text editor box")
	public void the_user_enter_valid_python_code_for_array_in_the_text_editor_box() {

		String code1 = "print 'Hello from Arrays'";
		   array.PrintCode(code1);
	}

	@When("click the run button")
	public void click_the_run_button() throws InterruptedException {
	   array.run();
	   Thread.sleep(3000);
	}

	@Then("the user gets the run result")
	public void the_user_gets_the_run_result() {
	   

		LoggerLoad.info("Run Python Program Succesfully at Stack - Operations in Stack Page");	
	}

	@Given("The user click on the ArraysUsingList")
	public void the_user_click_on_the_arrays_using_list() {
		
		array.SelectArraysUsingList();
	  	}

	@Then("Open ArraysUsingList page")
	public void open_arrays_using_list_page() {
		Assert.assertEquals(driver.getTitle(), "ArraysUsingList");
		
	   	}
	@When("the user enter valid python code for  ArraysUsingList in the text editor box")
	public void the_user_enter_valid_python_code_for_arrays_using_list_in_the_text_editor_box() {
	    
		String code2 = "print 'Hello from ArraysUsingList'";
		array.PrintCode(code2);
	}
	@Then("the user directed to text editor box of ArraysUsingList")
	public void the_user_directed_to_text_editor_box_of_arrays_using_list() {
		Assert.assertEquals(driver.getTitle(), "ArraysUsingList");
		
	    	}

	@Given("The user click on the BasicOperationsinLists")
	public void the_user_click_on_the_basic_operationsin_lists() {
		
		array.BasicOperationsinLists();
	   	}

	@Then("Open BasicOperationsinLists page")
	public void open_basic_operationsin_lists_page() {
		
		Assert.assertEquals(driver.getTitle(), "BasicOperationsinLists");
		
	}
	
	@When("the user enter valid python code in for BasicOperationsinLists  the text editor box")
	public void the_user_enter_valid_python_code_in_for_basic_operationsin_lists_the_text_editor_box() {
	    
		String code3 = "print 'Hello BasicOperationsinLists'";
		array.PrintCode(code3);
		
	}
    

	@Then("the user directed to text editor box of BasicOperationsinLists")
	public void the_user_directed_to_text_editor_box_of_basic_operationsin_lists() {
		
		Assert.assertEquals(driver.getTitle(), "BasicOperationsinLists");
		
	}

	@Given("The user click on the ApplicationsOfArray")
	public void the_user_click_on_the_applications_of_array() {
		
		array.ApplicationsOfArray();
		
	   	}

	@Then("Open ApplicationsOfArray page")
	public void open_applications_of_array_page() {
		
		Assert.assertEquals(driver.getTitle(), "ApplicationsOfArray");
	   
	}
	
	@When("the user enter valid python code for ApplicationsOfArray in the text editor box")
	public void the_user_enter_valid_python_code_for_applications_of_array_in_the_text_editor_box() {
	   
		
		String code4 = "print 'Hello ApplicationsOfArray'";
		array.PrintCode(code4);	
		
	}
	

	@Then("the user directed to text editor box of  ApplicationsOfArray")
	public void the_user_directed_to_text_editor_box_of_applications_of_array() {
		
		Assert.assertEquals(driver.getTitle(), "ApplicationsOfArray");
		   
		
	   	}

	@Given("The user click on the  PracticeQuestions")
	public void the_user_click_on_the_practice_questions() {
		
		array.PQinArray();
		
	   	}

	@Then("Open PracticeQuestions page")
	public void open_practice_questions_page() {
		
		Assert.assertEquals(driver.getTitle(), "PracticeQuestions");
		
	   	}

	@Given("The user click on the SquaresOfaSortedArray")
	public void the_user_click_on_the_squares_ofa_sorted_array() {
		
	array.SquaresOfaSortedArray();	
		
	    	}

	@Then("Open SquaresOfaSortedArray page")
	public void open_squares_ofa_sorted_array_page() {
		
		
		Assert.assertEquals(driver.getTitle(), "PracticeQuestions");
		
		}
	
	
	@When("the user enter valid python code for  PracticeQuestions in the text editor box")
	public void the_user_enter_valid_python_code_for_practice_questions_in_the_text_editor_box() {
	   
		String code5 = "print 'Hello SquaresOfaSortedArray'";
		array.PrintCode(code5);
		
	}


	@Then("the user directed to text editor box of SquaresOfaSortedArray")
	public void the_user_directed_to_text_editor_box_of_squares_ofa_sorted_array() {
		
		Assert.assertEquals(driver.getTitle(), "SquaresOfaSortedArray");
		
	   	}
}



	
	
	

	
	

	

	

	


