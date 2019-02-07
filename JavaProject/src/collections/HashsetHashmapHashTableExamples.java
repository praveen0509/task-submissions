package collections;
import java.util.*;

public class HashsetHashmapHashTableExamples {
	public static void main(String args[]) {
						
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1,"praveen");
		hm.put(2,"rajesh");
		hm.put(3,"suresh");
		hm.put(4,"pradeep");
        
		/*
		Iterator<Map.Entry<Integer, String>> i=hm.entrySet().iterator();		
		while(i.hasNext()) {
			Map.Entry<Integer, String> it=i.next();
			System.out.println(it.getKey()+" "+it.getValue());
		}
		*/
		
		
		for(int key:hm.keySet()) 
			System.out.println("Key:"+ key+" Value:"+hm.get(key));
		
		
		
		
	}
}