package Section1_20_Question;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Colour_Q8 {
	public static void main(String[] args) {
		/*
		Question: Color Code Validation:
	              String should starts with the Character '#'.
	              Length of String is 7. 
	              It should contain 6 Characters after '#' Symbol.
	              It should contain Characters Between 'A-F' and Digits '0-9'.
	              if String is acceptable then Output1=1
	              else  Output1=-1; 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s= sc.nextLine();
		
		
		//String s ="#AF457C"; //"#NAMja8";
		
		Pattern p=Pattern.compile("[#][A-F0-9]{6}"); //pattern                                //class and build in method
		Matcher m=p.matcher(s);//It is used to match with pattern and string..build in
		if(m.find())
		{
			System.out.println("color code Valid "+1);
		}
		else
			System.out.println("color code Invalid "+-1);
			
	}
}
		   
			