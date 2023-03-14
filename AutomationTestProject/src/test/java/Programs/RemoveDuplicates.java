package Programs;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1 = "TESTINGAUTOMATION";
		String s2 = "";
		
		char[] ch1 = s1.toCharArray();
		for(int i = 0; i < s1.length();i++)
		{
			boolean repeat = false;
			for(int j= i+1 ; j< s1.length();j++ )
			{
				if(ch1[i] == ch1[j])
				{
					repeat = true;
					break;
				}
			}
			if(!repeat) {
				s2 = s2+ch1[i];
				
			}
				
		}
		System.out.println(s2);
		

	}

}
