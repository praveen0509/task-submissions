package Day6;
import java.util.*;

public class PrimeNumber
{

  public static void main(String[] args)
  {
	short num;
	boolean flag=true;
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter a positive number to check prime or not:");
	num=ob.nextShort();
    if(num>=0)
    { 
    	
                                         //loop exit condition 0 and 1
      while(num!=0 && num!=1)            //prime for 0 and 1   
      {
    	 for(short iterator=2;iterator<num/2;iterator++)
    	 {
    		if(num%iterator==0)                             //prime factor checking
    		{
    			System.out.println("Number "+num+" is not prime");
    			flag=false;
    			break;
    		}
    	 }
    	  if(flag==true)
    		System.out.println("Number "+num+" is prime");
    	  flag=true;
    	  num=ob.nextShort();
       }
      
	 System.out.println("prime checking not possible");  
    }
   
    else
    	System.out.println("Enter positive number");
  
  }
    
}
