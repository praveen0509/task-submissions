package extended_java_prgs;

public class AutoBoxing_UnboxingExample {
	public static void main(String args[]) {
		
		Integer i=new Integer(10);
		Character ch=new Character('p');
		
		//autoBoxing
		int a=i;
		char c=ch;
		System.out.println("autoboxing:"+a+c);
		
		
		//Unboxing
		Integer unInt=a;
		Character unChar=c;
		System.out.println("unboxing:"+unInt+unChar);		
	}
}



























