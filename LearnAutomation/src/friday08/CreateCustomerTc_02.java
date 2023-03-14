package friday08;

import org.testng.annotations.Test;

import inheritance.BaseClass;

public class CreateCustomerTc_02 extends BaseClass {
	@Test
	public void testCreateCustomerTc_02()
	{
		OpentaskPage otp = new OpentaskPage();
		otp.clickOnProjectsAndCustomers();
		
		ActivePrtojectsAndCustomerPage apcp = new ActivePrtojectsAndCustomerPage();
		apcp.clickOnAddNewCustomer();
		 //apcp.getTextMsg();
		
		AddnewCustomerPage ancp = new AddnewCustomerPage();
		
		ancp.enterCustomerName("sudheer32");
		ancp.clickCreateCustomer();

		String s = apcp.getTextMsg();	
		System.out.println(s);
	}

}
