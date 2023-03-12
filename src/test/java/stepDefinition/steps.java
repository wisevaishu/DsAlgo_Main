package stepDefinition;

import java.io.IOException;
import java.time.Duration;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utilities.*;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class steps extends BaseClass
{	
	TestListener tl = new TestListener();
	
	//common
	@When("User clicks current Type Here button in page")
	public void user_clicks_current_type_here_button_in_page() throws InterruptedException 
	{
		CurrentTypeHereButtonClick(driver);		
	}
	@When("user enter python program")
	public void user_enter_python_program() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RunPythonProgram();
		CurrentRunButtonClick(driver);	
		Thread.sleep(1000);
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
	
	@Then("python program print down")
	public  void python_program_print_down() throws IOException 
	{		
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
	@Then("The user should be getting run result")
	public void the_user_should_be_getting_run_result() 
	{
		logger.info("Run Python Program Succesfully at Stack - Operations in Stack Page");		
	}
	
	//Data Structures
	@Given("The user clicks on Get Started tab button in data structures page")
	public void the_user_clicks_on_get_started_tab_button_in_data_structures_page() 
	{
		ds = new dataStructures();
		ds.setGetStarted();
	}
	@Then("The user directed to data structures page")
	public void the_user_directed_to_data_structures_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Data Structures-Introduction");
	}
	@When("click time complexity link in data structures page")
	public void click_time_complexity_link_in_data_structures_page() 
	{
		ds.setTimeComplexityLinkClick();
	}
	@Then("directed to time complexity page in data structures page")
	public void directed_to_time_complexity_page_in_data_structures_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Time Complexity");		
	}

	@Then("user redirect to try editor page of time complexity in data structures page")
	public void user_redirect_to_try_editor_page_of_time_complexity_in_data_structures_page()
	{
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}
	@When("user enter python program of time complexity in data structures page")
	public void user_enter_python_program_of_time_complexity_in_data_structures_page() 
	{
	    RunPythonProgram();
	}

	@Then("python program print down in time complexity in data structures page")
	public void python_program_print_down_in_time_complexity_in_data_structures_page() 
	{
		logger.info("Python Program Printed Successfully @ Data Structures - Time Complexity");	
	}
	
	//Array

	@Given("Click Array Get Started  button")
	public void click_array_get_started_button() 
	{
		a=new Array();
		a.ClickArrayGetStartedButton();
    }
	@Given("Click Array - Arrays in python link")
	public void click_array_arrays_in_python_link() 
	{
		a.ClickArraysInPythonLinkClick();
    }	
	@Then("python program print down in Array - Arrays in Python link")
	public void python_program_print_down_in_array_arrays_in_python_link() 
	{
		logger.info("Python Program Printed Successfully Array - Array in Python");
	}
	
	// Stack - Implementation Link

	@Given("The user clicks on Get Started button in Stack")
	public void the_user_clicks_on_get_started_button_in_stack() 
	{
		s = new stack();
		s.stackgetclick();
	}
	@When("The user click on Implementation link in stack page")
	public void the_user_click_on_implementation_link_in_stack_page() 
	{		
		 s.implementation();
    }
	@Then("The user directed to implementation page of stack")
	public void the_user_directed_to_implementation_page_of_stack() 
	{
		Assert.assertEquals(driver.getTitle(), "Implementation");
	}
	
	// Stack - Application Link
	
	@Given("The user in Home Page")
	public void the_user_in_home_page() 
	{
		tl.saveTextLog("The User is in Home Page");
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	}
	@When("The user click on Application link in stack page")
	public void the_user_click_on_application_link_in_stack_page() 
	{
		s.application();
	}
	@Then("The user directed to Application Link Page of Stack")
	public void the_user_directed_to_application_link_page_of_stack() 
	{
		Assert.assertEquals(driver.getTitle(), "Applications");
	}
	@When("The User click run button with wrong code")
	public void the_user_click_run_button_with_wrong_code() throws InterruptedException, IOException, AWTException 
	{		
		RunWrongPythonProgram();
		CurrentRunButtonClick(driver);
		Thread.sleep(1000);
		Screenshot("Wrongpythoncode", "wrongcodescreenshot");
		tl.saveScreenshotPNG("wrongpythoncode");
		driver.switchTo().alert().accept();
	}	
	
	// Graph - Graph
	
	@Given("Click Graph get started button")
	public void click_graph_get_started_button() 
	{
		g = new GraphElements();
		g.GraphGetStartedButtonclick();
	}
	@Given("Click Graph Link")
	public void click_graph_link() 
	{
		g.GraphLinkclick();
	}
	@Then("User should redirect to Graph Page having try here button")
	public void user_should_redirect_to_graph_page_having_try_here_button() 
	{
		Assert.assertEquals(driver.getTitle(), "Graph");
	}
	
	@Then("python program print down in Graph - Graph Page")
	public void python_program_print_down_in_graph_graph_page() 
	{
		logger.info("Python Program Printed Successfully Graph - Graph Link");
	}
	
	// Graphs - Representation
	
	@Given("Click Graph Representation Link")
	public void click_graph_representation_link() 
	{
		g.GraphRepresentationsLinkclick();
	}
	
	@Then("User should redirect to Graph Representation Page having try here button")
	public void user_should_redirect_to_graph_representation_page_having_try_here_button() 
	{
		Assert.assertEquals(driver.getTitle(), "Graph Representations");
	}
	
	@Then("python program print down in Graph - Representation Page")
	public void python_program_print_down_in_graph_representation_page() 
	{
		logger.info("Python Program Printed Successfully Graph - Representation in Python Program");
	}
}
