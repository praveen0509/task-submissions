/*
 * 5) find the duplicate character in the given String "abcdedef"

 */


package day7;
import java.util.Scanner;

public class Duplicate_Character {
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=ob.next();
		char[] charArray=str.toCharArray();
		short iter=0,dupIter, count=1;
		
		while(iter<str.length()-1) {
			for(dupIter=(short)(iter+1); dupIter<str.length()-1; dupIter++) {
				//Skipping iteration if Character is null 
				if(str.charAt(iter)=='\0')
					continue;
				if(str.charAt(iter)==str.charAt(dupIter)) {
					count++;                  //Replacing null if duplicate is found
				    charArray[dupIter]='\0';  //str.charAt(dupIter)='\0';
				}                             //The above code not Executing				
			}
			
			if(count>1) {
				System.out.println("\nDuplicated Character:="+str.charAt(iter)+":"+count);
				count=1;
			}
			iter++;
		}
		
		ob.close();
	}

}

/*
Enter a string:
praveenpavan:

Duplicated Character:=p:2
Duplicated Character:=a:3
Duplicated Character:=v:2
Duplicated Character:=e:2
Duplicated Character:=a:2

 */
















