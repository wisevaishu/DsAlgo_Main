package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testRun 
{
	@CucumberOptions
	(		
		features = {"src/test/resources/Features/LinkedList.feature"
					,"src/test/resources/Features/stack.feature"
					,"src/test/resources/Features/login.feature"
					,"src/test/resources/Features/array.feature"
				},
		plugin = {"pretty", "html:target/SystemTestReports/index.html", "json:target/SystemTestReports/json/report.json", 
				  "junit:target/SystemTestReports/junit/report.xml"},
		monochrome=true,	
		dryRun=false,
		glue= "stepDefinition"
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
