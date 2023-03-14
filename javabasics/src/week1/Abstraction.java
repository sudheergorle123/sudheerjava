package week1;

interface A
{
	abstract public void move();
}

class B implements A
{
	public void move()
	{
		System.out.println("main method executed");
	}
}

class Helper
{
	public A helpermethod()
	{
		A rv1 = new B();
		return rv1;
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		Helper h1 = new Helper();
		A rv1 =h1.helpermethod();
		rv1.move();
		

	}

}
