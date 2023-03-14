package newProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class ActiveProjectsAndCustomers {
	
	@FindBy(xpath ="//input[@value = 'Add New Project']")
	WebElement AddNewProjectbutton;
	
	@FindBy(xpath ="//span[@class = 'successmsg']")
	WebElement Successmsg;
	
	public ActiveProjectsAndCustomers()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void clickOnAddNewProject()
	{
		AddNewProjectbutton.click();
	}
	
	public String retreiveSuccessmsg()
	{
		return Successmsg.getText();
	}

}
