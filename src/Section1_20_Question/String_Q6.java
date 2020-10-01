package Section1_20_Question;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Q6 {
	

		/*
		Question: String format : CTS-LLL-XXXX
                  ip1: CTS-hyd-1234
                  ip2: hyderabad
                  
               -> LLL must be first 3 letters of ip2.
               -> XXXX must be a 4-digit number

		 */  
		
	
	     public static boolean formatString(String s1, String s2) {
		 String s3=s2.substring(0, 3);//hyd
		 boolean b=false;
		 
		 StringTokenizer t=new StringTokenizer(s1,"-");
		 String s4=t.nextToken();//CTS
		 String s5=t.nextToken();//hyd
		 String s6=t.nextToken();//1234
		 
		 if(s4.equals("CTS") && s5.equals(s3) && s6.length()==4)//condition true
			 
		 for(int i=0;i<s6.length();i++){//0,1,2,3.....s6=1234
			 
		  if(Character.isDigit(s6.charAt(i)))
		  b=true;
		  else{
		  b=false;
		  }
		  
		 }
		  return b;
		}
		
		    public static void main(String[] args) {
			String s1="CTS-123-1234";
			String s2="hyderabad";
			
			boolean b=formatString(s1,s2);
			
			if(b==true)
				
			System.out.println("String format:CTS-LLL-XXXX");
	    else
			System.out.println("not in required format");
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		public static void main(String[] args) {
	    Scanner se = new Scanner(System.in);
		System.out.println("enter string:=  ");
		String n = se.nextLine();
		
     String n = "CTS-LLL-XXXX";

		String a[] = n.split("-");
		String ans = a[0] + "-";
		
		for (int i = 1; i < a.length; i++) {
			String j = "hyderabad";
			//String t = "";
			
			String x = a[i];
			if (x.length() == 3) {
				for (int v = 0; v <= 2; v++) {
					ans = ans + j.charAt(v);
				}
			}

			else if (x.length() == 4) {
				ans = ans + "-" + "1234";
			}
		}
		System.out.println(ans);

	}

}
       */     
		
		
		  
			