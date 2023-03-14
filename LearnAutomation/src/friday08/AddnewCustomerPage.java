package friday08;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class AddnewCustomerPage {
	
	@FindBy(name ="name")
	private WebElement customerNameTextfield;
	
	@FindBy(name ="createCustomerSubmit")
	private WebElement CreateCustomerbutton;
	
	public AddnewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void enterCustomerName(String customername)
	{
		customerNameTextfield.sendKeys(customername);
	
	}
	
	public void clickCreateCustomer() {
		CreateCustomerbutton.click();
	}

}
