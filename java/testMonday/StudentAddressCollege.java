/*

2. Create a Student class having the properties of id and name. And Create a Address class having the
 properties of door no, street, city and state.

Now create a College class adding to the map with Student Object as key and Address Object as value.

Add this data into the file.

Read the data from file and display the data.

*/


package testMonday;
import java.io.*;
import java.util.*;

public class StudentAddressCollege {
      public static void main(String args[]) throws Exception {
    	  
    	  HashMap<StudentData, Address> hm=new  HashMap<StudentData, Address>(); 
    	  hm.put(new StudentData(101,"praveen"), new Address("200/A", "venkat nagar lane", "Hyd", "TG"));
    	  hm.put(new StudentData(102,"abhi"), new Address("201/A", "venkateshwar nagar lane", "vizag", "Ap"));
    	  hm.put(new StudentData(103,"bharath"), new Address("202/A", "bharath nagar lane", "bangalore", "Karnataka"));
    	  
    	  ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/home/sb-33/Desktop/Output")); 
  		  oos.writeObject(hm);
  		  oos.close();
  		  System.out.println("Object Serialized");
    	  
  		  
  		  ObjectInputStream ois=new ObjectInputStream(new FileInputStream("/home/sb-33/Desktop/Output"));
  		  HashMap<StudentData, Address> hm1=new  HashMap<StudentData, Address>();
  		  hm1=(HashMap<StudentData, Address>)ois.readObject();
  		  
  		for (Map.Entry<StudentData, Address> entry : hm1.entrySet()) {
  			
  			StudentData sd=entry.getKey();
  			Address add=entry.getValue();
  			System.out.println("\nAll Students Data::" +
  					"\nid:"+sd.id+"\nname:"+sd.name+"\ndoorNo:"+add.doorNo+"\nstreet:"+add.street+"\ncity:"+add.city
  					+"\nstate:"+add.state);  			
  		}  		 
  		 System.out.println("Object Deserialized");
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

class Address implements Serializable {
	String doorNo, street, city, state;
	
	Address(String doorNo, String street, String city, String state) {
		
		this.doorNo=doorNo;
		this.street=street;
		this.city=city;
		this.state=state;		
	}
}

























