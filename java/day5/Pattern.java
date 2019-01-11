import java.io.*;
import java.util.*;

public class Pattern
{
  public static void main(String args[])
  {
    int i,j,n,count=0;
    System.out.println("enter n value:");
    Scanner ob=new Scanner(System.in);
    n=ob.nextInt();
    for(i=1;i<=n;i++)
    {
      /*
      for(j=1;j<=i*5;j++)
        System.out.print("*");
      System.out.print("\n");
      for(j=1;j<=i;j++)
         System.out.print("*");
      System.out.print("\n");
      for(j=1;j<=i*5;j++)
        System.out.print("*");
      System.out.print("\n");    
      */      
      
      for(j=1;j<=11*i;j++)        
      {
        if(j>5*i && count<=i)
        {
         if(count==0 || count==i)
            System.out.println("");
         System.out.print("*");
         count++;
        }
        else
         System.out.print("*");
      }
      count=0;
      System.out.println(""); 
     }
  }

}

/*
output:
enter n value:
5
*****
*
*****
**********
**
**********
***************
***
***************
********************
****
********************
*************************
*****
*************************

*/












