package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "srinivas";
		char[] ch = s1.toCharArray();
		String rev = " ";
		System.out.println(ch.length);
		for(int i = ch.length-1;i>=0;i--)
		{
			//System.out.println(ch[i]);
			rev = rev +ch[i];
		}
		System.out.println(rev);
		

	}

}
