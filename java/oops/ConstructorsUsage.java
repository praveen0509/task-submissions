package oops;

public class ConstructorsUsage {
	int id=1000;	
	ConstructorsUsage() {
		System.out.println("Default Construcor");
	}
	
	ConstructorsUsage(String name, int id) {
		System.out.println("Parameterized Construcor");
		System.out.println("name:"+name+"\nid:"+id);
	}
	
	public static void main(String args[]) {
		
	     ConstructorsUsage dc=new ConstructorsUsage();
	     ConstructorsUsage pu=new ConstructorsUsage("praveen", 100);		
	     System.out.println(dc.id);
	    // System.out.println("id"+pc.id);
	}	
}
