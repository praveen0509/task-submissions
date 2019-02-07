package oops;

public class AccessSpecifiers_Public_Private_Protected {
	public static void main(String args[]) {
	    Animal animal=new Animal();
	    Dog dog=new Dog();
	    
	    System.out.println(animal.e);
		animal.method();
		dog.method();
	   	//dog.method1();
	}
}

class Animal {
	
	public int a=10,b=20;
	private int c=10,d=20;
	protected int e=10,f=20;
	protected void method() {
		System.out.println("Method from protected");
	}
	private void method1() {
		System.out.println("Method from private");
	}
	
	
}


class Dog extends Animal {
	
	protected void m() {
		System.out.println("public"+a+b);
		//System.out.println("public"+c+d);
		System.out.println("public"+e+f);
	}	
	
}







