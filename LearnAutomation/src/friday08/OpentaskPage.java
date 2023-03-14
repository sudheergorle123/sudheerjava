package friday08;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class OpentaskPage {
	
	@FindBy(linkText ="Projects & Customers")
	private WebElement ProjectsandCustomerlink;
	
	public OpentaskPage() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnProjectsAndCustomers()
	{
		ProjectsandCustomerlink.click();
	}

}
