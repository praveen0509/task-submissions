package oops;
import java.util.*;

public class Exception_Try_Catch_Throw_Throws {
	
	public static void main(String args[]) throws Exception {
		/*
		int arr[]=new int[]{1,2,3,0,4,5};
		//System.out.println("value:"+arr[6]);
		try {
			int a=10,i,b=0;
			System.out.println(a/b);	
			System.out.println("value:"+arr[7]);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by Zero ");
		}

		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Bound "+e);
		}
		
		finally{
			System.out.println("completed");
		}
		*/
		
		
		
		/*
		try {
			int a=10;
			throw new ArithmeticException(); 
			//System.out.println("praveen");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception"+e);
			throw new ArithmeticException("val");
		}
		finally {
			System.out.println("Finally");
		}
		*/
		
		
		
		/*		 
		  String languages[] = { "C", "C++", "Java", "Perl", "Python" };
		       
		  try {
		    for (int c = 1; c <= 5; c++) {
		      System.out.println(languages[c]);
		    }
		  }
		  catch (Exception e) {
		    System.out.println(e);
		  }
		  */
		
		System.out.println("Enter word:");
		int c;
		while((c=System.in.readLine())!='\n') {
			System.out.print((char)c);
		}
		

		
		
		
	}

}
























