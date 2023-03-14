package week1;

public class Program2 {
	public static void start()
	{
		System.out.println("program can be started");
	}
	
	public static  void end()
	{
		start();
		System.out.println("program can be ended");
	}

	public static void main(String[] args) {
		
		
		end();

	}

}
