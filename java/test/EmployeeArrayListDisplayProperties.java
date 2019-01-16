
/*
3. Create a Employee class with name, employeeId, salary as properties and create a employee
arraylist with the employees.
Override toString method to display employee details. And read input from user to display
employee details of at given position. Ex: If user enters 1 display the details at position one in
the array.
 */





package test;
import java.util.Scanner;

public class EmployeeArrayListDisplayProperties {
	
	public static void main(String args[]) throws Exception {
			
		Scanner ob=new Scanner(System.in);
		byte num,which;
		
		System.out.println("Enter how many Emp details you wants to enter:");
		num=ob.nextByte();
		Employee emp[]=new Employee[num];
		
		//Initializing Objects
		for(byte iter=0; iter<num; iter++)
			emp[iter]= new Employee();
		
		System.out.println("Enter which Employee Details you want:");
		which=ob.nextByte();
		System.out.println(emp[which-1].toString());
		
		ob.close();
	}

}




class Employee {
	
	public String name;
	public int empId;
	public int salary;
	Scanner ob=new Scanner(System.in);
	
	Employee(){
		System.out.println("Enter Name,ID and salary of an Employee:");
		name=ob.next();
		empId=ob.nextInt();
		salary=ob.nextInt();		
	}
	
	public String toString() {
		System.out.println("Name:"+name+" EmpId:"+empId+" Salary:"+salary);	
		return name;		
	}	
	
}


/*
 
 Enter how many Emp details you wants to enter:
3
Enter Name,ID and salary of an Employee:
praveen
101
1000
Enter Name,ID and salary of an Employee:
kumar
102
2000
Enter Name,ID and salary of an Employee:
pavan
103
3000
Enter which Employee Details you want:
3
Name:pavan EmpId:103 Salary:3000
pavan 
 
 
 
 
 
 
 
 Enter Name,ID and salary of an Employee:
praveen
12
1000
Enter Name,ID and salary of an Employee:
kumar
13
3000
Enter Name,ID and salary of an Employee:
pavan
14
2000
Enter which Employee Details you want:
3
Name:pavan EmpId:14 Salary:2000
 */


























