/*

Create a class BankTransaction which containing money as property and methods
withdrawMoney and, depositMoney.
Create the classes Depositer and Withdrawer which implements runnable interface, constructor
to initialize BankTransaction property of the class. Implement the run method with while loop
calling withdraw and depositeMoney methods from each thread.
Ex: run() {
int i=0 ;
while(i<10)
{
// call the respective method from the class
}
}
And also print thread name and priority.

*/

package testThursday1;
import java.util.*;

public class BankTransactionthreads {
	
	public static void main(String args[]) {
		
		Depositor d=new Depositor(1000);
		WithDrawer wd=new WithDrawer();
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(wd);
		
		t1.start();
		t2.start();
		
		System.out.println("Name:"+t1.getName()+"\t priority:"+t1.getPriority());
		System.out.println("Name:"+t2.getName()+"\t priority:"+t2.getPriority());
	}

}


class BankTransaction {
	
	double money;
	Scanner ob=new Scanner(System.in);
	double withdrawMoney() {
		return money;
	}
	
	void depositeMoney(double deposite) {
		this.money=deposite;
	}
	
}


class Depositor extends BankTransaction implements Runnable {
	
	Depositor(double money1) {
		money=money1;
	}
	
	public void run() {
		for(int i=1; i<=3; i++) {
			try {
			    Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
			System.out.println("WithDraw:"+withdrawMoney());			
		}
	}
	
}


class WithDrawer extends BankTransaction implements Runnable{
	
	WithDrawer() {
	}
	
	public void run() {
         double depmoney;
		 for(int i=1; i<=3; i++) {
			System.out.print("Enter Deposite Money:");
			depmoney=ob.nextDouble();
			depositeMoney(depmoney);
		}
	}
}











































