package oops;
import java.io.*;

public class ReadDataLinebyLineFromFile {
	
	public static void main(String args[]) throws Exception{
		
		FileReader fr=new FileReader("/home/sb-33/Desktop/Output");
		BufferedReader br=new BufferedReader(fr);
		
		BufferedWriter br1=new BufferedWriter(new FileWriter("/home/sb-33/Desktop/Input"));
		
	    byte c=0;
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
			br1.write(str);
			br1.write("\n");
			c++;       //Counting number of lines
		}
		System.out.println("Lines:"+c);
		
		br1.close();	
	}	

}
