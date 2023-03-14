package newProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import inheritance.BaseClass;

public class TestCase_02 extends BaseClass {
	
	@Test
	public void testCase_02() throws IOException
	{
		OpenTask ot = new OpenTask();
		ot.clickOnProjectsAndCustomersLink();
		
		ActiveProjectsAndCustomers apac = new ActiveProjectsAndCustomers();
		apac.clickOnAddNewProject();
		
		AddNewProject anp = new AddNewProject();
		anp.customerlist("dhe");
		anp.enterProjectName("vijayanirmal");
		anp.clickOnCreateProject();
		@SuppressWarnings("deprecation")
		EventFiringWebDriver e1 = new EventFiringWebDriver(BaseClass.driver);
		@SuppressWarnings("deprecation")
		File f1 = e1.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\screenshot\\b.jpg");
		FileUtils.moveFile(f1, f2);
		
		String s = apac.retreiveSuccessmsg();
		System.out.println(s);
	
	}

}
