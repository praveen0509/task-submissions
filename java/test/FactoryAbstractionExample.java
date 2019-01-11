/*
 4. Consider an abstract class Factory contains the properties of noOfToolsRequried,
typeOfManufacture and abstract method manufacturedFor. Vehicle is a sub-class(it is also an
abstract class) including a property of noOfGears.
You have a 2 Companies named Honda and MarutiSuzike have to use the properties of Vehicle
and it has its own property modelName.
Now you have do the Execution for Honda and MarutiSuzike
 */



package test;
import java.io.*;
import java.util.Scanner;



public class FactoryAbstractionExample {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter model Name for Honda Class:");
		String modelNameHonda=ob.next();
		Honda honda=new Honda(modelNameHonda);
		System.out.println("Enter No.of tools, typesOfmanufacture, No.of Gears for Honda");
		honda.noOfToolsRequired=ob.nextInt();
		honda.typesOfManufacture=ob.nextInt();
		honda.noOfGears=ob.nextInt();	
		
		
		System.out.println("Enter model Name for Maruthi Class:");
		String modelNameMaruthi=ob.next();
		Honda maruthi=new Honda(modelNameMaruthi);
		System.out.println("Enter No.of tools, typesOfmanufacture, No.of Gears for maruthi");
		maruthi.noOfToolsRequired=ob.nextInt();
		maruthi.typesOfManufacture=ob.nextInt();
		maruthi.noOfGears=ob.nextInt();
		
		
		System.out.println("Honda Properties:");
		honda.manufacturedFor();
		System.out.println("Maruthi Properties:");
		maruthi.manufacturedFor();
		
	}

}



abstract class Factory {
	
	int noOfToolsRequired;
	int typesOfManufacture;
	abstract void manufacturedFor();
}


//Vehicle class
abstract class Vehicle extends Factory {
	int noOfGears;
}

//Honda Class
//Extended Class Vehicle
class Honda extends Vehicle {
	String modelName;
	Honda(String modelName){
		this.modelName=modelName;
	}
	
	public void manufacturedFor() {
		System.out.println("modelName:"+modelName);
		System.out.println("No.of Tools Required:"+noOfToolsRequired);
      	System.out.println("TypesOfManufacture:"+typesOfManufacture); 
      	System.out.println("noOfGears:"+noOfGears);
	}
	
}

//Maruthi class
//Extended Class Vehicle
class MaruthiSuzuki extends Vehicle {
	String modelName;
	MaruthiSuzuki(String modelName) {
		this.modelName=modelName;
	}
	
	public void manufacturedFor() {
		System.out.println("modelName:"+modelName);
		System.out.println("No.of Tools Required:"+noOfToolsRequired);
      	System.out.println("TypesOfManufacture:"+typesOfManufacture); 
      	System.out.println("noOfGears:"+noOfGears);	
	}	
	
}

































