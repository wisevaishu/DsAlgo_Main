package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class testRun 
{
	@CucumberOptions
	(		
		features = 
			{
				//"src/test/resources/Features/TestCasesAll.feature",
				"src/test/resources/Features/login.feature",
				//"src/test/resources/Features/registerExcel.feature",
				//"src/test/resources/Features/Home.feature"	
			},
		plugin = {"pretty", "html:target/SystemTestReports/index.html",  
				  "junit:target/SystemTestReports/junit/report.xml",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"				  
				  },
		monochrome=true,	
		dryRun=false,
		glue= {"stepDefinition"}		
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
