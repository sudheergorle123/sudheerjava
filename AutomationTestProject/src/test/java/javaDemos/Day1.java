package javaDemos;

import java.util.ArrayList;

public class Day1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		//int n= 8;
		for(int i : list1)
		{
			
			if(i == 4 || i == 8)
			{
				continue;
				
			}
			System.out.println(i);
		}
		

	}

}
