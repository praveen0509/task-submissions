package Day6;
import java.util.*;

public class Pattern
{
	public static void main(String args[])
	{
	   short num,space,star=0,store=1;
	   boolean flag=true;
	   Scanner ob=new Scanner(System.in);
	   System.out.println("Enter n value:");
	   num=ob.nextShort();
	   
	   for(short lineNo=1; lineNo<=2*num-1; lineNo++)
	   {
		  if(lineNo<=num){
			  star=1;
			  space=(short)(num - lineNo);
		  }
		  else{
			  star=store;
			  space=(short)(lineNo - num); 
			  star+=2;
			  store=star;
		  }
		  for(; space>0; space--)     //space for loop 
			System.out.print(" ");	  
		  
		  for(; star<=lineNo; star++)      //star printing for loop
			  System.out.print("* ");
		  System.out.println("");		   
		   
	   }
	}
	
}
