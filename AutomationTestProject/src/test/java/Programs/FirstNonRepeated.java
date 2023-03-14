package Programs;

public class FirstNonRepeated {

	public static void main(String[] args) {
		String s1 = "sudheersudhee";
		char[] ch1 = s1.toCharArray();
		for(int i = 0 ; i< s1.length();i++)
		{
			boolean f = true;
			for(int j = 0; j<s1.length();j++)
			{
				if( i != j && ch1[i] == ch1[j])
				{
					f = false;
					break;
					
				}
				
			}
			if(f)
			{
				System.out.println("first non repeated characters:"+ch1[i]);
				break;
				
			}
			
		}
		

	}

}
