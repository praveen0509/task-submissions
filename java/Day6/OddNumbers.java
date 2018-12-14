package Day6;
import java.util.*;

public class OddNumbers 
{
	public static void main(String args[])
	  {
		short num,a=2;
		                       //using short for memory utilization
	    a+=4;                  
	    System.out.println(a);
	                            //checking for a+=4 (not need typecast) 
	                           // a=a+4  need typecast
		System.out.println("enter a number:-");
		Scanner ob=new Scanner(System.in);
		num=ob.nextShort();
		for(short i=1;i<=num;i+=2)
		   System.out.println(i);
		ob.close();
	  }	
}
