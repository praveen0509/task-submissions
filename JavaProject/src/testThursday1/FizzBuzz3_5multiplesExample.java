/*
Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.

Input(i)  Actual	Expected
1	    1	           1
5	    Buzz          Buzz
15	  FizzBuzz     FizzBuzz
3	    Fizz	            Fizz
121	     121	              121
125	     Buzz	Buzz
*/



package testThursday1;
import java.util.*;

public class FizzBuzz3_5multiplesExample {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=ob.nextInt();
		do {
			System.out.println(fizzBuzz(num));
			System.out.println("Enter number for Continue:-not Zero" +
					"\t Stop:-0");
			num=ob.nextInt();
		}while(num!=0);
		
		System.out.println("Stopped...........");
	}
	
	public static String fizzBuzz(int num) {
		if(num%15==0)
			return "FizzBuzz";
		else if (num%5==0)
			return "Buzz";
		else if(num%3==0) 
			return "Fizz";
		else
			return num+"";		
	}

}


/*
output:
Enter a Number:35
Buzz
Enter number for Continue:-not Zero	 Stop:-0
30
FizzBuzz
Enter number for Continue:-not Zero	 Stop:-0
25
Buzz
Enter number for Continue:-not Zero	 Stop:-0
33
Fizz
Enter number for Continue:-not Zero	 Stop:-0
6
Fizz
Enter number for Continue:-not Zero	 Stop:-0
7
7
Enter number for Continue:-not Zero	 Stop:-0
0
Stopped

*/






