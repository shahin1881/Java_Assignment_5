package Section1_20_Question;

import java.util.Scanner;

public class duplicate_Q9 {
	public static void main(String[] args) {
		 /*Question: Find the Maximum span of the given array.
                     span is the number of elements between the duplicate element
                     including those 2 repeated numbers.
                     if the array as only one elemnt,then the span is 1.
	                 input[]={1,2,1,1,3}
	                 output1=4
	                 
	                 input[]={1,2,3,4,1,1,5}
	                 output1=6*/
		

		/*int[] n = new int[5];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {

			n[i] = sc.nextInt();

		}*/

		int n[] = {1,2,3,4,1,1,5};

		int ans = 0;

		for (int i = 0; i < n.length - 1; i++) {
			int no = 0;
			for (int j = 0; j < n.length; j++) {//0,1
				if (n[i] == n[j]) {//0==0
					no = j - i;//0,4,5
				}
			}
			if (ans < no) {//5<0
				ans = no;//5
			}
		}
		System.out.println(ans + 1);//5+1

	}

}
