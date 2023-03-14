package seleniumDemos;

import org.testng.annotations.Test;

public class TestNgA {
	@Test(priority = 1)
	public void testcc()
	{
		System.out.println("cc method executed");
		
	}
	
	@Test(priority = 3)
	public void testAA()
	{
		System.out.println("AA method executed");
		
	}
	
	@Test(priority = 2)
	public void testBB()
	{
		System.out.println("BB method executed");
	}

}
