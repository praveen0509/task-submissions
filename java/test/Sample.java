package test;
import java.util.Scanner;

public class Sample {

		
		public static void main(String args[]) {
			
			
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter a String:");
			String str=ob.next();
			byte iter,count=0;
			char[] str1=str.toCharArray();
			//System.out.println(str1.length);
			
			byte len=(byte)str1.length;
			for(iter=0; iter<len; iter++) {
				if(str1[iter]=='A' || str1[iter]=='E' || str1[iter]=='I' || str1[iter]=='O' || str1[iter]=='U' 
				|| str1[iter]=='a' || str1[iter]=='e' || str1[iter]=='i' || str1[iter]=='o'|| str1[iter]=='u') {
					count++;          //Counting Vowels
					for(byte repIter=iter; repIter<str1.length-1; repIter++)
						str1[repIter]= str1[repIter+1];
					iter--;
					str1[--len]='\0';
				}			
			}
			System.out.println("\nNo.of vowels:"+count);
			
			
			//display()
			System.out.println("String is:");
			System.out.println(str1);
			
			
			ob.close();
		}


}
