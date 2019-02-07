/*

Write a program for following functionalities
1.Create a class Student having properties id, name and percentage
2. Creating a Directory named Students in that directory create a file.
3. Add students data into the file. Add at least 4 students
4. Read the file and display student data.
5. Add one more student into the file.
6. Delete the student data of id 2.

*/

package testThursday1;
import java.io.*;
import java.util.*;

public class FileReadingDisplayingDirectoryCreating {
	public static void main(String args[]) throws IOException {
		
		File f=new File("/home/sb-33/Desktop/Students");
		Scanner ob=new Scanner(System.in);
		//f.mkdirs() creates directory + path
		if(f.mkdir())
			System.out.println("Directory Created");
		else
			System.out.println("Failed");
		
		File sd=new File("/home/sb-33/Desktop/Students/data");
		sd.createNewFile();
		
		
		/*
		 * FileWriter fw=new FileWriter(sd, true);
		System.out.println("Enter How Many Students Data You Wants to Add:");
		int num=ob.nextInt();
		Student s[]=new Student[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("Enter Student Id, name, percentage:");
			int id=ob.nextInt();
			String name=ob.next();
			int percentage=ob.nextInt();
			s[i]=new Student(i, name, percentage);
			fw.write(id);
			fw.write(name);
			fw.write(percentage);
			fw.write('\n');
		}*/
		
		
		
		
		
		BufferedReader br=new BufferedReader(new FileReader(sd));
		
		String s;
		while((s=br.readLine())!=null)
			System.out.println(s);
		
		FileWriter fw=new FileWriter(sd, true);  //Apend Mode
		System.out.println("Enter Id, name, Percentage of a student with Tab space:");
		String str=ob.nextLine();
		fw.write(str);
		System.out.println("Data Added");	
		
		
		
		//Remove Data From File
		BufferedReader br1=new BufferedReader(new FileReader(sd));
		String data;
		System.out.print("Enter id Number To Remove");
		int removeId=ob.nextInt();
		
		boolean flag=true;
		String saveData=null;
		while((data=br1.readLine())!=null) {
			if(flag==true) {
				flag=false;
				continue;
			}
			String student[]=data.split(" ");
			if(removeId != Integer.parseInt(student[0])) 
				saveData= saveData+"\t"+data+"\n";
		}
	    
		System.out.println(saveData);
		BufferedWriter bw1=new BufferedWriter(new FileWriter(sd));
		bw1.write(saveData);
		
		
		br1.close();
		bw1.close();
		br.close();
		fw.close();
		
	}

}


class Student {
	int id;
	String name;
	double percentage;
	Student(int id, String name, double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;		
	}	
	
}

















































