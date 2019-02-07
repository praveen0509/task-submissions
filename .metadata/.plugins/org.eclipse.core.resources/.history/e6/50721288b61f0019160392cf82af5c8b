/*
Create an abstract class called Book. Include a String field for the book's title
and a double field for the book's price. Within the class, 
include a constructor that requires the book title and 
two get methods: one that returns the title and one that returns the price. 
Also include an abstract method named setPrice(). 
Create two child classes of Book: Fiction and NonFiction. 
Within the constructors for the Fiction and NonFiction classes, call setPrice 
so all Fiction Books cost $24.99 and all Non Fiction Books cost $37.99. 
A main class Challenge creates an arraylist of Book variables to store 
references to objects of each concrete class. 
For each book, display the string representation as shown below.

input:-
Title of fiction book:
Harry Potter
Title of non fiction book:
Calculus

output:-
Title-Harry Potter Cost-$24.99
Title-Calculus Cost-$37.99

*/

package testThursday1;
import java.util.*;

public class FrictionNonFrictionBooksPolymorphism {
	
	public static void main(String args[]) {
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Friction Book Title:");
	    String ft=ob.next();
		
	    System.out.print("Enter NonFriction Book Title:");
	    String nft=ob.next();
	    
		Friction fo=new Friction(ft);
		NonFriction nfo=new NonFriction(nft);
		
		ArrayList<Book> al=new ArrayList<Book>();
		al.add(fo);
		al.add(nfo);
		Object a[]=al.toArray();
		for(int i=0; i<a.length; i++) {
			System.out.println("Name of the Book:"+((Book) a[i]).getTitle() +
					"       Price:"+ ((Book) a[i]).price);
		}
			
	}
}


abstract class Book {
	String title;
	double price;
	Book(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public Double getPrice() {
		return price;
	}
	abstract void setPrice();
}

//Friction Class
class Friction extends Book {
	public void setPrice() {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Friction Book Price :");
		price=ob.nextDouble();		
	}
	Friction(String title) {
		super(title);
		setPrice();		
	}	
}




//NonFriction Class
class NonFriction extends Book{
	public void setPrice() {
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter NonFriction Book Price:");
		price=ob.nextDouble();		
	}
	
	NonFriction(String title) {
		super(title);
		setPrice();		
	}
}



/*

Enter Friction Book Title:HarryPotter
Enter NonFriction Book Title:Calculus
Enter Friction Book Price :24.99
Enter NonFriction Book Price:37.99
Name of the Book:HarryPotter       Price:24.99
Name of the Book:Calculus       Price:37.99


*/


























