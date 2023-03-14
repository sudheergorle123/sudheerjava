package Programs;

public class CountWords {

	public static void main(String[] args) {
		String s1 = "vijaya Nirmala";
		int count = 0;
		String s = "";
		char[] ch = s1.toCharArray();
		for(int i =0 ; i < s1.length() ; i++)
		{
			boolean firt = false;
			for(int j = i+1 ; j< s1.length();j++)
			{
				if(ch[i] == ch[j])
				{
					firt = true;
					break;
				}
			}
				if(!firt)
				{
					count++;
					s = s+ch[i];
					
				}
				
			
		}
		System.out.println(s);
		int count1 = 0;
		for(int k = 0; k<s.length();k++)
		{
			count1++;
		}
		System.out.println(count1);

	}

}
