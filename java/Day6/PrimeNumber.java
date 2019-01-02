package Day6;
import java.util.Scanner;

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
      while(num>2)            //prime for 0 and 1   
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
    	  System.out.println("\nEnter Number  morethan 1-->continue  lessThan 1-->Stop");
    	  num=ob.nextShort();
       }
      
	 System.out.println("stopped....");  
    }
   
    else
    	System.out.println("Enter positive number");
    ob.close();
  }
    
}

/*
 * output:

Enter a positive number to check prime or not:
24
Number 24 is not prime

Enter Number  morethan 1-->continue  lessThan 1-->Stop
23
Number 23 is prime

Enter Number  morethan 1-->continue  lessThan 1-->Stop
97
Number 97 is prime

Enter Number  morethan 1-->continue  lessThan 1-->Stop
127
Number 127 is prime

Enter Number  morethan 1-->continue  lessThan 1-->Stop
-45
stopped....

 */
