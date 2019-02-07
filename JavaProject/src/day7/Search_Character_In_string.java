/*
 * Search particular character in the given string 
 
EX : String = "Manjusha"
  
       Our Target Value  = "u" then returns Test Passed
       Our Target Value  = "K" then returns Test Failed

 */



package day7;
import java.util.Scanner;

public class Search_Character_In_string {
    public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=ob.next();
		System.out.println("Enter Character to Search:-");
		char ch=ob.next().charAt(0);
		
		//Return Statement Printing
		System.out.println(str+":-"+searchCharacter(str,ch));
		ob.close();
	}
    
    //searchCharacter in the given String
    public static String searchCharacter(String str, char ch) {
    	boolean flag=false;
    	for(short iter=0; iter<str.length()-1; iter++) {
    		if(str.charAt(iter)==ch) {  //Condition Checking
    			flag=true;
    			return "Test Passed"; }
    	}
    		
    	if(flag==false)
    		return "Test Failed";
    	return "0";
    }
	

}
