package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;

import io.qameta.allure.Attachment;
import stepDefinition.*;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TestListener extends BaseClass implements ITestListener
{
	@Attachment(value = "Page Screenshot", type= "image/png")
	public byte[] saveScreenshotPNG (WebDriver driver)
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "Page Screenshot", type= "image/jpeg")
	public byte[] saveScreenshotPNG (String wrongpythoncode) throws IOException, AWTException
	{
		// Creating Robot class object
		Robot robotClassObject = new Robot();
		// Get screen size
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// Capturing screenshot by providing size
		BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
		// Defining destination file path
		String path = ".\\src\\test\\resources\\Screenshots\\"+"wrongpythoncode"+".jpeg";
 		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(tmp, "png", baos);
		byte[] byteArr = baos.toByteArray();
		return byteArr;
		
	}
	
	@Attachment(value="Message", type="text/plain")
	public String saveTextLog (String message)
	{
		return message;
		
	}
	
    
}
