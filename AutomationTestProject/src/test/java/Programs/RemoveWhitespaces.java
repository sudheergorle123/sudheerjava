package Programs;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String s1 = " a a a f gkkc kdkd kksk kksl  lsllsl  lllsljdld";
		char[] c1 = s1.toCharArray();
		/*System.out.println("before remove white spaces:"+s1);
		 s1 =  s1.replaceAll("\\s","");
		System.out.println("after remove white spaces:"+s1);*/
		
		/*for(char c : s1.toCharArray())
		{
			if(c != ' ')
			{
				System.out.print(c);
			}
		}*/
		
		for (int i = 0 ;i < s1.length();i++)
		{
			if(c1[i] != ' ')
			{
				System.out.print(c1[i]);
			}
			
		}
		
	}
	

}
