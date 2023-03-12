package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.BaseClass;

public class GraphElements extends BaseClass
{
	public GraphElements()
	{		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='graph']") WebElement GraphGetStartedButton;	
	@FindBy(xpath = "//a[@href='graph']") WebElement GraphLink;
	@FindBy(xpath = "//a[@href='graph-representations']") WebElement GraphRepresentationsLink;
	
	public void GraphGetStartedButtonclick() 
	{
		GraphGetStartedButton.click();
	}
	public void GraphLinkclick() 
	{
		GraphLink.click();
	}		
	public void GraphRepresentationsLinkclick() 
	{
		GraphRepresentationsLink.click();
	}
}
