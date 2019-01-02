package Day6;
import java.util.*;
public class PatternNumbers {
   public static void main(String args[]) {
	  int iter,num,spaceCond,numCond,space,numIter,count;
	  System.out.print("Enter n value:-");
	  Scanner ob=new Scanner(System.in);
	  num=ob.nextInt();
	  int cond=num-1;                 //useful for second pattern
	                                  //decrement pattern
	  
	  for(iter=1;iter<=(2*num-1);iter++) {  //line-wise traversal iterator
	  	  count=1;
		  if(iter<=num) {                   //first half pattern condition
		     spaceCond=num-iter;
			 numIter=iter;
			 numCond=2*iter-1;
		  }
		  
		  else {                            //second half pattern condition
			 spaceCond=iter-num;
			 numIter=cond;
			 numCond=2*cond-1;
			 cond--;  			  
		  }
		  
		  for(space=1; space<=spaceCond; space++)  //spaces
			  System.out.print("  ");
		  
		  for( ; count<=numCond;  ) {             //printing numbers in sequence
		 	  System.out.print(numIter+" ");
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
output:
	Enter n value:-5
        1 
      2 1 2 
    3 2 1 2 1 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1     */
