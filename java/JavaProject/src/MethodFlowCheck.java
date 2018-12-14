
public class MethodFlowCheck
{
   public static void main(String args[])
   {
	   int a=1;
	   int res=m(a)*m(a++)+m(a++)*m(++a);
	   System.out.println(res+" "+3/4f); 
   }
	
   public static int m(int a)
   {                              
	   return ++a;	   
   }
		
}
