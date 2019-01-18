/*
 * Do the following exercise
	> Create an abstract class Parent with property details and an abstract method 'calculate()'.
	> Now derive 'Son' class from 'Parent' class and calculate the son's property by implementing the 'calculate()' method.

 */

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
	public int propertyValue;
	public String propertyName;
		 
	abstract void calculate();
}

//child class
class Son extends Parent {
	public void calculate(){
		Scanner  ob=new Scanner(System.in);
		int propertySum=0;
		byte num=1;
		while(num!=0) {
			System.out.println("\nEnter son propertyName and PropertyValue:-");
			propertyName=ob.next();
			propertyValue=ob.nextInt();
			System.out.println("Son PropertyValue="+ propertyValue +"\nPropertyName="+propertyName);
			propertySum+=propertyValue;			
			System.out.println("Enter not 0==continue and 0==Stop");
			num=ob.nextByte();
		}
		
		System.out.println("Son Property Value:-"+propertySum);
		ob.close();	
	}
	
}

/*  output:
	Enter student Id and name:-
	104
	praveen
	Student Id=104 name=praveen
*/