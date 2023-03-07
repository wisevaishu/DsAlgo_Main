package stepDefinition;

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
