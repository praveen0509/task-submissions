/*

1. Ceasar Cipher
The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals. Each letter is replaced by another letter N positions down the english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
Implement a decoder for the Ceasar cipher where N = 5.
TIP: Use code.toCharArray() to get an array of characters.

Input(code)  Actual	Expected
xvm	     car	              car
evqv	    java	              java
diozmqdzr   interview	interview


*/

package testThursday1;
import java.util.Scanner;

public class RotationalOutputCeaserCipher {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a name:");		
		String name=ob.next();
		System.out.println("Enter How many characters to rotate:");
		int num=ob.nextInt();
		
		char ch[]=new char[name.length()];
		ch=name.toCharArray();
		
		//Dispalying
		for(int i=0; i<ch.length; i++) {
			if((64<ch[i] && ch[i]<91) || (96<ch[i] && ch[i]<123)) {
				
				if((ch[i]+num)>122)
					System.out.print((char)(ch[i]+num-26));   //setting start value to 97 ascii
				
				else if( (ch[i]+num) >90 && (ch[i]+num)<97)
					System.out.print((char)(ch[i]+num-26));  //Setting start value to 65 ascii 
				
				else
					System.out.print((char)(ch[i]+num));
			}
		}		
		
	}

}



/*
 output:
 Enter a name:
XeroxPraveenZoo
Enter How many characters to rotate:
4
BivsbTveziirDss
 
 */
