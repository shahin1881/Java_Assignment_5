package Section1_20_Question;

import java.util.Scanner;
import java.util.StringTokenizer;

public class vowels_Q5 {
	
		/*
		 Question: input1="the sun raises in the east";
                   output1=raises;
                   count no vowels in each word and print the word which has max
                   no of vowels if two word has max no of vowel print the first one

		 */
	
	
	
	/*public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("enter the string:=   ");
		String s = se.nextLine();
		// String s = "the sum raise in the east ";

		String n[] = s.split(" ");
		int no = 0;
		String k = "";

		for (int i = 0; i < n.length; i++) {
			String x = n[i];
			int count = 0;
			for (int j = 0; j < x.length(); j++) {
				char c = x.charAt(j);

				if ((c == 'a' || c == 'A') || (c == 'e' || c == 'E') || (c == 'i' || c == 'I') || (c == 'o' || c == 'O')
						|| (c == 'u' || c == 'U')) {
					count++;
				}
			}

			if (no < count) {
				no = count;
				k = x;
			}
		}
		System.out.println("Word :" + k + " Vowels :" + no);

	}

}
*/          
	     
	
	
		 public static String MaxVowelCount(String s1) {
		 int max=0;//0,1,
		 String s2="aeiouAEIOU";//rises in
		 
		 String s3=new String();
		 StringTokenizer t=new StringTokenizer(s1," ");
		 
		  while(t.hasMoreTokens()){
		  String s4=t.nextToken();//the..sun..rises..in..the..east
		  int c=0;//0
		  
		  for(int i=0;i<s4.length();i++)//the..0,1,2 for loop incrmt
		   for(int j=0;j<s2.length();j++)//aeiouAEIOU..0 to 9 incremt
		   if(s4.charAt(i)==s2.charAt(j))
		   c++;//1
		  
		  if(c>max){//2..2condition true
		   max=c;
		   s3=s4;
		   }//rises
		  }
		   return s3;//rises
		}
		
		public static void main(String[] args) {
			 String s1="the sun raises in the east"; 
			 System.out.println(MaxVowelCount(s1));
			}
		}
	
	
	
	
	
	
	
	
	
	