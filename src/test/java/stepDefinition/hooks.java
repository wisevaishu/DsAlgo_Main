package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;

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
	public void tearDown()
	{		
		driver.quit();
	}	
}
