import java.util.*;
import java.io.*;

public class Sample1 {
	public static void main(String args[]) throws Exception {
		
		//String name="praveen";
		Student s=new Student();
		
	  try {	
		FileOutputStream fos=new FileOutputStream("/home/sb-33/Desktop/output");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Serialized");
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
		
	  try{
		    FileInputStream fis=new FileInputStream("/home/sb-33/Desktop/output");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student name1=(Student)ois.readObject();
			System.out.println("DeSerialized:"+name1.name);		  
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
			
	}
	
}

class Student implements Serializable{
	
	String name="praveen";
	transient int id=123;
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		name = name +" pavan";
		oos.writeObject(name);
		System.out.println(name);
	}
	
	
	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		name=(String)ois.readObject();
		System.out.println(name);
		//this.name=name;
	}
	
}







































