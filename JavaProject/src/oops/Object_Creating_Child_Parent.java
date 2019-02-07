package oops;

public class Object_Creating_Child_Parent {
	public static void main(String args[]) {
		
		//creating object to the same class
		Object_Creating_Child_Parent std=new Object_Creating_Child_Parent();  
		System.out.println(std);              
		//oops.Object_Creating_Child_Parent@3f8f9dd6
		System.out.println(std.toString());   
		//toString() from Object main class
		//oops.Object_Creating_Child_Parent@3f8f9dd6
		System.out.println(std.hashCode());
		//1066376662
		
		Teacher tc=new Teacher();
		Teacher t=new Student();
		Student s=new Student();
		// Both references are pointing to child class Objects only
		 //t.m1();  
		  //Parent Reference Variable cannot able to call child class
		  //if there is no calling method available
		  //Conclusion: Using Parent reference for creating Object
		      //cursor goes from SuperClass to subclass
		s.m1();
		s.m();
		
		System.out.println("Creating object and calling function:");
		Student.m1();
		
		//Static variables and methods can be accessed by ClassName.variable or method
		Teacher.var=30;
		System.out.println(tc.var);
		//direct access is also possible for Static variables. What is the difference between both Declarations?
		
	
	}
}


//Parent class
class Teacher  {
	
	 static int var=20;
	 public void m() {
		 System.out.println("parent class called"); 
		 }	
	 
}

//Extended Class
class Student extends Teacher {
	public void m() {
		//public static void m()
		 //This static method cannot hide the instance method from Teacher
		//Cannot use super in a static context
		System.out.println("override child class called");
		}
	
	public static void m1(){
		 System.out.println("Child class called"); 
	     //m();           //child method()
	     //super.m();    //parent method()
	     //System.out.println("parent class from child Class" + super.m()); //The operator + is undefined for the argument type(s) String, void
	
	}
}













































