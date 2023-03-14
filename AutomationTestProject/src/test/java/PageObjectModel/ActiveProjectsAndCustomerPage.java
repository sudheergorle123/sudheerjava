package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomerPage {
	
	@FindBy(xpath ="//input[@value ='Add New Customer']")
	private WebElement AddNewCustomer;
	
	@FindBy(xpath = "//span[@class ='successmsg']")
	private WebElement Successmsg;
	
	public ActiveProjectsAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnAddNewCustomer()
	{
		AddNewCustomer.click();
		
	}
	
	public String retreiveSuccessmsg()
	{
		return Successmsg.getText();
	}

}
