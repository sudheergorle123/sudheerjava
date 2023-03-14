package Programs;

public class PallindromeString {

	public static void main(String[] args) {
		String s1 ="abba";
		String rev ="";
		char[] c1 = s1.toCharArray();
		for(int i = c1.length-1; i>=0; i--)
		{
			rev = rev + c1[i];
			
		}
		System.out.println(rev);
		if(s1.equals(rev))
		{
			System.out.println("string is pallindrome");
		}


	}

}
