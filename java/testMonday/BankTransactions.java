/*

1. Write a class Account having properties Account Number, Account Holder Name, Account Holder Address, Account Holder Balance.

Create a SavingsAccount subclass having methods to addBalance, displayBalance and withDraw amount.

Now create a main class Bank

In the main class

Create list of accounts.

Perform operations on any account from the list, add balance, displayBalance, withDraw.

Create user defined exception “Insufficient Balance”, if the Withdrawal amount is greater than balance Amount. It should throw exception “Insufficient Balance”.

Write the objects into a file.

*/


package testMonday;
import java.util.*;
import java.io.*;

public class BankTransactions {
	
	public static void main(String args[]) throws Exception {
		
		Scanner ob=new Scanner(System.in);
		ArrayList<SavingsAccount> al=new ArrayList<SavingsAccount>();
		al.add(new SavingsAccount(101,"praveen", "Chintal", 20000));
		al.add(new SavingsAccount(101,"bharath", "KPHB", 30000));
		al.add(new SavingsAccount(101,"abhijith", "JNTU", 40000));
		al.add(new SavingsAccount(101,"vinod", "balanagar", 50000));
		
		Object[] a=al.toArray();
		System.out.println("Enter which Person details you Wants to Display:" +
				"Enter Index:");
		int index=ob.nextInt();
		bankOperations(ob,index,a);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("/home/sb-33/Desktop/Output")); 
		oos.writeObject(al);
		oos.close();
	}
	
	public static void bankOperations(Scanner ob, int index, Object[] a) {
		SavingsAccount sa=(SavingsAccount)a[index];
		System.out.println("Enter \n1==Withdraw\n2==deposite\n3==Display Details");
		int num=ob.nextInt();
		if(num==1) 
			sa.withDrawBalance(1000);			
		else if(num==2) 
			sa.addBalance(2000);
		else if(num==3)
			sa.displayBalance();
		else
			System.out.println("Wrong Entry");
		sa.displayBalance();
	}
}


class Account {
	int accNo;
	String accHolderName;
	String address;
	double balance;	
}


class SavingsAccount extends Account implements Serializable {
	
	SavingsAccount(int accNo, String accHolderName, String address ,double balance) {
		super.accNo=accNo;
		super.accHolderName=accHolderName;
		super.address=address;
		super.balance=balance;
	}	
	
	public void addBalance(double bal) {
		balance=balance+bal;
	}
	
	public void withDrawBalance(double bal) {
		if(balance<bal)
			System.out.println("Insufficient Balace");
		else
		  balance=balance-bal;
	}
	
	public void displayBalance() {
		System.out.println("accNO:"+accNo+"\naccHolderName:"+accHolderName+"\nbalance:"+balance);
	}
	
}



































