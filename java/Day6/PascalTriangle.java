/*
 * Write a program to print Pascal's triangle
        Input number of rows: 5                                                          
              1                                                                          
             1 1                                                                         
            1 2 1                                                                        
           1 3 3 1                                                                       
          1 4 6 4 1

 */

package Day6;
import java.util.Scanner;

public class PascalTriangle {
  
	public static void main(String args[]) {
		int num,lineNo;
		System.out.print("Enter n value:-");
		Scanner ob=new Scanner(System.in);
		num=ob.nextInt();
		System.out.println("1");
		for(lineNo=1; lineNo<=num; lineNo++) {              //lines iterator==lineNo
      		for(int rfact=0; rfact<=lineNo; rfact++)        // lower value from NCr
				ncr(lineNo,rfact);                          //ncr takes value from combinations
	        System.out.println(" ");
	    }
		ob.close();
	}
	
	//Value is printed based on NCr combinations.Thats why taken ncr()
	public static void ncr(int lineNo, int rfact){
		int n_r=(int)(lineNo-rfact);
		int value=fact(lineNo) / (fact(n_r) * fact(rfact)); 
		System.out.print(value+" ");
	}
	
	//factorial is required for every number. Thats why taken fact() 
	public static int fact(int value){
		int fact=1;
		for(int i=1;i<=value;i++)
			fact *= i;
		return fact;
	}
}

/*
   Variables description:
      rfact= iterator for r in Combinations(ncr)
      n_r= value in (n-r)! in NCr combinations
      value= Total value in NCr Combinations

output:
Enter n value:-6
1
1 1  
1 2 1  
1 3 3 1  
1 4 6 4 1  
1 5 10 10 5 1  
1 6 15 20 15 6 1  
*/