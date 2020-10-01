package Section1_20_Question;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HashMap_Q15 {
	
		
		/*  Question:   Input1=845.69, output=3:2;
                        Input1=20.789; output=2:3;
                        Input1=20.0;   output=2:1;  
                        output is in Hashmap format.
                        Hint: count the no of digits.

		 */

		
		     public static String noOfDigits(double d) {
			 int n1=0,n2=0;
			 String s=String.valueOf(d);//845.69
			 StringTokenizer t=new StringTokenizer(s,".");
			 String s1=t.nextToken();//845
			 String s2=t.nextToken();//69
			 n1=s1.length();//3
			 n2=s2.length();//2
			 if(s1.charAt(0)=='0')
			 n1=s1.length()-1;
		     if(n2!=1)
			 if(s2.charAt(s2.length()-1)=='0')//
			 n2=s2.length()-1;
			 String s3=String.valueOf(n1)+":"+String.valueOf(n2);//3:2
			 return s3;//3:2
			}
			
			
			  public static void main(String[] args) {
					 double d=20.789;
					 System.out.println(noOfDigits(d));//3:2
					}
			}