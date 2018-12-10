import java.io.*;

public class alpha
{
  public static void main(String args[])
  {
   char i=65;
   for(;i<=90;i++)
     System.out.println("capital:"+i+" small:"+(char)(i+32));

   System.out.println("\n");
   i=65;
   while(i<91)
   {
    System.out.println("capital:"+i+" small:"+(char)(i+32));
   i++;
   }
  
  }

}
