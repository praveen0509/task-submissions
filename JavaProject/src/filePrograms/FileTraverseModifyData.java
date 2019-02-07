package filePrograms;

import java.io.*;
import java.util.Scanner;

public class FileTraverseModifyData {

	public static void main(String args[]) throws Exception {
		File f=new File("/home/sb-33/Desktop/Praveen");
		Scanner sc =new Scanner(f);
		System.out.println(traverseRemove(sc));
		sc.close();
	}
	
	
	public static String traverseRemove(Scanner sc) {
		boolean flag=true;
		String s,strAftRem="";
		/*
		 //With BufferedReader br Object
		  while((str=br.readLine())!=null) {
	    	if(str.indexOf("124")<0)
	    		strAftRem += str + "\r\n";	    	
	      }
		*/
		
		while(sc.hasNextLine() && (s=sc.nextLine())!=null) {
			String s1[]=s.split(" ");
			for(int i=0; i<s1.length; i++) {
				if(s1[i].equals("125")) {
					flag=false;
					break;
				}
			}
			if(flag==true)
				strAftRem += s+"\r\n";
			flag=true;
		}
		
		return strAftRem;
	}
	
	
}

/*
 My File Contains:
 praveen from JNTU 123
kumar  from Chintal  124
teju  from kamareddy  125
Sai from KarimNagar  126


Remove line Which Contains "teju"
praveen from JNTU 123
kumar  from Chintal  124
Sai from KarimNagar  126

 
 */


















