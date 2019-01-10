package oops;
import java.io.*;

public class SimpleFilePrograms  {
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream in=null;
		FileOutputStream out=null;
          
		in=new FileInputStream("/home/sb-33/Desktop/Sample");
		out=new FileOutputStream("/home/sb-33/Desktop/Output");
			
		
	 	//creating Directory	
		String sam="/home/sb-33/Desktop/sam";
		File f=new File(sam);
		f.mkdir();
		System.out.println("Directory Created");
		   //returns true, if created
		   //false if destination is not correct
		   //f.mkdirs() creates directory with given Destination
		
		
		
		//printing Data  
		int c;
		while((c=in.read())!=-1) {
			System.out.print((char)c);
			out.write(c);
		}
        
		
		//rename() a file
		File old=new File("/home/sb-33/Desktop/Input");
		File newFile=new File("/home/sb-33/Desktop/Output");
		if(old.renameTo(newFile))
			System.out.println("Rename Success");
		else
			System.out.println("Rename Failed");
		
		
		in.close();
		out.close(); 
	}
}
