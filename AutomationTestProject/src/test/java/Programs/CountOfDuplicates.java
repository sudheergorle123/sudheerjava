package Programs;

public class CountOfDuplicates {

	public static void main(String[] args) {
		String s1 = "vijayanirmala";
		int count = 0;
		char[] ch = s1.toCharArray();
		for(int i = 0; i < ch.length; i++)
				{
					for(int j = i+1; j<ch.length; j++)
					{
						if(ch[i]==ch[j])
						{
							count++;
							System.out.println(ch[j]);
							
						}
					}
				}
		System.out.println("duplicate charcters are:"+count);
	}

}
