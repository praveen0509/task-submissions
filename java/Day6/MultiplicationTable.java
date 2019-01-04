/*
 * Display multiplication table
	5*1=5
	5*2=10
	...
	5*10=50

 */


package Day6;
import java.util.*;

public class MultiplicationTable
{

	public static void main(String[] args) 
	{
       short table,upto;      //table = value,  upto= multiplication
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter which table to display:");
       table=ob.nextShort();
       
       System.out.println("Enter upto which value to diplay the table:");
       upto=ob.nextShort();
       
       for(short i=1;i<=upto;i++)
    	   System.out.println(table+"x"+i+" = "+(table*i));   
       ob.close();
	}

}

/*
output:
	Enter which table to display:
		6
		Enter upto which value to diplay the table:
		15
		6x1 = 6
		6x2 = 12
		6x3 = 18
		6x4 = 24
		6x5 = 30
		6x6 = 36
		6x7 = 42
		6x8 = 48
		6x9 = 54
		6x10 = 60
		6x11 = 66
		6x12 = 72
		6x13 = 78
		6x14 = 84
		6x15 = 90
		*/
