package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;

public class testUtil 
{
	public static void explicitWait(WebDriver driver, int Seconds, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void JSClick(WebDriver driver, WebElement ele)
	{
		testUtil.explicitWait(driver, 10, ele);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", ele);
		
	}
	
	public static void sendKeys(WebDriver driver, WebElement ele, String txt)
	{
		testUtil.explicitWait(driver, 10, ele);
		ele.clear();
		ele.sendKeys(txt);
	}
	
	public Boolean JSCheckValidity(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Boolean is_valid = (Boolean) js.executeScript("return arguments[0].checkValidity();", ele);
		return is_valid;
	}
	
	public String UserData()
	{
		String Random_USERNAME = RandomStringUtils.randomAlphanumeric(15);
		return Random_USERNAME;
	}
	
	
}
