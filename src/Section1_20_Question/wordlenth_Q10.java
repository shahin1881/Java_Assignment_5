package Section1_20_Question;

import java.util.Scanner;

public class wordlenth_Q10 {
	//public static void main(String[] args) {
/*		Question:   Getting the first and last n letters from a word where wordlength > 2n.
                    Ex: Input: california,3.
                    output: calnia.
*/
		
		/*Scanner se= new Scanner (System.in);
		System.out.println("enter string:=");
		String s= se.next();*/
		
		
		/*String s = "california";

		int no = 3;
		String n = "";
		{
		for (int i = 0; i < no; i++) {
			n = n + s.charAt(i);//
		}
		for (int i = s.length() - no; i < s.length(); i++) {
			n = n + s.charAt(i);
		}
		System.out.println(n);

	
}*/
		/*StringBuffer p = new StringBuffer("cal"); 
        p.append("nai"); 
        System.out.println(p); // returns GeeksforGeeks 
*/        
      
		
		/*String sp =s.substring(0, 3);
		String sp2=s.substring(7, 10);
		System.out.println(sp+sp2);//sp.concat(sp)
	}
}*/
        
		
		
		
		   
			public static String givenString(String s1, int n1) {
			 StringBuffer sb=new StringBuffer();
			 sb.append(s1.substring(0, n1)).append(s1.substring(s1.length()-n1,s1.length()));
			 return sb.toString();
			}
			
			
			  public static void main(String[] args) {
				 String s1="california";
				 int n1=3;
				 System.out.println(givenString(s1,n1));
				}
			}