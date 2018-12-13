
public class IncrDecr 
{

	public static void main(String args[])
	{
		int a=2,b=3;
		System.out.println(++a + a++ + a++ + a--);   //from left to right a=2 ---> 15 -->(++a + a++ + a++ + a--)
		System.out.println("hello"+ ++a + ++a);      //after string , it is concatinating, not calculating
		System.out.println(++b + b-- + "hello");     //before string, SOP calculating not concatinating 
		System.out.println("hello"+ ++b + ++b);
		b=2;
		int res=++b + b++ +b-- +--b;                 //assigns values from left to right
		System.out.println("res=++b + b++ +b-- +--b::"+res);
		res=2+3*4/5*6+2;
		System.out.println("res=2+3*4/5*6+2::"+res);   //BODMAS 
		                                               //if same precedence came, then calculate from left to right
	}
	
}
