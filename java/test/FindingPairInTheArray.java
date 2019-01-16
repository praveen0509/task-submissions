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
		
		if(sum>0) {
			for(iter=0; iter<len; iter++) {
				  //if number in  the list > given Sum value, then skip that iteration
				if(arr[iter]>sum)
				    continue;				
				for(pairIter=(short)(iter+1); pairIter<len; pairIter++) {
					if((arr[pairIter]+arr[iter])==sum) {
						System.out.println("pair: {"+arr[pairIter]+","+arr[iter]+"}");
						count++;
					}		
				}
			}
			System.out.println("No.of Pairs:"+count);
		}	
		else
			System.out.println("Pair Not Found");
	ob.close();
	}	
}



/*
 * output:
 * Enter Array length:
5
Enter values into Array:

5
4
3
2
1
Enter sum value:
5
pair: {1,4}
pair: {2,3}
No.of Pairs:2




Enter Array length:
6
Enter values into Array:
7
4
3
5
2
1
Enter sum value:
9
pair: {2,7}
pair: {5,4}
No.of Pairs:2

 */


