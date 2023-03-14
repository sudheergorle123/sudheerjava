package friday08;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class ActivePrtojectsAndCustomerPage {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement AddNewCustomerbutton;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement retreiveTextmsg;
	
	public ActivePrtojectsAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickOnAddNewCustomer()
	{
		AddNewCustomerbutton.click();
	}
	
	public String getTextMsg()
	{
		String s1 = retreiveTextmsg.getText();
		return s1;
	}

}
