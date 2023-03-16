package stepDefinition;






import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.internal.ExitCode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import net.bytebuddy.asm.Advice.Exit;
import pageObjects.HomeElements;





public class hooks extends BaseClass
{	

	
	@Before
	public void Open_Browser()
	{
		
		setup(browser);
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
	}
	
	
	
	@After
	public void tearDown(Scenario scenario) throws IOException
	{	        
		 if(scenario.getStatus()==Status.FAILED)
		 {
			 
			 final byte[] screenshot = 
			((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	     }   
		 
		 else if (scenario.getStatus()==Status.PASSED)
		 {
			 System.out.println(scenario.getId() + " " + scenario.getName() + " " + scenario.getLine() + " " + scenario.getClass() + " " + scenario.getSourceTagNames() + " " + scenario.getUri());
		 }
		 
		driver.quit();
		
		 
	}	
}
