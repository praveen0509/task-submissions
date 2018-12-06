import java.util.*;
import java.io.*;

public class operators
{
  public static void main(String args[])
  {
   int a=10,b=20,c=30;
   arithmetic(a,b);
   assignment(a,b);
   //ternary(a,b);
   relation(a,b);
   System.out.println("a="+a+"  b="+b+"  c="+c);
  }

  public static void arithmetic(int a,int b)
  {
   System.out.println("a=10,b=20 values:-- +:-"+(a+b) +" -:"+(a-b)+"  *:-"+(a*b)+"  /:-"+(b/a) + "  %:-"+(b%a));
  }
  
  public static void assignment(int a,int b)
  {
   System.out.println("a=10,b=20,c=30 assignment values:--> a=5:-"+(a=5)+"  a+=3:-"+(a+=3)+"  b-=:-"+(b-=10)+"  b/=5:-"+(b/=5));
   }

  /*public static void ternary(int a, int b)
  {
   a==b ? (System.out.println("a is larger")):(System.out.println("b is larger"));
   }*/


  public static void relation(int a, int b)
  {
   if(a==b)
     System.out.println("a and b are equal");
   else if(a>=b)
     System.out.println("a is larger than b");
   else if(a<=b)
     System.out.println("a is smaller than b");
   if(a!=b)
     System.out.println("a is not equal to b");



  }




}
