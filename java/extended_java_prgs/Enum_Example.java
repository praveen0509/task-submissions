package extended_java_prgs;

public class Enum_Example {
	public static void main(String args[]) {
		
			Day day=Day.MONDAY;
			
			System.out.println("Day:"+ day.TUESDAY);
			day.demoMethod();
	}	
	
	enum Day {
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;		
		public void demoMethod() {
			System.out.println("From Enum");			
		}
		
	}
}

