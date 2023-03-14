package newProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class OpenTask {
	
	@FindBy(linkText = "Projects & Customers")
	WebElement ProjectsAndCustomerslink;
	
	public OpenTask()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void clickOnProjectsAndCustomersLink()
	{
		ProjectsAndCustomerslink.click();
	}

}
