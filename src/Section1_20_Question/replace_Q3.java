package Section1_20_Question;

import java.util.Scanner;

public class replace_Q3 {

   public static void main(String[] args) {

/*		 Question: i/p1: new york
                   i/p2: new jersey
                    o/p: new y+r+
*/
		
	/*Scanner se = new Scanner (System.in);
		System.out.println("enter 1St string:=");
		String s=se.nextLine();
		System.out.println("enter 1St string:=");
		String s1=se.nextLine();
		*/
		
		
		
		
	    String s = "new york";
		String s1 = "new jersey";

		String n = "";

		for (int i = 0; i < s.length(); i++) {//0,1
			if (i % 2 == 0) {
				n = n + s.charAt(i);//new y+r+
			} else {
				if (s.charAt(i) == s1.charAt(i)) {
					n = n + s.charAt(i);
				} else {
					n = n + "+";
				}
			}
		}
		System.out.println(n);

	}
}



    
          