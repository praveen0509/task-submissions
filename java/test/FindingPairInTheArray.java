/*
1.How to find all pairs on integer array whose sum is equal to given number(all should read
dynamically)
i/p: array: {5,2,3,4, 1}, value: 4
o/p: {1,3}
i/p: array: {5,2,3,4, 1}, value: 5
o/p: {1,4}, {2,3},
*/

package test;
import java.util.Scanner;

public class FindingPairInTheArray {
	
	public static void main(String args[]) {
		
		short len,iter,pairIter,count=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Array length:");
		len=ob.nextShort();
		short[] arr=new short[len];
		
		//Reading numbers into array
		System.out.println("Enter values into Array:");
		for(iter=0; iter<len; iter++)
			arr[iter]=ob.nextShort();
		
		System.out.println("Enter sum value:");
		short sum=ob.nextShort();
		//Entered Sum should be positive
		if(sum>0) {
			System.out.println("Duplicated Pair: Enter 1");
			System.out.println("Original pair: Enter 0");
			byte pair;
			pair=ob.nextByte();
			//Duplicated PAir Finding
			if(pair==1) {
				for(iter=0; iter<len; iter++) {
					  //if number in  the list > given Sum value, then skip that iteration
					if(arr[iter]>sum)
					    continue;				
					for(pairIter=0; pairIter<len; pairIter++) {
						if((arr[pairIter]+arr[iter])==sum) {
							System.out.println("pair: {"+arr[iter]+","+arr[pairIter]+"}");
							count++;
						}		
					}
				}
				System.out.println("No.of Duplicated Pairs:"+count);
			}
			//Original Pair Finding
			else if(pair==0) {
				boolean flag=true;
				for(iter=0; iter<len-1; iter++) {
					for(pairIter=(short)(iter+1); pairIter<len && arr[iter]!=0; pairIter++) {
						if((arr[iter]+arr[pairIter])==sum) {
							if(flag==true) {  // Bool condition for Counting OnePair oneTime Only
								              //if oneTime Calculated, then Don't Calculate Same Pair Again
							   count++;		
							   System.out.println("pair: {"+arr[iter]+","+arr[pairIter]+"}");
							}					   
							arr[pairIter]=0;//Replacing Counted Value place with Zero
							flag=false;
						}			
					}	
					flag=true;			
				}	
				System.out.println("No.of Original Pairs:"+count);
			}
			else {
				System.out.println("Wrong Entry");
				ob.close();
			    return; 
			    }
		}	
		else
			System.out.println("Pair Not Found");
	  ob.close();
	}	
}



/*
Enter Array length:
6
Enter values into Array:
2
3
4
1
2
3
Enter sum value:
5
Duplicated Pair: Enter 1
Original pair: Enter 0
0
pair: {2,3}
pair: {4,1}
No.of Duplicated Pairs:2




Enter Array length:
6
Enter values into Array:
2
3
4
1
2
3
Enter sum value:
5
Duplicated Pair: Enter 1
Original pair: Enter 0
1
pair: {2,3}
pair: {2,3}
pair: {3,2}
pair: {3,2}
pair: {4,1}
pair: {1,4}
pair: {2,3}
pair: {2,3}
pair: {3,2}
pair: {3,2}
No.of Duplicated Pairs:10

 */


