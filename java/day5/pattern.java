import java.io.*;

public class pattern
{
  public static void main(String args[])
  {
    int i,j,n=4;
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=i*5;j++)
        System.out.print("*");
      System.out.print("\n");
      for(j=1;j<=i;j++)
         System.out.print("*");
      System.out.print("\n");
      for(j=1;j<=i*5;j++)
        System.out.print("*");
      System.out.print("\n");
     }
  }

}
