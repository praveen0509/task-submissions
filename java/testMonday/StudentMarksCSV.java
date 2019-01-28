/*

. Do following operations

Create a class StudentMarks

Read the file studentsCsv.csv

Calculate average and percentage of each student

Add 2 more columns average and percentage in Student.csv

Add each student average and percentage in Student.csv 

Display the details of each student.

*/
package testMonday;
import java.io.*;

public class StudentMarksCSV {
	
	public static void main(String args[]) throws Exception {
		
		File file=new File("/home/sb-33/Desktop/students.csv");
		BufferedReader br=new BufferedReader(new FileReader(file));       
		
		displayData(br);
		//avgPercentage(br);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		//addAvgPerIntoFile(bw, br);
		
		displayData(br);
		
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
	
	/*
	public static void avgPercentage(BufferedReader br) throws Exception {
		String strLine;
		boolean flag=true;
		while((strLine=br.readLine())!=null) {
			//From Second Line, Calculating Avg
			if(flag==true) {
				flag=false;				
				continue;
			}
			String strWord[]=strLine.split(",");
			int avg=0;
			for(int i=3; i<strWord.length; i++) 
				avg=avg+Integer.parseInt(strWord[i]);				
			System.out.println("Student:"+strWord[1]+"Avg:"+avg/6);	
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
	
	*/

}

























