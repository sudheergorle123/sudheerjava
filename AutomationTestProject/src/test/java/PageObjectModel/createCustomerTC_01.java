package PageObjectModel;

import org.testng.annotations.Test;

public class createCustomerTC_01 extends BaseClass {
	@Test
	public void testCreateCustomerTC_01()
	{
		OpenTasksPage otp = new OpenTasksPage();
		otp.clickOnProjectsAndCustomerLink();
		
		ActiveProjectsAndCustomerPage apcp = new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewCustomer();
		
		AddNewCustomerPage acp = new AddNewCustomerPage();
		acp.enterCustomerName("fhjklm");
		acp.clickOnCreateCustomer();
		
		String s =apcp.retreiveSuccessmsg();
		System.out.println(s);
	}

}
