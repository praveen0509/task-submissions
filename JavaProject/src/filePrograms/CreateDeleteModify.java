package filePrograms;
import java.util.*;
import java.io.*;

public class CreateDeleteModify {
	
	static Scanner ob=new Scanner(System.in);
	//Main()
	public static void main(String args[])  throws Exception{	
		File f=new File("/home/sb-33/Desktop/Praveen1");
		createFile(f);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		writeIntoFile(bw);		
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		System.out.println(traverseRemove(br));
		
	}
	
	
	//Modify()
	 public static String traverseRemove(BufferedReader br) throws Exception {
			String str,strAftRem="";
			Scanner ob=new Scanner(System.in);
			System.out.print("Enter a String For \nRemoval of that Line:");
			String remStr=ob.nextLine();
			
		    while((str=br.readLine())!=null) {
		    	if(str.indexOf(remStr)<0)
		    		strAftRem += str + "\r\n";	    	
		    }
		    ob.close();
			return strAftRem;
		}
	 
	//createFile()
	public static boolean  createFile(File f) throws IOException {		
		if(f.createNewFile())
		   return true;
		else
			return false;
	}
	
	//WriteIntoFile()
	public static void  writeIntoFile(BufferedWriter bw) throws IOException {
		System.out.println("Enter Data which you Wants \nTo Insert into File:");
		String inputData=ob.nextLine();
		try{
		    bw.write(inputData);
		    System.out.println("Data Added");
		  }
		catch(FileNotFoundException e) {
			System.out.println("Not added");
		}
	}
	
	
	
	
}










