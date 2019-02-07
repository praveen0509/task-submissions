/*
 * 3) Remove duplicates from the given array without using set

 */

package day7;
import java.util.Scanner;

public class Remove_Duplicates_From_Array {
	
	public static void main(String array[]) {
		short num, iter,count=1;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter n value:");
		num=ob.nextShort();
		
		short duplicateArray[]=new short[num];
		System.out.println("Enter numbers into the array:");
		
		//Reading Input Array
		for(iter=0; iter<num; iter++)
			duplicateArray[iter]=ob.nextShort();
		
		//Finding Duplicated Values
		for(iter=0; iter<num; iter++) {
			for(short dupIter=(short)(iter+1); dupIter<num; dupIter++) { 
				//dupIter= Iterator for finding Duplicated values
				if(duplicateArray[iter]==0)
					continue;
				if(duplicateArray[iter]==duplicateArray[dupIter]) {
					count++;
					duplicateArray[dupIter]=0;					
				}	
			}
			//Condition For Duplicate Value is there or Not
			if(count>1) {
				System.out.println("Duplicated Numbers== "+duplicateArray[iter]+":"+count);
				count=1; 
			}
		}
		
		display(duplicateArray, num);
		ob.close();	
	}
	
	//display()
	public static void display(short duplicateArray[], short num) {
		for(short iter=0; iter<num; iter++)
			if(duplicateArray[iter]!=0)
			     System.out.print(duplicateArray[iter]+" ");
	}
	
}


/*
Enter n value:
8
Enter numbers into the array:
2
2
3
4
5
2
4
5
Duplicated Numbers== 2:3
Duplicated Numbers== 4:2
Duplicated Numbers== 5:2
2 3 4 5 
 */



























