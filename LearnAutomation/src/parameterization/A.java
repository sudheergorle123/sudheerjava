package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	@Parameters("t1")
	@Test
	public void testA(int i)
	{
		System.out.println("i value="+i);
	}

}
