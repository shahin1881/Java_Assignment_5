package Section1_20_Question;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class hashset_Q7 {
	public static void main(String[] args) {
		
		
/*		Question: ip: "this is sample test case"
                  op: "this amplec"
                       remove the duplicates in the given string

*/
		Scanner se = new Scanner(System.in);
		System.out.println("enter string:=  ");
		String s= se.nextLine();
		
		//String s = "this is sample test case";

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			hs.add(c);
		}
		 String nj = "";
		 for (char n : hs) {
			nj = nj + n;
		}
		System.out.println(nj);

	}

}
