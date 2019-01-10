/*
 * Do the following exercise
	> Create an interface 'Shape' with PI value as 3.14159 and a method 'volume(float a)'
	> Implement this interface individually in 'Sphere' and 'Circle' classes to find their volumes.
	Hint:- Volume of sphere = 4*PI*r*r*r/3
	       Volume of Circle = PI*r*r
 */


package Day6;
import java.util.Scanner;

public class Interface_Volume_Shape_Finding {
	public static void main(String args[]) {
		float radius;
		Sphere sphereObj=new Sphere();
		Circle circleObj=new Circle();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Radius");
		radius= ob.nextFloat();		
		System.out.println("Sphere volume:-"+sphereObj.volume(radius));
		System.out.println("Circle volume:-"+circleObj.volume(radius));
	}
	
}

//Interface
interface Shape {
	public static final float PI=3.14159f;
	float volume(float a);	
}

//Shpere implements Interface
class Sphere implements Shape {
	public float volume(float r) {
		return (4*PI*r*r*r)/3;
	}
}

//Circle implements Interface
class Circle implements Shape {
	public float volume(float r) {
		return PI*r*r;
		
	}
}

/*
 output:
	Enter Radius
	7
	Sphere volume:-1436.7539
	Circle volume:-153.93791
*/







