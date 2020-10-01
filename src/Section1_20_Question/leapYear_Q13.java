package Section1_20_Question;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class leapYear_Q13 {
	

		//Question: leap year or not using API?
	//it is 366 days in a year its called leapyear (feb month 29 days required....foe eg.2016 leapyear. 

		
		 public static boolean leapYear(String s) {
		 int n=Integer.parseInt(s);
		 GregorianCalendar c=new GregorianCalendar();
		 boolean b=c.isLeapYear(n);
		 return b;
		}
		
		 public static void main(String[] args) {
			 String s="2016";
			 System.out.println(leapYear(s));
			}
		}





                







/*//public static void main(String[] args) {
Calendar d = Calendar.getInstance();
int year = d.get(Calendar.YEAR);

Year y = Year.of(year);

if (y.isLeap()) {
	System.out.println("True");
} else {
	System.out.println("False");
}

}

}
*/  
