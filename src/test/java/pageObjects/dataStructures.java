package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class dataStructures extends stepDefinition.BaseClass 
{
	public WebDriver dsdriver;
	
	public dataStructures (WebDriver rdriver)
	{
		dsdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By GetStarted=By.xpath("//button[@class=\"btn\"]");
	By Signin=By.xpath("//a[@href=\"/login\"]");
	By Username=By.id("id_username");
	By Password=By.id("id_password");
	By Login=By.xpath("//input[@value=\"Login\"]");
	By DSGetStarted= By.xpath("//a[@href=\"data-structures-introduction\"]");
	By TimeComplexity=By.xpath("//a[@href=\"time-complexity\"]");
	By PracticeQuestions=By.xpath("//li[@class=\"list-group-item list-group-item-light \"]");
	By TryHere=By.xpath("//a[@href=\"/tryEditor\"]");
	By PrintCode=By.id("editor");
	
	public void test()
	{
		dsdriver.findElement(GetStarted).click();
		dsdriver.findElement(Signin).click();
		dsdriver.findElement(Username).sendKeys("sucithracj@gmail.com");
		dsdriver.findElement(Password).sendKeys("suci@1993");
		dsdriver.findElement(Login).click();
		dsdriver.findElement(DSGetStarted).click();
		dsdriver.findElement(TimeComplexity).click();
		dsdriver.findElement(PracticeQuestions).click();
		dsdriver.findElement(TryHere).click();
	}
}
