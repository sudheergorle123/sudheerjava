package Programs;

public class NoofOccurances {

	public static void main(String[] args) {
		String s = "testing automation";
		int res = s.length()-s.replaceAll("i", "").length();
		System.out.println("orginal length"+s.length());
		System.out.println("No OF OCCURANCES:"+res);

	}

}
