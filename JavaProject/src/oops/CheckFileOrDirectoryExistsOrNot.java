package oops;
import java.io.*;

public class CheckFileOrDirectoryExistsOrNot {
	public static void main(String args[]) throws Exception{
		
		File f=new File("/home/sb-33/Desktop/Output");
		FileInputStream fin=new FileInputStream(f);
		if(f.exists()) {
			System.out.println("Readable:"+f.canRead());
			System.out.println("Writeable:"+f.canWrite());
			System.out.println("Directory:"+f.isDirectory());
			System.out.println("size"+f.length());					
		}
		
		System.out.println("Name:"+f.getName());
		System.out.println("path:"+f.getPath());
		System.out.println("AbsolutePath:"+f.getAbsolutePath());
		System.out.println("Exists:"+f.exists());
		System.out.println("parent:"+f.getParent());		
	}

}
