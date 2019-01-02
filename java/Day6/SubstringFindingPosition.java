package Day6;
import java.util.*;

public class SubstringFindingPosition {

	public static void main(String args[]){
		String str,subString;
		byte subIndex=0, strIter, count=0, startIndex=-1, subStringCount=0;
		System.out.println("Enter String and subString:-");
		Scanner ob=new Scanner(System.in);
		str=ob.nextLine();
		subString=ob.nextLine();	
		
		byte lenStr=(byte)str.length();
		byte lenSub=(byte)subString.length();                  //length finding for both strings
		System.out.println("length of "+str+":"+lenStr+"\nlength of "+subString+":"+lenSub);
		str=str+'\0';     
		subString=subString+'\0';                /* Giving null to String as last index Because to check
		                                            whether string reached last index or not length() method
		                                            cannot able to find stringLength if there is null character */
		            		
		for(strIter=0; str.charAt(strIter)!='\0'; strIter++) {	
			if(str.charAt(strIter) == subString.charAt(subIndex)) {
				if(count==0)                            
			    // starting Index of String is stored only one time for iteration   
				   startIndex=strIter;     
				subIndex++;
				count++;					
			}
			else {                 // Setting count=0 and starting position of the string everytime if match not found at any character
				count=0;                 
				subIndex=0;
			}                				                  				
			if(count==lenSub) {      //checking substring Iterator reached \0 or not
				subStringCount++;
				System.out.println("subString found index:"+startIndex);
			}
		}
		
		//repeated count
		if(subStringCount==0)                      
			System.out.println("Substring not found");
		else
		    System.out.println("Repeated count:-"+subStringCount);	

		//String After removing SubString
		System.out.println("After removing Substring, The String is:-");
		StringTokenizer st=new StringTokenizer(str,subString);
		while(st.hasMoreTokens())
			System.out.print(st.nextToken());
		/*
		String removeSubStr[]=str.split(subString);                //This is not working
		for(byte iter=0; iter < removeSubStr.length; iter++)
			System.out.print(removeSubStr[iter]); */
		ob.close();

	}
	
}

/*
output:
	Enter String and subString:-
	This is praveen and this is Semanticbits
	is
	
	length of "This is praveen and this is Semanticbits":-40 
	length of "is":-2
	subString found index:2
	subString found index:5
	subString found index:22
	subString found index:25
	Repeated count:-4 
	After removing Substring, The String is:
	th praveen and th semanticbits
	
	 */
