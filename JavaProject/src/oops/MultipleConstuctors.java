package oops;

public class MultipleConstuctors {
	
	String name;
	int age;
	public static void main(String args[]){
		
		MultipleConstuctors mp1=new MultipleConstuctors("Praveen");
		MultipleConstuctors mp2=new MultipleConstuctors("Praveen",24);
		mp1.display();
	}
	
	MultipleConstuctors(String name){
		this.name=name;
	}
	
	MultipleConstuctors(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void display(){
		System.out.println("Name:"+name+"\tage:"+age);
		
	}

}
