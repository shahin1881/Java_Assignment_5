package Section1_20_Question;

import java.util.Scanner;

public class Cube_Q4 {
	public static void main(String[] args) {
		
/*		Question: input1={2,4,3,5,6};
	              if odd  find square 
	              if even find cube
	              finally add it
	              output1=208(4+16+27+125+36)

*/
		
		int[] a = new int[5];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		

		
		//int a[] = { 2, 4, 3, 5, 6 };

		double ans = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ans = ans + Math.pow(a[i], 2);//4+16+36
			} else {
				ans = ans + Math.pow(a[i], 3);//27+125
			}
		}
		System.out.println((int) ans);

	}

}
