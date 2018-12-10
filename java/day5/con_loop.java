import java.io.*;

public class con_loop
{
  public static void main(String args[])
  {
   int a=10,b=30,c=15,i;
      /*simple nested if statements shown below..
         here once statement in if is not executed, then 
         it will go to another if statement until one
         statement is true*/
   if(a==b)
    System.out.println("a and b are equal");
   else if(a==c)
    System.out.println("a and c are equal");
   else if(b==c)
    System.out.println("b and c are equal");
   else
     System.out.println("no one is equal to another");
    
  /*
   for loop contains i) variable initialization
                    ii) condition for execution
                    iii) incrementing variable  */
   for(i=5;i<a;i++)  
    System.out.println(i);
  
  //while loop is used execute a block until condition fails
  i=2;
  while(i<c)
  {
   System.out.println(i);
   i+=2;   //must give increment value otherwise
           // block will go to infinite loop 
  }
  
  i=1; 
  do{
   System.out.println(i);
   i+=1;
   }while(i<=5);
  }



}
