package oops;
import java.io.*;
import java.util.Scanner;

public class ReadingWritingIntoFile {
	
	public static void main(String args[]) throws Exception {
		File f=new File("/home/sb-33/Desktop/Input");
 		FileInputStream in=null;
 		FileOutputStream out=null;
 		
 		out=new FileOutputStream("/home/sb-33/Desktop/Output");
 		
 		String str="praveen"+'\0';
 		Scanner ob=new Scanner(System.in);
 		int c;
 		int i=0;
 		while((c=in.read())!=-1)
 		
 		
 		
 		out.close();	
	}
	
}
