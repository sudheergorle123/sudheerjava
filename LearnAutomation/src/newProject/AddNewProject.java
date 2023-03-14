package newProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import inheritance.BaseClass;

public class AddNewProject {
	
	@FindBy(name = "customerId")
	WebElement CustomerDropdown;
	
	@FindBy(name = "name")
	WebElement ProjectName;
	
	@FindBy(name = "createProjectSubmit")
	WebElement Clicksubmit;
	
	public AddNewProject()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void customerlist(String cn)
	{
		Select s1 = new Select(CustomerDropdown);
		s1.selectByVisibleText(cn);
	}
	
	public void enterProjectName(String pn)
	{
		ProjectName.sendKeys(pn);
	}
	
	public void clickOnCreateProject()
	{
		Clicksubmit.click();
	}

}
