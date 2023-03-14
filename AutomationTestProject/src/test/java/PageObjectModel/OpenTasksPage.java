package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage {
	
	@FindBy(linkText ="Projects & Customers")
	private WebElement projectsandcustomerslink;
	
	public OpenTasksPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnProjectsAndCustomerLink()
	{
		projectsandcustomerslink.click();
	}
	

}
