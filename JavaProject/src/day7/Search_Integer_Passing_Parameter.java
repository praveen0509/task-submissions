/*
 * Let's say we have an array of elements, Print the required integer by passing parameters in the methods

 */


package day7;
import java.util.Scanner;

public class Search_Integer_Passing_Parameter {
	public static void method(String args[]) {
		short num;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter N value:");
		num=ob.nextShort();
		short intArray[]=new short[num];
		
		//Entering Array Values
		System.out.println("Enter Array Values:");
		for(short iter=0; iter<num; iter++)
			intArray[iter]=ob.nextShort();
			
		System.out.println("Enter Target value:");
		short target=ob.nextShort();
		
		//Searching Target Value
		searchTargetValue(intArray, target);	
		ob.close();
	}
	
	//Searching Target Value
     public static void searchTargetValue(short intArray[], short target) {
    	 boolean flag=false;
    	 for(byte iter=0; iter<intArray.length-1; iter++) {
    		 if(intArray[iter]==target) {
    			 System.out.println("Target Element found");
    		     flag=true;
    		     break;
    	     }   		 
    	 }
    	 if(flag==false)
    	 System.out.println("Target Value Not Found");
     }
    

}





































