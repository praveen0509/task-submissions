package Day6;
import java.io.*;
import java.util.*;

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
	  System.out.println("stop=0 continue= !0");
	  num=ob.nextShort();
	}
	System.out.println("stopped");  
  }
  
} 
