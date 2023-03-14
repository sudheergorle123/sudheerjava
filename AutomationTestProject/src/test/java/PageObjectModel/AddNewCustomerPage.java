package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	@FindBy(xpath = "//input[@name = 'name']")
	private WebElement Customername;
	
	@FindBy(xpath ="//input[@value = 'Create Customer']")
	private WebElement CreateCustomerbutton;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void enterCustomerName(String customername)
	{
		Customername.sendKeys(customername);
	}
	
	public void clickOnCreateCustomer()
	{
		CreateCustomerbutton.click();
	}

}
