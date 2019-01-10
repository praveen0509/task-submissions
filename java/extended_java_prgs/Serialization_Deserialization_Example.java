package extended_java_prgs;
import java.io.*;
import java.io.Serializable;

public class Serialization_Deserialization_Example {
	public static void main(String args[]) throws IOException,ClassNotFoundException {
		
		DemoSerialization ds=new DemoSerialization(101,"praveen");
	   
	   try{	
		FileOutputStream fo=new FileOutputStream("/home/sb-33/Desktop/Output");
		ObjectOutputStream oos=new ObjectOutputStream(fo);
		oos.writeObject(ds);
		System.out.println("Object has been Serialized");
		fo.close();
		oos.close();
	   }
		
	   catch(IOException e) {
		   System.out.println("Exception caught:"+e);
	   }
		
	   
	   try{
		FileInputStream fis=new FileInputStream("/home/sb-33/Desktop/Output");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		DemoSerialization obj=null;
		obj=(DemoSerialization)ois.readObject();
		
		System.out.println("id:"+obj.i);
		System.out.println("name:"+obj.n);
		System.out.println("Object has been Deserialized");
		fis.close();
		ois.close();
	   }
	   catch(IOException e) {
		   System.out.println(e);
	   }
		
	
	}

}





class DemoSerialization implements Serializable{
	int i;
	String n;
	DemoSerialization(int id,String name) {
		this.i=id;
		this.n=name;
		
	}	
	
}