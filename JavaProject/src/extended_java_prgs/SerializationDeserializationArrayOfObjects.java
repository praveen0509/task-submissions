package extended_java_prgs;
import java.io.*;

public class SerializationDeserializationArrayOfObjects { 
	public static void main(String args[]) {
		Parent p=new Parent();
		Child c=new Child();
		
		try{
			File f=new File("/home/sb-33/Desktop/output");
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.writeObject(c);
			System.out.println("Serialized");
			oos.close();
			fos.close();			
		}
		catch (Exception e) {
		   System.out.println(e);
		}
		
		try {
			File f=new File("/home/sb-33/Desktop/output");
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Object obj=null;
			while((obj=ois.readObject())!=null) {
				try  {
					if(obj instanceof Parent) {
						Parent dp=(Parent)obj; 
						System.out.println(dp.namep+" "+dp.idp);
					}
					else if(obj instanceof Child) {
						Child dc=(Child)obj;
						System.out.println(dc.namec+" "+dc.idc);
					}
				}
				catch(Exception e) {}
			}			
			fis.close();
			ois.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	

}


class Parent implements Serializable {
	String 	namep="praveen";
	transient int idp=100;
}

class Child implements Serializable {
	String namec="pavan";
	static int idc=200;	
}




























