package Section1_20_Question;

import java.util.Scanner;

public class Element_Q12 {
	public static void main(String[] args) {
		/*
		 Question: Add elements of digits:9999 
		                 output:9+9+9+9=3+6=9;

		 */

		/*Scanner se =new Scanner (System.in);
		System.out.println("enter digit:=    ");
		int no= se.nextInt();*/
		
		int no =5555;
		int ans = 0;
		while (no != 0) {
			int x = no % 10;//9
			ans = ans + x;//9
			no = no / 10;//0
		}
		int n = 0;
		if (ans >= 0 && ans <= 9) {
			System.out.println(ans);
		} else {
			while (ans != 0) {
				int x = ans % 10;
				n = n + x;
				ans = ans / 10;
			}
			System.out.println(n);
		}

	}

}
