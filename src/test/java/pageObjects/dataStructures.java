package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.BaseClass;

public class dataStructures extends BaseClass 
{	
	public dataStructures ()
	{		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//h5[contains(text(), 'Data Structures-Introduction')]/following::a[1]") WebElement dsGetStartedButton;
	@FindBy (xpath="//a[@href='time-complexity']")WebElement dsTimeComplexityLink;	
	
	public void setGetStarted() 
	{
		dsGetStartedButton.click();
	}
	
	public void setTimeComplexityLinkClick() 
	{
		dsTimeComplexityLink.click();
	}
}
