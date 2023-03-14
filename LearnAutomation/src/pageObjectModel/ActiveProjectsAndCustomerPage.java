package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class ActiveProjectsAndCustomerPage {
	
	@FindBy(xpath = "//input[@value ='Add New Customer']")
	private WebElement addNewcustomerButton;
	
	@FindBy(xpath = "//span[@class = 'successmsg']")
	private WebElement successmsg;
	
	public ActiveProjectsAndCustomerPage() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnAddNewCustomerButton()
	{
		addNewcustomerButton.click();
	}
	
	public String retreiveSuccessMessage()
	{
		String s = successmsg.getText();
		return s ;
		
	}
	
	

}
