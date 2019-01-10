package Day6;

import java.util.Scanner;

public class PatternAlphabets 
{

	public static void main(String args[])
	{
		  byte iter,num,spaceCond,numCond,space,numIter,count;
		  System.out.print("Enter n value:-");
		  Scanner ob=new Scanner(System.in);
		  num=ob.nextByte();
		  byte cond=(byte)(num-1);         //useful for second pattern
		                                  //decrement pattern
		  
		  for(iter=1;iter<=(2*num-1);iter++) {  //line-wise traversal iterator
		  	  count=1;
			  if(iter<=num) {                  //first half pattern condition
			     spaceCond=(byte)(num-iter);
				 numIter=iter;
				 numCond=(byte)(2*iter-1);
			  }
			  
			  else {                         //second half pattern condition
				 spaceCond=(byte)(iter-num);
				 numIter=cond;
				 numCond=(byte)(2*cond-1);
				 cond--;  			  
			  }
			  
			  for(space=1; space<=spaceCond; space++)  //spaces
				  System.out.print("  ");
			  
			  for( ; count<=numCond;  ) {             //printing numbers in sequence
			 	  System.out.print((char)(numIter+64)+" ");
				  if((count<=cond) && (numIter!=1))
					  numIter--;
				  else
					  numIter++;
				  count++; 
			  }
			  System.out.println("");
		  }
		  
		  ob.close();
	}
}


/*
 Variables Description:
   iter =      linewise traversal iterator
   spaceCond = Printing spaces Condition
   cond =      value After HAlf pattern printed 
  
 Enter n value:-6
          A 
        B A B 
      C B A B A 
    D C B A B A B 
  E D C B A B C D E 
F E D C B A B C D E F 
  E D C B A B C D E 
    D C B A B C D 
      C B A B C 
        B A B 
          A 
*/
