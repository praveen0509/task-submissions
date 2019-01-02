package Day6;
import java.util.Scanner;

public class StringsSort
{

	public static void main(String args[])
	{
		  int num;
		  Scanner ob=new Scanner(System.in);
		  System.out.println("Enter how many names wants to sort");
		  num=ob.nextInt();
		  String str[]=new String[num];
	                                                //Names taking from keyboard
		  System.out.println("Enter names:");
		  for(int iterator=0; iterator<num; iterator++)
			 str[iterator]=ob.next();

	      //bubbleSort 
		  for(int iterator=0; iterator<num; iterator++) {                      //iterator=outer iterator
			  for(int nameIter=iterator+1; nameIter<num; nameIter++) {         //nameIter=inner iterator
			      if( (str[iterator].compareTo(str[nameIter])) >0) {
			    	    String temp=String.valueOf(str[iterator]);
						str[iterator]=String.valueOf(str[nameIter]);
						str[nameIter]=String.valueOf(temp);			   
			      }
			 }
		  }
		  
		  //Display names after Sort
		  System.out.println("After sorting, The names are:" );
		  for(int iterator=0; iterator<num; iterator++)
				System.out.println(str[iterator]);
		  
		  ob.close();
	}
	
	public static void swap(String str1, String str2)
	{
		//unable to swap using methods	
	}
	
}
/*
output:-
Enter how many names wants to sort
4
Enter names:
praveen
abhi
bharath
vinod
After sorting, The names are:
abhi
bharath
praveen
vinod
*/
