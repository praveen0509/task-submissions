package extended_java_prgs;
import java.io.*;

public class CustomizedSerializationExample implements Serializable {
	  int id;
     CustomizedSerializationExample() {
    	int id=50;
    	this.id=id;
		System.out.println("Default Constructor");
	 }
	
	public static void main(String args[]) {
		
		Sample s=new Sample();
		try{
			FileOutputStream fo=new FileOutputStream("/home/sb-33/Desktop/output");
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(s);
			System.out.println("Serialized ");	
		}
		catch (Exception e) {}
		
		try{
			FileInputStream fis=new FileInputStream("/home/sb-33/Desktop/output");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Sample sm=(Sample)ois.readObject();
			System.out.println(sm.mname);	
			System.out.println("Deserialized");
		}
		catch(Exception e){}
	}	

}



class Sample implements Serializable {
	transient String name="praveen";
	String mname;
	public void writeObject(ObjectOutputStream out) throws Exception{
	    mname="123"+name;        
	    System.out.println(mname);
	    out.writeObject(mname);	
		
	}
	
	public void readObject(ObjectInputStream ois) throws Exception{
		 mname=(String)ois.readObject();
		 name=mname+this.mname;
	}	
}











































