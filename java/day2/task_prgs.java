import java.io.*;


public class task_prgs
{
  public static void main(String args[])
  {
   /*
    int a=10,b=20,c=30;
    b=a;c=b;
    System.out.println(c);     //10
   a=b=c=10;  //a already declared
    System.out.println(c);      //10
   //int a,b,c;     //a, b, c values already declared
   a=b=c=10;   
    System.out.println(c);      //10
    */
    
 
   /* char ch='a';
    ch++;
    int a=ch;
    System.out.println(ch+" "+a);
    */
 
   
   /*
   double d=10.5;
    d++;
    System.out.println(d+" "+(d++)+" "+(++d));  //left to right evaluating
   int a=10;
   System.out.println(++a+" "+(a++)+" "+(a--)+" "+(--a));
   */
 

   /*
   boolean  b=true;
   b++;   //bad oparand type boolean for unary operator '++'
  */


    /*
    byte b=20;  
    byte b=b+1;     //b already defined
                    //lossy conversion from int to byte
    byte b=(byte)b+1 ;
    System.out.println(b);  
    


   byte a=10;
   byte b=20;
   byte c=a+b;
   c=(byte)(a+b);  //c already defined
   System.out.println(c);  */

  /*
   System.out.println(10/0);
   System.out.println(10/0.0); //arithmetic exception
  */

   
   /*System.out.println('a' + 'b');  //195
   System.out.println('a' + 1);    //98
   System.out.println('a' + 1.2);  //98.2
   */

  
   /*String a="ashok"; 
   int b=10 , c=20 , d=30 ; 
   a=b+c+d ; //int cannot converted into string 
   a=a+b+c ; 
   b=a+c+d ;  //string cannot converted into int
   */
   
 
  /*System.out.println(10 < 10.5);
  System.out.println('a' > 100.5);
  System.out.println('b'  >  'a');
  System.out.println(true != false);  //bad operand types for operator '>'
  System.out.println(10 == 20) ; 
  System.out.println('a' == 'b' );
  System.out.println('a' == 97.0 );  //true
  System.out.println(false == false);
  */


  /*Thread t1=new Thread( ) ;
  Thread t2=new Thread( );
  Thread t3=t2 ;
  System.out.println(t1==t2);
  System.out.println(t1==t3);
  */


  /*
  System.out.println(true&false);  //false
  System.out.println(true|false);  //true
  System.out.println(true^false);  //true
  System.out.println(4&5);  //4
  System.out.println(4|5);  //5
  System.out.println(4^5);  //1
  */


  /*
  System.out.println(~true); //bad operand type boolean for unary operand ~
  System.out.println(~4+" "+ ~100); //-5 -101
  System.out.println(!false);
  System.out.println(!4); //bad operand type int for operator !
  */

 
  /*
  int x=10 , y=15 ;
  if(++x < 10  |  ++y > 15) {    //instead of || using  &,&&, | operators
    x++;
   }
   else 
	y++;
   System.out.println(x+"----"+y);*/

  /*
  int x=259;   //3
  byte b=(byte)x;
   System.out.println(b);  
   */

  /*
  int x=150;
  short s=(short)x;   //150
  byte b=(byte)x;     //-106
   System.out.println(s);
   System.out.println(b);
  */

  /*
  double d=130.456 ;
  int x=(int)d ;
  System.out.println(x);  //130
  byte b=(byte)d ;
  System.out.println(b);   //-126
  

  int x=(10>20)?30:((40>50)?60:70);
  System.out.println(x);
  */

 

  System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
  }
 
   public static int m1(int i)	
   {
     System.out.println(i);
     return i;
   }


} 




