import java.io.*;
import java.util.*;

public class Sequence
{
  public static void main(String args[])
  {
   int i,j=1,n;
   System.out.println("enter n value");
   Scanner ob=new Scanner(System.in);
   n=ob.nextInt();
   //System.out.println(i);
   /*
   for(i=1;i<=n;i++)
   {
    System.out.println(i+j);
    j=i+j;
   } */
  
   i=1;
   while(i<=n)
   {
    System.out.println(i+j);
    j=i+j;
    i++;
   }
   
  }

}

/*
output:
enter n value
7

2
4
7
11
16
22
29
*/
