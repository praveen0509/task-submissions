package collections;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedListInsertUpdateDeleteRemoveDisplay {
@SuppressWarnings("unchecked")
public static void main(String args[]) {
		
		
		Scanner ob=new Scanner(System.in);
		LinkedList list=new LinkedList();
		char select='A';
		
		System.out.println("Enter \nA= addElement \nr= replaceElement \nR= removeElement \nV= Enter Index for Find Value " +
		  		"\nP=Enter Element to Find Position \nD=Display \nM=multiple Entries at a time \nE=Stop");
		while(select!='E') {
		  
		  switch(select) {
			  case 'A':
				  System.out.print("\nEnter Element:");
				  list.add(ob.next());
				  break;
				  
			  case 'r':
				  System.out.println("Enter place and Element to replace");
				  list.set(ob.nextInt(),ob.next());
				  System.out.println("List After Replace:"+list);
				  break;
				  
			  case 'R':
				  System.out.print("Enter Element to Remove:");
				  list.remove(ob.next());
				  System.out.println("List After Remove():"+list);				  
			      break;
				  
			  case 'V':
				  System.out.print("Enter position to find Value:");
				  System.out.println(list.get(ob.nextInt()));
				  break;
				  
			  case 'P':
				  System.out.print("Enter Element for Finding Position");
				  System.out.println(list.indexOf(ob.next()));
				  break;
				  
			  case 'D':
			      System.out.println("Display Elements in the List:");
			      System.out.println(list);
			      break;
			      
			  case 'M':
				  System.out.print("Enter How many Values to add in List At a time:");
				  byte num1=ob.nextByte();
				  for(byte i=0; i<num1; i++)
					  list.add(ob.next());
				  System.out.println(list);
				  break;
				  
			  case 'E':
				  System.out.print("Display Elements in the List:");
			      System.out.println(list);
				  System.exit(0);
				  break;
				  
		      default:
		    	  break;
				  
		    }
		  System.out.print("Enter a Character:");
		  select=ob.next().charAt(0); 
		}
		
		System.out.println("\nlist:"+list);
		
		System.out.println(Arrays.toString(list.toArray()));
		ob.close();
    }

}






