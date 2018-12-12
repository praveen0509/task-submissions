import java.io.*;
import java.util.*;

public class Con_loop
{
  public static void main(String args[])
  {
   int a,b,c,i;
   System.out.println("enter a,b,c values");
   Scanner ob=new Scanner(System.in);
   a=ob.nextInt();
   b=ob.nextInt();
   c=ob.nextInt();   
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
   System.out.println("for loop from 1 to a:");
   for(i=1;i<a;i++)  
    System.out.println(i);
  
  //while loop is used execute a block until condition fails
  System.out.println("while loop from 2 to c incremented by 2:");
  i=2;
  while(i<c)
  {
   System.out.println(i);
   i+=2;   //must give increment value otherwise
           // block will go to infinite loop 
  }
  
  i=1; 
  System.out.println("do while loop from 1 to 5:");
  do{
   System.out.println(i);
   i+=1;
   }while(i<=5);
  
  System.out.println("switch case:");
  System.out.println("enter a character:");
  char ch=ob.next().charAt(0);
  switch(ch)
  {
   case 'a':
    System.out.println("character is a");
    break;
   case 'b':
    System.out.println("character is b");
    break;
   case 'c':
    System.out.println("character is c");
    break;
   case 'd':
    System.out.println("character is d");
    break;
   default:
    System.out.println("not a,b,c,d");
    break;
  } 

 }
}
