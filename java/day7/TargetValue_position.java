/*
 *  Given a sorted array and a target value, return the index if the target is found. 
 *  If not, return the index where it would be if it were inserted in order.
 */



package day7;
import java.util.*;

public class TargetValue_position {
	public static void main(String args[]) {
		
		short num,target;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter How many Values to be in Array:");
	    num=ob.nextShort();
	
		short sortedArray[]=new short[num];
		System.out.println("Enter Array values in Sorted Order");
		for(short iter=0; iter<num; iter++) 
			sortedArray[iter]=ob.nextShort();
	
		System.out.print("Enter Target value for Searching:");
		target=ob.nextShort();
		short value=index(sortedArray, num, target);
		System.out.println(value);
		
		ob.close();
	}		
	
	
	public static short index(short sortedArray[], short num, short target) {
		short iter;
		boolean flag=false;
		for(iter=0; iter<num; iter++) {
			if(target==sortedArray[iter]) {
				System.out.println("Target found at index:");
				flag=true;
				return iter;
			}		
		}
		
		if(flag==false) {
			System.out.println("Index where it can place :-");
			for(iter=0; iter<num-1; iter++) {
				//Ascending Order sorting
				if( sortedArray[iter]<sortedArray[iter+1] && sortedArray[iter]<target && sortedArray[iter+1]>target)
					return (short)(iter+1);
				
				//Ascending Order sorting
				else if(sortedArray[iter]>sortedArray[iter+1] && sortedArray[iter]>target && sortedArray[iter+1]<target)
					 return (short)(iter+1);
			}	
		}
		return 0;	
	}
}


/*
Enter How many Values to be in Array:6
Enter Array values in Sorted Order
10
20
30
40
50
60
Enter Target value for Searching:45
Index where it can place :-4


Enter How many Values to be in Array:6
Enter Array values in Sorted Order
60
50
40
30
20
10
Enter Target value for Searching:33
Index where it can place :-4
 * 
 * 
 * 
 */












