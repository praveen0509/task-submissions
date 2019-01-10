package oops;

public class Overloading_Float_Int_Double_checking {
	
	public static void main(String args[]) {
		
		m(10,20.0);      //Float, Double  why?
		m(10.0,20.0);    //Double, Double
		m(10.00004,20.0);//Double, Double
		m(10,100);  //Int,Int         why not float,int?
		m(10.0000,20);  //Double, Double
		m(10,200);      //Int,Int
	}
	
	
	public static void m(int a,double b) {
		System.out.println("Int, double");
	}
	
	public static void m(int a,char b) {
		System.out.println("Int, char");
	}
	
	public static void m(char a,int b) {
		System.out.println("char,Int");
	}
	public static void m(float a,float b) {
		System.out.println("Float, Float");
	}
	
	public static void m(float a,int b) {
		System.out.println("Float, int");
	}
	public static void m(int a,float b) {
		System.out.println("Int, Float");
	}
	
	public static void m(float a,double b) {
		System.out.println("Float, Double");
	}
	
	public static void m(int a,long b) {
		System.out.println("Int, Long");
	}
	
	public static void m(double a,double b) {
		System.out.println("Double, Double");
	}
	
	public static void m(int a,int b) {
		System.out.println("Int, Int");
	}
	
}


































