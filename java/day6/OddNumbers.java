/*
 * Write a program to print odd numbers upto given number
	o/p: 1, 3, 5, 7, ....., 99

 */

package Day6;
import java.util.Scanner;

public class OddNumbers 
{
	public static void main(String args[])
	  {
		short num;
		System.out.println("enter a number:-");
		Scanner ob=new Scanner(System.in);
		num=ob.nextShort();
		for(short i=1;i<=num;i+=2)
		   System.out.println(i);
		ob.close();
	  }	
}

/*
output:
enter a number:-
45
1
3
5
7
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
*/