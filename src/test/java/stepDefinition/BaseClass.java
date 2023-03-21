package stepDefinition;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import utilities.*;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.*;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class BaseClass 
{
	ReadConfig readconfig= new ReadConfig();
	
	public static WebDriver driver;
	
	public String baseURL=readconfig.getApplicationURL();
	public String username = readconfig.getUserName();
	public String password =readconfig.getPassword();
	public String browser =readconfig.getBrowser();
	public String code =readconfig.getCode();
	public String registraionURL=readconfig.getRegistrationURL();
	public String HomeURL=readconfig.getHomeURL();
		
	public dataStructures ds;
	public validLogin vl;
	public stack s;
	public LinkedList ll;
	public LoginElements le;
	public Array a;
	public RegisterElements re;
	public HomeElements he;
	public GraphElements g;
	
	public static LoggerLoad logger = new LoggerLoad();
	public static int ToggleURL =0;

	public synchronized void setup(String br)
	{		
		if(br.equals("chrome"))
		{				
			if (ToggleURL==0)
			{
				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\ChromeDriver110\\chromedriver.exe");
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver (options);
				driver.get(HomeURL);
				driver.manage().window().maximize();				
				he = new HomeElements();
				he.HomeGetStartedButtonClick();
				ToggleURL=1;
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\ChromeDriver110\\chromedriver.exe");
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver (options);
				
			}
		}	
		else  if (br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (br.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
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
		LoggerLoad.info("Running Valid Python Code");
	}
	
	public void RunWrongPythonProgram()
	{		
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys("Welcome Numpy Ninja");
	}
	
	public void RunPythonProgram(String CodeFromFeature)
	{		
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(CodeFromFeature);
	}
	
	public static void Screenshot(String Stepname) throws IOException
	{
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
				
		String path = ".\\src\\test\\resources\\Screenshots\\"+Stepname+".jpeg";
		
		File destFile = new File (path);
		FileUtils.copyFile(srcFile,destFile);
	}	
	
	public static void Screenshot(String Stepname, String Wrongpythoncode) throws AWTException, IOException
	{
		Robot robotClassObject = new Robot();
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
		String path = ".\\src\\test\\resources\\Screenshots\\"+"wrongpythoncode"+".jpeg";
		ImageIO.write(tmp, "png",new File(path)); 
	}
	
	public void CurrentTypeHereButtonClick(WebDriver currentDriver)
	{
		WebElement currentTypeHereButton = currentDriver.findElement(By.xpath("//a[contains(text(),'Try here>>>')]"));
		currentTypeHereButton.click();
	}		
	
	public void CurrentRunButtonClick(WebDriver currentDriver)
	{
		WebElement currentRunButton = currentDriver.findElement(By.xpath("//button[contains(text(),'Run')]"));
		currentRunButton.click();
		logger.info("Clicking Run Button");
	}		
}
