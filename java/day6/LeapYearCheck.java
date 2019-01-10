/*
 * Write a method to accept a year number, test and display whether the given number is leap year or not

 */


package Day6;
import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String args[]) {
		short leap;
		System.out.print("enter a year:-");
	    Scanner ob=new Scanner(System.in);
		leap=ob.nextShort();
		leapYear(leap,ob);   
		ob.close();
	}
	
	public static void leapYear(int leap,Scanner ob)
	{
		 //Scanner ob=new Scanner(System.in);
		  while(leap!=0){
			   if((leap%400 ==0) || (leap%100!=0 && leap%4==0))
			     	System.out.println(leap+" is leap year");
		       else
				    System.out.println(leap+" is not leap year");
			   System.out.print("enter year for check or 0 for stop:-");
			   leap=ob.nextShort();   
		    }	
	}
}

/*enter a year:-2016
2016 is leap year
enter year for check or 0 for stop:-1994
1994 is not leap year
enter year for check or 0 for stop:-1992
1992 is leap year
enter year for check or 0 for stop:-400
400 is leap year
enter year for check or 0 for stop:-2000
2000 is leap year
enter year for check or 0 for stop:-2016
2016 is leap year
enter year for check or 0 for stop:-2019
2019 is not leap year
enter year for check or 0 for stop:-  */