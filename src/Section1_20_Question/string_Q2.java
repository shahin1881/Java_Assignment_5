package Section1_20_Question;

import java.util.Scanner;
import java.util.StringTokenizer;

public class string_Q2 {
	
		/*Question: find the maximum chunk of a given string
                  i/p: this issss soooooo good
                  o/p=5
		    */
		
		    public static int maxChunk(String s1) {
			int max=0;
			StringTokenizer t=new StringTokenizer(s1," ");
			while(t.hasMoreTokens()){
			String s2=t.nextToken();//this/isssss/soooo/good
			int n=0;
			for(int i=0;i<s2.length()-1;i++)//0,1,2,3 //0,1,2
			if(s2.charAt(i)==s2.charAt(i+1))//this==isssss //isssss==isssss
			n++;//1,2,3
			if(n>max)
			   max=n;//4
			
			}
			return (max+1);
			}
			

			public static void main(String[] args) 
			{
			String s1= " this issss soooooo good"; //"this is sooo good"...o/p=3
			System.out.println(maxChunk(s1));
			}
		
	}
		
		
		
		
		
		/*
		 public static void main(String[] args) 
		 {
		
		 Scanner se =new Scanner (System.in);
         System.out.println("enter string");
		 String n= se.nextLine();
		
		
		//String n = "this issss sooooo good";
		int count=0,ans=0;
		
		for(int i=0;i<n.length()-1;i++)
		{
			if(n.charAt(i)==n.charAt(i+1))
			{
				count++;
			}
			else
			{
				count=0;
			}
			
			if(ans<count)
			{
				ans = count;
				//System.out.println(ans);
			}
		}System.out.println(ans+1);
		
	}

}
*/