package Day6;
import java.util.*;

public class InnerClass_DobDifference {
     public static void main(String args[]) {
    	 
         //creating Objects
         Scanner ob=new Scanner(System.in);
         short diffYear,diffDays;
         
         
         Student std=new Student();
         System.out.println("Enter 1st Student Year and Month:");
         Student.Dob dob1=std.new Dob();
         System.out.println("Enter 2nd Student Year and Month:");
         Student.Dob dob2=std.new Dob();
         
         if(dob1.mm<=12 && dob2.mm<=12) {
        	 if(dob2.yy > dob1.yy) {
            	 diffYear = (short)(dob2.yy -dob1.yy -1);
            	 diffDays=(short)(diffYear*365 + dob1.daysDifference(dob1.mm) + dob2.daysDifference(dob2.mm));
            	 System.out.println("Days Difference:"+ diffDays);
             }
        	 
        	 else {
        		 diffYear = (short)(dob1.yy -dob2.yy -1);
            	 diffDays=(short)(diffYear*365 + dob1.daysDifference(dob1.mm) + dob2.daysDifference(dob2.mm));
            	 System.out.println("Days Difference:"+ diffDays);        		 
        	 }
         }
         else
        	 System.out.println("Finding Days Difference not possible");
         ob.close();
     }

}

class Student {
	public short id;
	public String name;
	
	public class Dob {
		 public short mm,yy;
		 Dob() {
			 Scanner obj=new Scanner(System.in);
			 short yy=obj.nextShort();
	         short mm=obj.nextShort();
	         //short dd=obj.nextShort();			
	         
			//this.dd=dd;
			this.mm=mm;
			this.yy=yy;
			System.out.println("dateOfBirth:"+mm+"-"+yy);
          }			 
		short monthDays[]=new short[]{31,28,31,30,31,30,31,31,30,31,30,31};
		boolean flag=true;
		
		
		public short daysDifference(short month) {
			short sum=0, iter;
			boolean flag=true;
			//calculating days from given month to 'Dec' month 
			if(flag) {
				for(iter=(short)(month-1); iter<11; iter++)
					sum += monthDays[iter];
			    flag=false;
		     } 
			//calculating days from 'Jan' to 'given month'
			else
			  for(iter=0; iter<month-1; iter++)
				 sum += monthDays[iter];
			
			return sum;
		}
	}	
}

/*
output:
	  Enter Student Details:
		1994
		12
		5
		dateOfBirth: 5-12-1994
	 Enter Student Details:
		1996
		6
		21
		dateOfBirth: 21-6-1996
	Days Difference: 548
		
		
		
     Enter 1st Student Year and Month:
       1996
       11
       dateOfBirth:11-1996 
     Enter 2nd Student Year and Month:
       1993
       23
       dateOfBirth:23-1993
    Finding Days Difference not possible

*/

























