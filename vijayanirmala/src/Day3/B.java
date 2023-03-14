package Day3;

import org.testng.annotations.Test;

public class B {
	@Test(priority = 1)
	public void testCC()
	{
		System.out.println("cc is executed");
	}
	@Test(priority = 3)
	public void testAA()
	{
		System.out.println("AA is executed");
	}
	@Test(priority = 2)
	public void testBB()
	{
		System.out.println("BB is executed");
	}

}
