package oops;

public class GarbageCollectorExample {
	
	public static void main(String args[]) {
		
			GarbageCollectorExample g1=new GarbageCollectorExample();
			GarbageCollectorExample g2=new GarbageCollectorExample();
			
			// can call Runtime.getRuntime().gc();
			System.gc();
			g1=null;
			g2=null;	
			
			//g1.close();
			//g2.close();
	}
	
	//finalize method is called before colleting objects
	public void finalize() throws Throwable {
		System.out.println("Garbage Collector called");		
	}

}
