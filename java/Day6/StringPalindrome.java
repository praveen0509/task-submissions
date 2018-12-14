package Day6;
import java.util.*;
public class StringPalindrome 
{
	public static void main(String[] args)
	{
	   
		String s1;
		StringBuffer s3=new StringBuffer("madam");
		Scanner ob=new Scanner(System.in);
		System.out.println("enter a string");
		s1=ob.next();
		StringBuffer s2=new StringBuffer(s1);
		//s2.append(s1);
		s2=s2.reverse();
		System.out.println("reverse string:-"+s2);
		                           //stringBuffer and stringBuilder both contains reverse() but not in String class		
		  
		                           //object reference compared with string
		                           //toString() function gives the value in that location
		                           //When an object of String is passed, the strings are compared. 
		                           //But when object of StringBuffer is passed references are compare
		if(s1.equals(s2.toString()))          
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");	
	}

}
