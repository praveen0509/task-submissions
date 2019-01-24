/*

3. Create a class Student having properties id, name, address and marks.
Create a class Address with properties doorNo, streetName and city.
Create an association between Student and Address.
Add 5 students to a collection.
Sort the students based on marks in Ascending Order - using comparator
Retrive the student based on id.
Delete the student with a given id. (Scan id of student)
Rename the student with a given id. (Scan the id of student)

*/
package testThursday1;
import java.util.*;

public class StudentClassSort {
	
	public static void main(String args[]) {
		
		Student1 s1=new Student1(101, 95, "praveen",1, 5,"hyd");
		Student1 s2=new Student1(102, 92, "bharath",2, 6,"hyd");
		Student1 s3=new Student1(103, 75, "abhi",3, 7,"hyd");
		Student1 s4=new Student1(104, 85, "sai",4, 8,"sec");
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		for(Student1 s:al) {
			System.out.println("id:"+s.id+" name:"+s.name+" marks:"+s.marks+" s.address:"+s.address);			
		}		
	}
}



class Student1 implements Comparable<Student1> {
	int id;
	int marks;
	String name;
	Address address;
	Student1(int id, int marks, String name, int doorNo,int streetNo, String city) {
		this.id=id;
		this.marks=marks;
		this.name=name;
		address=new Address(doorNo, streetNo, city);
	}
	public int compareTo(Student1 obj) {
		return this.id-obj.id;	
	}
	
}


class Address {
	int doorNo;
	int streetNo;
	String city;
	
	Address(int doorNo,	int streetNo, String city) {
		this.doorNo=doorNo;
		this.streetNo=streetNo;
		this.city=city;
	}
	
	public String toString() {
		return "DoorNo:"+doorNo+" Streetno:"+streetNo+" city:"+city;
	}
	
}





























