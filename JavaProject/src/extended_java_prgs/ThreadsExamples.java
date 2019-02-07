package extended_java_prgs;

import java.io.InterruptedIOException;

/*
public class ThreadsExamples extends Thread {
		
	public void run() {
		System.out.println("Run method Called");
	}
	
	public void start() {
		System.out.println("Start method Called");
	}
	
	public static void main(String args[]) {
		Thread t=new ThreadsExamples();
		t.run();
		t.start();
		System.out.println(t.getName());   //Thread 0
		System.out.println(t.getPriority());  //default Priority 5
	}
}

*/


public class ThreadsExamples extends Thread {
	
	public static void main(String args[])  {
		
		Thread t1=new ThreadsExamples("praveen");
		
		System.out.println("Exiting thread");
		
	}	
	
	String name;
	ThreadsExamples(String name) {
		this.name=name;
		Thread t=new Thread(this, name);
		System.out.println("New Thread:"+t);
		t.start();
	}
	
	public void run() {
		
	  try{
		for(int i=0;i<3; i++)
			System.out.println("value:"+i);
		Thread.sleep(10);
		}
	  catch (InterruptedException e) {
			System.out.println(e);
		}
		
		
		
	}
	
}




















