package oops;
import java.io.*;

public class FileDataDeleteAndApendBetweenTwoFiles {

		
		public static void main(String args[]) throws IOException{
			
			File f1=new File("/home/sb-33/Desktop/input.txt");
			f1.createNewFile();
			File f2=new File("/home/sb-33/Desktop/delete.txt");
			f2.createNewFile();
			File f3=new File("/home/sb-33/Desktop/same.txt");
			f3.createNewFile();
			
			
			BufferedReader fri=new BufferedReader(new FileReader(f1));
			
			BufferedWriter fro=new BufferedWriter(new FileWriter(f3,true));
			
			String s1=fri.readLine();
			
			
			while(s1!=null) {
				BufferedReader frd=new BufferedReader(new FileReader(f2));
				String s2=frd.readLine();
				while(s2!=null) {
					if(s1.equals(s2)) {
						System.out.println(s1);
						fro.write(s1);
					}	
					s2=frd.readLine();
				}		
				s1=fri.readLine();
			}
			
			System.out.println("Same Data Written in Third File");
			fri.close();
			fro.close();
			//frd.close();
		}

}
