package Day6;
import java.util.Scanner;

public class EvenOddCheck 
{
  public static void main(String args[])
  {
	  Scanner ob=new Scanner(System.in);
		System.out.println("enter a number to check Even or Odd:-");
		short num;
		num=ob.nextShort();
		while(num!=0)
		{
		  if(num%2==0)
			System.out.println("even number");
		  else
			System.out.println("odd number");	
		  System.out.println("\ncontinue-->not 0   stop-->0 ");
		  num=ob.nextShort();
		}
		System.out.println("stopped");  
		
		ob.close();
  }
  
} 
/*
output:
	enter a number to check Even or Odd:-
	45
	odd number

	continue-->not 0   stop-->0 
	32
	even number

	continue-->not 0   stop-->0 
	65
	odd number
*/