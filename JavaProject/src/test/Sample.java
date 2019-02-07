package test;
import java.util.Scanner;

/*
 *1.How to find all pairs on integer array whose sum is equal to given number(all should read
dynamically)
i/p: array: {5,2,3,4, 1}, value: 4
o/p: {1,3}
i/p: array: {5,2,3,4, 1}, value: 5
o/p: {1,4}, {2,3},
 */

public class Sample {
	
     public static void main(String args[]) {
		
		short len,iter,pairIter,count=0;
		boolean flag=true;
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
		
		for(iter=0; iter<len-1; iter++) {
			for(pairIter=(short)(iter+1); pairIter<len && arr[iter]!=0; pairIter++) {
				if((arr[iter]+arr[pairIter])==sum) {
					if(flag==true) {
					   count++;		
					   System.out.println("pair: {"+arr[iter]+","+arr[pairIter]+"}");
					}					   
					arr[pairIter]=0;
					flag=false;
				}			
			}	
			flag=true;			
		}
		
		
		System.out.println("Count:-"+count);
	
	
	
	
	
    }
	
}





























