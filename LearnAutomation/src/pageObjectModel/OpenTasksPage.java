package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class OpenTasksPage {
	
	@FindBy(linkText ="Projects & Customers")
	private WebElement ProjectsAndCustomerLink;
	
	public  OpenTasksPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnProjectsAndCustomersLink()
	{
		ProjectsAndCustomerLink.click();
	}

}
