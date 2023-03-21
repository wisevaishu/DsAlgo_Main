package stepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utilities.*;
import java.awt.AWTException;

public class steps extends BaseClass
{	
	TestListener tl = new TestListener();
	List<Map<String, String>> QueueLinks;
	ExcelReader reader = new ExcelReader();
	public String MainLinkName="";
	public int ArrayPracticeQuestions=0;
		
	//common
	@When("User clicks current Type Here button in page in {string}")
	public void user_clicks_current_type_here_button_in_page_in(String classname) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		CurrentTypeHereButtonClick(driver);
		LoggerLoad.info("User clicks type here button in " + classname);
	}
	
	@When("user enter python program in {string}")
	public void user_enter_python_program_in(String classname) throws InterruptedException, IOException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RunPythonProgram();
		CurrentRunButtonClick(driver);	
		Thread.sleep(1000);
		LoggerLoad.info("User enter python program in " + classname);
	}	
	
	@Then("python program print down in {string}")
	public void python_program_print_down_in(String classname) 
	{
		LoggerLoad.info("Run Python Program Succesfully at " + classname);
	}
	
	@Then("User get Output of Programs in {string}")
	public void user_get_output_of_programs_in(String classname)
	{
		LoggerLoad.info("Output of the Program displayed at " + classname);
	}	
	
	@Then("User enter {string}")
	public void user_enter(String program) throws InterruptedException 
	{
		RunPythonProgram(program);
		CurrentRunButtonClick(driver);
		Thread.sleep(1000);
		if (program.equals("welcome"))
		{
			driver.switchTo().alert().accept();
			LoggerLoad.info("User enter wrong python code");
		}
		else
		{
			LoggerLoad.info("User enters valid python code");
		}
	}	
	
	// Linked List - Creating Linked List
	//All from Common Functions (Linked List - Creating Linked List)
	
	//Linked List
	@Given("Click Linked list start button")
	public void click_linked_list_start_button() 
	{
		ll = new LinkedList();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ll.LinkedListGetStartedButtonClick();
		LoggerLoad.info("User Clicked Get Started Button Of LinkedList");
	}
				
	@Given("Click Introduction Link")
	public  void click_introduction_link() 
	{		
		ll.LLIntroLinkClcik();
		LoggerLoad.info("User Clicked Linked List - Introduction");
	}
				
	@Then("User should redirect to Introduction List Page")
	public  void user_should_redirect_to_introduction_list_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Introduction");
		LoggerLoad.info("User redirected to Linked List - Introduction List Page");
	}	
	
	// Stack
	@Given("The user clicks on Get Started tab of stack box")
	public void the_user_clicks_on_get_started_tab_of_stack_box()  
	{				
		s = new stack();
		s.stackgetclick();
		LoggerLoad.info("User Clicks on Get Started Button of Stack");
	}
	@Then("The user directed to stack data structure page")
	public void the_user_directed_to_stack_data_structure_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Stack");
		LoggerLoad.info("User directed to the Stack - Data Structure Page");
	}
	@When("The user click on operation in stack link")
	public void the_user_click_on_operation_in_stack_link() 
	{
		 s.opinstack();
		 LoggerLoad.info("User click Stack - Operation Sublink");		 
	}
	@Then("The user directed to operation in stack page")
	public void the_user_directed_to_operation_in_stack_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Operations in Stack");
		LoggerLoad.info("User directed to the Stack - Operation sublink");
	}
	@Then("The user should be getting run result")
	public void the_user_should_be_getting_run_result() 
	{
		LoggerLoad.info("Run Python Program Succesfully at Stack - Operations in Stack Page");		
	}
	
	//Data Structures
	@Given("The user clicks on Get Started tab button in data structures page")
	public void the_user_clicks_on_get_started_tab_button_in_data_structures_page() 
	{
		ds = new dataStructures();
		ds.setGetStarted();
		LoggerLoad.info("User Click Data Structure Get Started Button");
	}
	@Then("The user directed to data structures page")
	public void the_user_directed_to_data_structures_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Data Structures-Introduction");
		LoggerLoad.info("User directed to Data Structures - Introduction");		
	}
	@When("click time complexity link in data structures page")
	public void click_time_complexity_link_in_data_structures_page() 
	{
		ds.setTimeComplexityLinkClick();
		LoggerLoad.info("User Click Data Structures - Time Complexity");
	}
	@Then("directed to time complexity page in data structures page")
	public void directed_to_time_complexity_page_in_data_structures_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Time Complexity");
		LoggerLoad.info("User directed to Data Structures - Time Complexity");		
	}

	@Then("user redirect to try editor page of time complexity in data structures page")
	public void user_redirect_to_try_editor_page_of_time_complexity_in_data_structures_page()
	{
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerLoad.info("User directed to the try editor button page of Data Structures - Time Complexity");
	}
	@When("user enter python program of time complexity in data structures page")
	public void user_enter_python_program_of_time_complexity_in_data_structures_page() 
	{
	    RunPythonProgram();	    
	}

	@Then("python program print down in time complexity in data structures page")
	public void python_program_print_down_in_time_complexity_in_data_structures_page() 
	{
		LoggerLoad.info("Python Program Printed Successfully @ Data Structures - Time Complexity");	
	}
		
	// Stack - Application Link
	@Given("The user in Home Page")
	public void the_user_in_home_page() 
	{
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
		LoggerLoad.info("User is In Stack - Application Link");
	}
	@When("The user click on Application link in stack page")
	public void the_user_click_on_application_link_in_stack_page() 
	{
		s.application();
		LoggerLoad.info("User Clicked Stack Page - Application Link");
	}
	@Then("The user directed to Application Link Page of Stack")
	public void the_user_directed_to_application_link_page_of_stack() 
	{
		Assert.assertEquals(driver.getTitle(), "Applications");	
		LoggerLoad.info("User directed to Application Link Page of Stack");
	}
	@When("The User click run button with wrong code")
	public void the_user_click_run_button_with_wrong_code() throws InterruptedException, IOException, AWTException 
	{		
		RunWrongPythonProgram();
		CurrentRunButtonClick(driver);
		Thread.sleep(1000);
		Screenshot("Wrongpythoncode", "WithAlertScreenshot");
		tl.saveScreenshotPNG("wrongpythoncode");
		driver.switchTo().alert().accept();
		LoggerLoad.info("Entered Wrong Python Code in Stack - Application");
	}
	
	// Stack - Implementation Link
	@Given("The user clicks on Get Started button in Stack")
	public void the_user_clicks_on_get_started_button_in_stack() 
	{
		s = new stack();
		s.stackgetclick();
		LoggerLoad.info("User is In Stack Page");
	}
	
	@When("The user click on Implementation link in stack page")
	public void the_user_click_on_implementation_link_in_stack_page() 
	{		
		s.implementation();
		LoggerLoad.info("User is In Stack - Implementation");
	}
	
	@Then("The user directed to implementation page of stack")
	public void the_user_directed_to_implementation_page_of_stack() 
	{
		Assert.assertEquals(driver.getTitle(), "Implementation");
		LoggerLoad.info("User directed to implementation page of stack");
	}
	
	// Graph - Graph
	@Given("Click Graph get started button")
	public void click_graph_get_started_button() 
	{
		g = new GraphElements();
		g.GraphGetStartedButtonclick();
		LoggerLoad.info("User Clicking Graph Get Started Button");
	}
	@Given("Click Graph Link")
	public void click_graph_link() 
	{
		g.GraphLinkclick();
		LoggerLoad.info("User Clicking Graph Link in Graph");
	}
	@Then("User should redirect to Graph Page having try here button")
	public void user_should_redirect_to_graph_page_having_try_here_button() 
	{
		Assert.assertEquals(driver.getTitle(), "Graph");
		LoggerLoad.info("User should redirect to Graph Page having try here button");
	}
	
	@Then("python program print down in Graph - Graph Page")
	public void python_program_print_down_in_graph_graph_page() 
	{
		LoggerLoad.info("Python Program Printed Successfully Graph - Graph Link");		
	}
		
	// Graphs - Representation
	@Given("Click Graph Representation Link")
	public void click_graph_representation_link() 
	{
		g.GraphRepresentationsLinkclick();
		LoggerLoad.info("User is In Graph - Graph Representation");
	}
	
	@Then("User should redirect to Graph Representation Page having try here button")
	public void user_should_redirect_to_graph_representation_page_having_try_here_button() 
	{
		Assert.assertEquals(driver.getTitle(), "Graph Representations");
		LoggerLoad.info("User should redirect to Graph Representation Page having try here button");		
	}
	
	@Then("python program print down in Graph - Representation Page")
	public void python_program_print_down_in_graph_representation_page() 
	{
		LoggerLoad.info("Python Program Printed Successfully Graph - Representation in Python Program");
	}
	
	//Array

	@Given("Click Array Get Started  button")
	public void click_array_get_started_button() 
	{
		a=new Array();
		a.ClickArrayGetStartedButton();
		LoggerLoad.info("User Clicked Array Get Started Button");
	}
	
	@Given("Click Array - Arrays in python link")
	public void click_array_arrays_in_python_link() 
	{
		a.ClickArraysInPythonLinkClick();
		LoggerLoad.info(" User is In Array - Arrays in Python Link");
		
	}	
	
	@Then("python program print down in Array - Arrays in Python link")
	public void python_program_print_down_in_array_arrays_in_python_link() 
	{
		LoggerLoad.info("Python Program Printed Successfully Array - Array in Python");
	}
	
	// Arrays - Arrays using List

	@Given("The user click on the ArraysUsingList")
	public void the_user_click_on_the_arrays_using_list() 
	{
		a=new Array();
		a.SelectArraysUsingList();
		LoggerLoad.info("User is In Array - Arrays Using List");
	}

	@Then("Open ArraysUsingList page")
	public void open_arrays_using_list_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Arrays Using List");
		LoggerLoad.info("User redirected to Array Using List Page in Array");
    }
	
	// Arrays - Practice Question
	@Given("The user click on the  PracticeQuestions")
	public void the_user_click_on_the_practice_questions() 
	{
		a.PQinArray();
	}
	
	@Then("Open PracticeQuestions page")
	public void open_practice_questions_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}
	
	@Then("The user click on the SquaresOfaSortedArray")
	public void the_user_click_on_the_squares_ofa_sorted_array() 
	{
		a.SquaresOfaSortedArray();	
	}
	
	@Then("Open SquaresOfaSortedArray page")
	public void open_squares_ofa_sorted_array_page() 
	{
		Assert.assertEquals(driver.getTitle(), "Assessment");
		
		ArrayPracticeQuestions=1;
	}
	
	// Queue
	
	@Given("User navigate to queue page")
	public void user_navigate_to_queue_page() 
	{
		he=new HomeElements();
		he.DropDownLinksClick("Data Structures");
		he.DropDownLinksClick("Queue");
		Assert.assertEquals(driver.getTitle(), "Queue");
		LoggerLoad.info("In Queue");
	}
	
	@When("User clicks each link from excel {string} and click Try here and Run button with valid python code")
	public void user_clicks_each_link_from_excel_and_click_try_here_and_run_button_with_valid_python_code(String sheetname) throws InvalidFormatException, IOException, InterruptedException 
	{
		QueueLinks= reader.getData(System.getProperty("user.dir") + "/src/test/resources/Exceldata/QueueLinkList.xlsx", sheetname);
		for(int i =0;i<QueueLinks.size();i++) 
		{
			String LinkClickString=QueueLinks.get(i).get("QueueLinkList");
			he.DropDownLinksClick(LinkClickString);
			CurrentTypeHereButtonClick(driver);
			RunPythonProgram();
			CurrentRunButtonClick(driver);	
			Thread.sleep(1000);
			driver.navigate().back();
		}
		LoggerLoad.info("Validate valid program in all sublinks of queue");
	}
	
	@Then("User should get to see Print Program")
	public void user_should_get_to_see_print_program() 
	{
		LoggerLoad.info("Python Program Printed Successfully Queue");
	}
	
	// Tree - Overview 
	//Common Functions
	@Given("User clicks {string} Drop Down")
	public void user_clicks_drop_down(String datastructures) 
	{
		he=new HomeElements();
		he.DropDownLinksClick(datastructures);
		LoggerLoad.info("In " + datastructures + " page");
	}
	
	//Common Functions
	@Then("User Clicks {string} List")
	public void user_clicks_list(String dropdownlistlink) 
	{
		he.DropDownLinksClick(dropdownlistlink);
		LoggerLoad.info("In " + dropdownlistlink + " page");
		MainLinkName=dropdownlistlink;
	}
	
	//Common Functions
	@Then("User Clicks {string} Link")
	public void user_clicks_link(String sublinks) 
	{
		he.DropDownLinksClick(sublinks);
		LoggerLoad.info("In " + MainLinkName + "-"  +sublinks+ " page");
	}
	
	@Then("User checks python result")
	public void user_checks_python_result() 
	{
		ll=new LinkedList();
		if (ll.CheckProgramPrinted())
		{
			LoggerLoad.info("Python Program Printed Successfully in Tree - Overview Of Tree Page");
		}
		else
		{
			LoggerLoad.info("Invalid Program in Tree - Overview Of Tree Page");
		}
	}

	//Tree - Terminologies

	@Then("No Program Prints")
	public void no_program_prints() 
	{
		LoggerLoad.info("Wrong Python Code Prints in Tree - Terminologies Page");
	}
	
	//Tree - Types Of Tree
	@Then("The User click run button with no code")
	public void the_user_click_run_button_with_no_code() 
	{
		CurrentRunButtonClick(driver);		
	}
	
	@Then("No Program Prints in Tree - Types of Trees")
	public void no_program_prints_in_tree_types_of_trees() 
	{
		LoggerLoad.info("No Program runs in Tree - Types of Trees");
	}
	
	
	// Tree - Rest Of Links
	
	@Then("User Clicks Following Links one by one")
	public void user_clicks_following_links_one_by_one(io.cucumber.datatable.DataTable LinksNamesFromFeature) throws InterruptedException 
	{	
		he=new HomeElements();
		for (int i=0; i<LinksNamesFromFeature.asList().size();i++)
		{
			String LinkClickString=LinksNamesFromFeature.asList().get(i);
			he.DropDownLinksClick(LinkClickString);
			CurrentTypeHereButtonClick(driver);
			RunPythonProgram();
			CurrentRunButtonClick(driver);	
			Thread.sleep(1000);
			driver.navigate().back();
		}
		LoggerLoad.info("Validate valid program in all sublinks of Tree");
	}
	
	@Then("User checks python result in all links")
	public void user_checks_python_result_in_all_links() 
	{
		LoggerLoad.info("Python Program Print Successfully in all of the Tree Links");
	}
}