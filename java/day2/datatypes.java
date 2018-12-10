import java.io.*;
import java.util.*;

public class datatypes
{
 public static void main(String args[])
 {
   int a=10,b=20;
   long l=30L;
   float c=10.5f, d=20.5f;
   double e=c;
   char ch='p';
                   //String s=(String)ch;  char cannot be converted to string directly
   c=b;            //lower order datatypes are fitting directly into higher datatypes(int-->float,double etc) 
   System.out.println(b/d+" "+b/e +" "+" "+ch+" "+c+" "+e+" ");              //2 p 20.0 10.5
                    //int/float == float
   a=(int)l;       //a=l giving incompatible type
   c=(float)e;            //c=e giving incompatible type
   System.out.println(" "+a+" "+l+" "+c +"float="+ 10/3f+ "double="+10/3.0);
                    //float giving 7digits, double giving 15digits after decimal

   a=2147483647;    //2147483648 gives "integer number too large"
   l=9223372036854775807L;  //+1 gives "integer number too large"
   byte by=127;  //+1 gives "byte value too long"
   System.out.println("integer="+a+" long="+l+" byte="+by);
   
 }

}

/*There are six numeric types four integer and two floating point:

byte   1 byte   -128 to 127
short  2 bytes  -32,768 to 32,767
int    4 bytes  -2,147,483,648 to 2,147,483,647
long   8 bytes  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80
float  4 bytes  7 decimal digits
double 8 bytes  16 decimal digits
*/
