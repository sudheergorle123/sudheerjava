package Programs;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "sudheerui";
		String s2 ="yajavi";
		if(s1.length()!= s2.length())
		{
			System.out.println("Both are not anagrams" +"sudheer");
			
		}
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
	
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("both are annagrams");
		}
		else
		{
			System.out.println("not anagrams");
		}
		
		
	}

}
