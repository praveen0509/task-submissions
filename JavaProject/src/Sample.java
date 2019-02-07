/*

. Do following operations

Create a class StudentMarks

Read the file studentsCsv.csv

Calculate average and percentage of each student

Add 2 more columns average and percentage in Student.csv

Add each student average and percentage in Student.csv 

Display the details of each student.

*/
import java.io.*;

public class Sample {
	
	public static void main(String args[]) throws Exception {
		
		File file=new File("/home/sb-33/Desktop/students.csv");
		BufferedReader br=new BufferedReader(new FileReader(file));       
		
		displayData(br);
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		addAvgPerIntoFile(bw,br);
	}
	
	
	public static void displayData(BufferedReader br) throws Exception {
		String strLine;
		while((strLine=br.readLine())!=null) {
			String strWord[]=strLine.split(",");
			for(String str : strWord) 
				System.out.print(str+"\t");
			System.out.println();
		}		
	}
	
	
	public static void addAvgPerIntoFile(BufferedWriter bw, BufferedReader br) throws Exception{
		String strLine;
		boolean flag=true;
		while((strLine=br.readLine())!=null) {
			if(flag==true) {
				flag=false;				
				continue;
			}
			String strWord[]=strLine.split(",");
			int avg=0;
			int i;
			for(i=3; i<strWord.length; i++) 
				avg=avg+Integer.parseInt(strWord[i]);				
			System.out.println("Student:"+strWord[1]+"Avg:"+avg/6.0);
			//Writing This Column
			if(i==strWord.length) {
			    bw.write(strWord[1]+":");
			    bw.write(avg/6);
			 }
		}
	}

}







/*


id	firstName       lastName	telugu	hindi	english	    science	maths	social	
1	Rocky	     Balboa	        67	  45	37	        97	86	      69	
2	John	     Rambo	        45	  35	76	        56	98	      100	
3	Al           Pacino	        85	  87	74	        90	95	      89	
4	Rocky	      Mavia	        78	  45	31	        67	34	      64	
5	John 	      wick	        76	  42	75	        45	89	      97	




*/









