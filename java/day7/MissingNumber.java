//Find out the missing number in the array of length n-1 and integers in the range of 1 to n


package day7;
import java.util.Scanner;

public class MissingNumber {
	
	public static void main(String args[]) {
		short num, iter, missingNum=1;
		boolean flag=false;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a Number:");
		num=ob.nextShort();
        short store[]=new short[num];		
		
        System.out.println("Enter array Values from 1 to "+(num+1)+"randomly:");
		for(iter=0; iter<num-1; iter++){
			store[iter]=ob.nextShort();
		    if(store[iter]>num+1 || store[iter]<1) {
		    	System.out.println("Number should between 1 to "+(num+1));
		    	iter--;  
		    }
		}
		
		//Finding missing Number
		while(missingNum <=(short)(num+1)) {
		   for(iter=0 ;iter<num; iter++) {
			    if(missingNum==store[iter]) {
				    missingNum++;
				    iter=0;   
				    flag=true;
			    }	
		   }
		   if(flag==false) {
			   System.out.println("Missing Number is:-"+missingNum);	
			   break;
		   }
		}
		
		 
		ob.close();
	}
}
