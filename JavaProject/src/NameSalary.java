import java.util.Scanner;

public class NameSalary {
  public static void main(String args[]) {
	  
	  float sum=0, count=0;
	  Scanner ob= new Scanner(System.in);
	  System.out.println("Enter a number:");
	  int num = ob.nextInt();
	  
	  while(num!=-1){
		  count++;
		  sum = sum + num;
		  System.out.println("Enter a number:");
		  num = ob.nextInt();
	  }
	  System.out.println(sum/count);
  }
}






