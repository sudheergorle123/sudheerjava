package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inheritance.BaseClass;

public class AddNewCustomerPage {
	
	@FindBy(name="name")
	private WebElement CustomerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerButton;
	
	public AddNewCustomerPage() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void enterCustomerName(String customerName)
	{
		CustomerNameTextField.sendKeys("dheeru12");
	}
	
	public void clickOnCreateCustomerButton()
	{
		CreateCustomerButton.click();
	}

}
