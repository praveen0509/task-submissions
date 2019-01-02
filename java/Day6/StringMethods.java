package Day6;
import java.util.Scanner;


public class StringMethods 
{

	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		// System.out.println("enter string and Substring:");
		// String s1=ob.next();
		// String s2=ob.next();
		String s1="Semanticbits ";
		String s2="India ";
		System.out.println("length:"+s1.length());   
		                                               //length() method for strings
	                                                  //length for arrays[]
		System.out.println("charAt(5):-"+s1.charAt(5));
		System.out.println("s1.concat(s2):-"+s1.concat(s2));
		System.out.println("s1.compareTo(s2):-"+s1.compareTo(s2)); 
		                                             //s1=s2 ---->zero
		                                             //s1>s2 ---->the difference of ascii values between two characters
		                                                            //positive
		                                             //s1<s2 ----> negative value
		System.out.println("s1.trim():-"+s1.trim()+"   s2.trim():-"+s2.trim());
		                                             //removes spaces in string		
		System.out.println("s1.isEmpty():-"+s1.isEmpty()+"   s2.isEmpty():-"+s2.isEmpty());
		System.out.println("s1.indexof(bits):-"+s1.indexOf("bits")); 
		                                            //returns index value of string where the substring is found
		String s3=s1.concat(s2);
		System.out.println("enter a number as a string:");
		int number=ob.nextInt();
		String s4=String.valueOf(number);
		System.out.println("The string converted from string:-"+s4);
		                                          //input for characters+integers gives error 
		                                         //valueOf() converts any datatype to string
		System.out.println("s1.replace('b','B'):-"+s1.replace('b','B'));   
		                                         // giving ascii value gives error  s1.replace(98, 66)
		                                         // replaces character
		System.out.println("s1.contains(bits):-"+s1.contains("bits"));
		                                         //true  if substring is there
		                                        //false  if substring is not there
		System.out.println("s1.equalsIgnoreCase(SemanticBits):-"+ s1.equalsIgnoreCase("SemanticBits"));
		                                         //true if both strings are same  
	}
		
}
