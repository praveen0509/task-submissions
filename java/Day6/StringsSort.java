package Day6;
import java.util.*;

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

	                                             //bubble sort
	 // bubbleSort(str,num); 
	  for(int iterator=0; iterator<num; iterator++)                       //iterator=outer iterator
	  {
		 for(int nameIter=iterator+1; nameIter<num; nameIter++) 
		 {         //nameIter=inner iterator
		    if( (str[iterator].compareTo(str[nameIter])) >0)             //(str[nameIter+1].compareTo(str[nameIter])) >0
		    {
		    	System.out.println(iterator +" *  " +str[iterator]);
				 System.out.println(nameIter +" +  "+str[nameIter]);
		    	swap(str[nameIter],str[nameIter+1]);	
		    }
		 }
	  }
	  System.out.println("After sorting, The names are:");
	  display(str,num);
	}
		
	
	public static void display(String str[], int num)
	{
		for(int iterator=0; iterator<num; iterator++)
			System.out.println(str[iterator]);		
	}
	
	
	
	public static void swap(String str1, String str2)
	{
		String temp=new str2;
		str2=str1;
		str1=temp;		
	}
	
}
