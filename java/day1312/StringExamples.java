
public class StringExamples
{

	public static void main(String args[])
	{
		String s1="praveen";
		String s2="praveen";
		String s3=new String("praveen");
		String s4=new String("praveen");
		
		System.out.println((s1==s2)+" " +(s1==s3) +" "+(s3==s4)+" "+(s3.equals(s4))+" "+(s1.equals(s2)+" "+(s1.equals(s3))));  
		                   //true            false                   false 
                                   //value-value    value-location       location-location
		
	}
	
	
}
