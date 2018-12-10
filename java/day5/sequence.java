import java.io.*;

public class sequence
{
  public static void main(String args[])
  {
   int i=1,j=0,n=9;
   System.out.println(i);
   for(i=2;i<=n;i++)
   {
    System.out.println(i+j);
    j=i+j-1;
   }

  }

}
