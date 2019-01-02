package Day6;
import java.util.Scanner;

public class Abstract_method_calculate {
	public static void main(String args[]) {
		Son sonObj=new Son();
		sonObj.calculate();		
	}

}

//parent class
abstract class Parent {
	public int id;
	public String name;
		 
	abstract void calculate();
}

//child class
class Son extends Parent {
	public void calculate(){
		Scanner  ob=new Scanner(System.in);
		System.out.println("Enter student Id and name:-");
		id=ob.nextInt();
		name=ob.next();
		System.out.println("Student Id="+id+" name="+name);
	}
	
}

/*  output:
	Enter student Id and name:-
	104
	praveen
	Student Id=104 name=praveen
*/