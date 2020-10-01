package Section1_20_Question;

import java.util.Scanner;

public class PerfectNumber_Q14 {
	public static void main(String[] args) {
		// Question: perfect no or not?
		
		
		/*def: a positive integer that is equal to  the sum of its proper divisors.
		       the smallest perfect number is 6.which is the  sum 1,2, and 3.other 
		       perfect  number are 28,496 and 8,128.    */
		
		/*Scanner se =new Scanner (System.in);
		System.out.println("enter digit");
		int no =se.nextInt();*/
		
		int no = 29;

		int ans = 0;

		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				ans = ans + i;
			}
		}
		if (ans == no) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}

}
