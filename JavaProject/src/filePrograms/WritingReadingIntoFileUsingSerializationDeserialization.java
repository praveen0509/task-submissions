package filePrograms;
import java.io.*;
import java.util.*;

public class WritingReadingIntoFileUsingSerializationDeserialization  implements Serializable{
	
	public static void main(String args[]) throws Exception {
		
		ArrayList<StudentData> al=new ArrayList<StudentData>();
		al.add(new StudentData(101,"praveen"));
		al.add(new StudentData(102,"suresh"));
		al.add(new StudentData(103,"abhi"));
		
		
		try{
			File file=new File("/home/sb-33/Desktop/output");
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(al);
			oos.close();
			System.out.println("ArrayList Object Serialize");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("/home/sb-33/Desktop/output")));
			ArrayList<StudentData> al1=new ArrayList<StudentData>();
			al1=(ArrayList<StudentData>)ois.readObject();
			for(StudentData s:al1) {
				if(s.name.equals("suresh")) {
					s.id=105;
					s.name="Sai";			
				}					
			}
			
		   for(StudentData s:al1) {
			   System.out.println("id:"+s.id+" name:"+s.name);
		   }
			System.out.println("ArrayList Object Deserialized");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}	
}

class StudentData implements Serializable {
	int id;
	String name;
	StudentData(int id, String name) {
		this.id=id;
		this.name=name;		
	}	
}

















