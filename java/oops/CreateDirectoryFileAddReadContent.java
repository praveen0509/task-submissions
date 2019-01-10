package oops;
import java.io.*;



public class CreateDirectoryFileAddReadContent {
	public static void main(String args[]) throws Exception{
		String s="/home/sb-33/Desktop/sam1";
		
		//creating Directory
		File f=new File(s);
		if(f.mkdir())
			System.out.println("Directory Created");
		else
			System.out.println("Failed to create Directory");
		
		//Rename Directory
		File old=new File("/home/sb-33/Desktop/sam1");
		File newDir=new File("/home/sb-33/Desktop/sample");
		if(old.renameTo(newDir))
		    System.out.println("renamed");
		else
			System.out.println("failed to rename");
		
		//Creating file inside Directory
		File fileObj=new File("/home/sb-33/Desktop/sample/text.txt");
		if(fileObj.createNewFile()) 
			System.out.println("File Created inside Directory");
		
		else 
			System.out.println("Failed to create a file");
		
		/* //Adding content using CharacterStream object
		FileWriter writer=new FileWriter(fileObj);
		String content="This is a Demo text file";
		writer.write(content);
		writer.close();
		*/
		
		//adding Content using ByteStream object
		FileOutputStream fo=new FileOutputStream(fileObj);
		String content="This is a demo text file";
		fo.write(content.getBytes());
		fo.close();		
	}
}
