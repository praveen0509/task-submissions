package collections;
import java.util.*;
import java.lang.*;

/*
 * Comparable Interface
 
public class ComparableComparatorInterface {
	public static void main(String args[]) {
		
		ArrayList<Compare> list=new ArrayList<Compare>();
		Compare c[]=new Compare[3];
		for(byte i=0; i<3; i++) {
			System.out.println("Enter Name and Year:");
			c[i]=new Compare();
		}
		
		Collections.addAll(list,c);
		
		Collections.sort(list);
		for(Compare cm:list) {
			System.out.println("name:"+cm.name+ "\t year:"+cm.year);
		}
	}

}

class Compare implements Comparable<Compare> {
	String name;
	int year;
	Scanner ob=new Scanner(System.in);
	Compare(){
		name=ob.next();
		year=ob.nextInt();				
	}
	
	public int compareTo(Compare c) {
		return this.year-c.year;
	}	
}

*/



public class ComparableComparatorInterface {
	
	public static void main(String args[]) {
		
		ArrayList<Compare> list=new ArrayList<Compare>();
		Compare[] cm=new Compare[3];
		for(byte i=0; i<3; i++) {
			System.out.println("Enter Name and Age:");
			cm[i]=new Compare();
		}
		
		Collections.addAll(list,cm);
		Collections.sort(list,new ageCompare());
		for(Compare c:list)
			System.out.println("name:"+c.name+"\t age:"+c.age);
		
		
	
	}	
}


class Compare {
	Scanner ob=new Scanner(System.in);
	String name;
	int age;
	Compare() {
		name=ob.next();
		age=ob.nextInt();
	}
	
}

//AgeComparator
class ageCompare implements Comparator<Compare> {
	public int compare(Compare ob1,Compare ob2) {
		return ob1.age-ob2.age;
	}
	
}

//nameComparator
class nameCompare implements Comparator<Compare> {
	public int compare(Compare ob1,Compare ob2) {
		if(ob1.name.compareTo(ob2.name)<0)
			return -1;
		else if(ob1.name.compareTo(ob2.name)>0)
				return 1;
		else
			return 0;
	}
	
}



