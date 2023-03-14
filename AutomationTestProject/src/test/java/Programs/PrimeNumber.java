package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 59 ;
		int count = 0;
		for(int i = 1;i<=num ; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		System.out.println("number of factors:"+count);
		if(count ==2)
		{
			System.out.println("it is a prime number");
		}

	}

}
