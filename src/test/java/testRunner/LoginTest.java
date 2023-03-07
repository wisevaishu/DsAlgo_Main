package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class LoginTest
{
	@CucumberOptions
	(
			features = "src/test/resources/Features/login.feature", 
			glue = { "stepDefinition/LoginStepDefinitions.java" }, 
			plugin = { "pretty",
					"html:target/SystemTestReports/index.html", "json:target/SystemTestReports/json/report.json",
					"junit:target/SystemTestReports/junit/report.xml" }, 
			dryRun = true, 
			monochrome = true
	)
	
	public class TestRun extends AbstractTestNGCucumberTests
	{
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() 
		{				
			return super.scenarios();
	    }
	}
}
