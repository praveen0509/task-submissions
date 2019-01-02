package Day6;
import java.util.Scanner;

public class InnerClass_DobDifference {
     public static void main(String args[]) {
    	 
         //creating Objects
         Scanner ob=new Scanner(System.in);
        /* byte dd=ob.nextByte();
         byte mm=ob.nextByte();
         byte yy=ob.nextByte(); 
         
         System.out.println("Enter ID and Name of a student");
         std.id=ob.nextByte();
         std.name=ob.next();
         System.out.println("Enter dd,mm,yy of the Student");
    	 */
         
         Student std=new Student();
         Student.Dob dob1=std.new Dob((short)10,( short)12, (short)1994);
         Student.Dob dob2=std.new Dob((short)10,( short)8, (short)1996);
         
         ob.close();
     }

}

class Student {
	public short id;
	public String name;
	
	public class Dob {
		 public short dd,mm,yy;
		 Dob(short dd,short mm, short yy) {
			this.dd=dd;
			this.mm=mm;
			this.yy=yy;
			System.out.println("dateOfBirth: "+dd+"-"+mm+"-"+yy);
		}		
	}
	
}
