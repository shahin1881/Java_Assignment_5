package Section1_20_Question;

import java.util.Scanner;

public class replace_Q1 {

	/*Question: i/p: bengal
                o/p: ceogbl
                if z is there replace with a*/
	
	public static String replace(String s1) 
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);//b e n
			if(i%2==0)
			{
				if(c==122)
				c=(char) (c-25);
			else{
			      c=(char) (c+1);
			}
			       sb.append(c);
			}
			else
				sb.append(c);
			}
		       return sb.toString();
				}
	
	
	
        public static void main(String[] args)
        {
        	
	     String s1="bengal";
		System.out.println(replace(s1));
		}
	
	}
			
		
	
	
	
/*public static void main(String[] args)
{

		Scanner se = new Scanner (System.in);
		System.out.println("enter String:= ");
		String s= se.next();

		String ip = "bengal";

		//String ip = "bengzl";

		String op = " ";

		for (int i = 0; i < ip.length(); i++) {
			if (i % 2 == 0) {
				char c = ip.charAt(i);
				if (c == 'z') {
					c = 'a';
					op += c;
				} else {

					c++;
					op += c;
				}
			} else {
				char c = ip.charAt(i);
				op += c;
			}

		}

		System.out.println(op);
	}
}
		*/
