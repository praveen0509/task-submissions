/*

3. Create an interface Sim that contains method sendSMS() parameters message and mobileNumber,
 dialACall() with parameter mobile number. Create classes Airtel, BSNL and Vodafone which implement Sim.

Create a Class Mobile contains insertSim() along with sendSms() and dialACall()

Now Create MobileUser where he can insert sim and the functionality sendSms or dialACall.  

*/

package testMonday;
import java.util.*;

public class Mobileuser {
	public static void main(String args[]) {
		
		Mobile mobile=new Mobile();
		System.out.println("Enter \n1==Airtel \n2==BSNL \n3==Vodafone");
		Scanner ob=new Scanner(System.in);
		int simType=ob.nextInt();
		
		Airtel airtel=new Airtel();
		BSNL bsnl=new BSNL();
		Vodafone vodafone=new Vodafone();
		
		if(simType==1)
			mobile.insertSim(airtel);
		else if(simType==2)
			mobile.insertSim(bsnl);
		else if(simType==3)
			mobile.insertSim(vodafone);
		else
			System.out.println("Wrong Entry......");		
	
		ob.close();
	}

}



interface Sim {
	void sendSMS(String msg, long mobileNo);
	void dialACall(long mobileNo);
}

class Airtel implements Sim {
	public void sendSMS(String msg, long mobileNo) {
		System.out.println("\nFrom Airtel:");
		System.out.println("Sending Msg:"+msg);
		System.out.println("To:"+mobileNo);		
	}
	public void dialACall(long mobileNo) {
		System.out.println("Calling to "+mobileNo);
	}
}


class BSNL implements Sim {
	public void sendSMS(String msg, long mobileNo) {
		System.out.println("\nFrom BSNL:");
		System.out.println("Sending Msg:"+msg);
		System.out.println("To:"+mobileNo);		
	}
	public void dialACall(long mobileNo) {
		System.out.println("Calling to "+mobileNo);
	}
}


class Vodafone implements Sim {
	public void sendSMS(String msg, long mobileNo) {
		System.out.println("\nFrom Vodafone:");
		System.out.println("Sending Msg as:"+msg);
		System.out.println("To:"+mobileNo);		
	}
	public void dialACall(long mobileNo) {
		System.out.println("Calling to "+mobileNo);
	}
}




class Mobile {	
	Vodafone vodafone;
	Airtel airtel;
	BSNL bsnl;
	Object ob1;
	Scanner sc=new Scanner(System.in);
	void insertSim(Object ob) {
		if(ob instanceof Airtel) {
			this.airtel=(Airtel)ob;
			System.out.println("Airtel sim Using.....\n");
			System.out.println("Enter your Msg:\nPh.No to Send");
			airtel.sendSMS(sc.nextLine(),sc.nextLong());
			System.out.println("Enter Phone Number To Call");
			airtel.dialACall(sc.nextLong());
			
		}	
		else if(ob instanceof Vodafone) {
			this.vodafone=(Vodafone)ob;
		    System.out.println("Vodafone sim Using.....\n");
		    System.out.println("Enter your Msg:\nPh.No to Send");
			vodafone.sendSMS(sc.nextLine(),sc.nextLong());
			System.out.println("Enter Phone Number To Call");
			vodafone.dialACall(sc.nextLong());
		}
		else if(ob instanceof BSNL) {
			this.bsnl=(BSNL)ob;
		    System.out.println("BSNL sim Using.....\n");
		    System.out.println("Enter your Msg:\nPh.No to Send");
			bsnl.sendSMS(sc.nextLine(),sc.nextLong());
			System.out.println("Enter Phone Number To Call");
			bsnl.dialACall(sc.nextLong());
		}
	}	
}






/*


Enter 
1==Airtel 
2==BSNL 
3==Vodafone
1
Airtel sim Using.....
Enter your Msg:
Ph.No to Send
praveen pavan
8019424530

From Airtel:
Sending Msg:praveen pavan
To:8019424530
Enter Phone Number To Call



*/
























