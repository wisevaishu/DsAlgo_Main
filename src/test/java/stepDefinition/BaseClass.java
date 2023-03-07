package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.*;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.*;

public class BaseClass 
{
	ReadConfig readconfig= new ReadConfig();
	
	public static WebDriver driver;
	
	public String baseURL=readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password =readconfig.getPassword();
	public String browser =readconfig.getBrowser();
	public String code =readconfig.getCode();
		
	public dataStructures ds;
	public validLogin vl;
	public stack s;
	public LinkedList ll;
	public LoginElements le;
	
	public static LoggerLoad logger;
	

	public synchronized void setup(String br)
	{		
		if(br.equals("chrome"))
		{
			logger.info("Ds-Algo Project" + BaseClass.class);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}		
		driver.get(baseURL);
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public void RunPythonProgram()
	{
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(code);
	}
	
	public String GetStartedButtonXpath(String DataStructuresName)
	{
		return "//a[@href='"+DataStructuresName+"']";
		
	}
	
	
}
