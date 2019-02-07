package collections;

public class EqualsAndHashCode {
	
	String name;
	int id;
    EqualsAndHashCode(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	//Overriding Equals() 
	public boolean equals(Object obj) {
		if(obj instanceof EqualsAndHashCode){
			EqualsAndHashCode obj1=(EqualsAndHashCode)obj;
			return this.name.equals(obj1.name) && this.id==obj1.id;			
		}
		else
			return false;	
	}
	
	
	//Overriding HashCode() 
	public int hashCode() {
		int result=0;
		for(int i=0; i<name.length(); i++)
			result= result*10 + name.charAt(i);
		return result+id;
	}
	
	
	public static void main(String args[]) {
	
		EqualsAndHashCode e1=new EqualsAndHashCode("praveen",123);
		EqualsAndHashCode e2=new EqualsAndHashCode("praveen",124);
		EqualsAndHashCode e3=new EqualsAndHashCode("praveen",123);
		
		System.out.println("e1.equals(e3):"+e1.equals(e3));  //true
		System.out.println("e1.equals(e2):"+e1.equals(e2));  //false
		
		System.out.println("e1.hashCode():"+e1.hashCode());  //e1.hashCode():124499343
		System.out.println("e2.hashCode():"+e2.hashCode());  //e1.hashCode():124499344
		System.out.println("e3.hashCode():"+e3.hashCode());
		System.out.println(e1.hashCode()==e2.hashCode());   //false
	}
	
}
