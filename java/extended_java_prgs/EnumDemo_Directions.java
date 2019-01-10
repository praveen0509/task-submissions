/*
 * 21. Consider a variable Directions of enum type, 
   which is a collection of four constants EAST, WEST, NORTH and SOUTH.
   Create a class EnumDemo and make use of enum variable. 
   (example if you get the enum value is EAST. you should display "you are at EAST direction")
 */





package extended_java_prgs;

public class EnumDemo_Directions {
	
	enum  Directions {
		EAST, WEST, NORTH, SOUTH;		
	}
	
	public static void main(String args[]) {
		
		Directions dir=Directions.WEST;
		if(dir==Directions.NORTH) {
			System.out.println("You are at NORTH Directions");
		}
		
		else if(dir==Directions.WEST) {
			System.out.println("You are at WEST Directions");
		}
		
		else if(dir==Directions.EAST) {
			System.out.println("You are at EAST Directions");
		}
		
		else if(dir==Directions.SOUTH) {
			System.out.println("You are at SOUTH Directions");
		}
		
		
		
	}

}
