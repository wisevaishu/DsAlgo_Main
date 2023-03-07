package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
