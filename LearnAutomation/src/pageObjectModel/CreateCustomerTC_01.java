package pageObjectModel;

import org.testng.annotations.Test;

import inheritance.BaseClass;

public class CreateCustomerTC_01 extends BaseClass {
	
	@Test
	public void testCreateCustomerTC_01()
	{
		OpenTasksPage otp = new OpenTasksPage();
		otp.clickOnProjectsAndCustomersLink();
		
		ActiveProjectsAndCustomerPage apcp = new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewCustomerButton();
		
		AddNewCustomerPage ancp = new AddNewCustomerPage();
		ancp.enterCustomerName("dheerru");
		ancp.clickOnCreateCustomerButton();
		
		 apcp.retreiveSuccessMessage();
		
				
				
				
	}

}
