package hash;

import java.util.HashMap;
import java.util.Iterator;

public class HahMapExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>(); 
		// Adding values to HashMap as ("keys", "values")

		 hashmap.put(1,"priya");
		 hashmap.put(2,"meera");
		 hashmap.put(3,"anika");
		 hashmap.put(4,"gauri");
		 hashmap.put(6,"bhavya");
		//displays the set of hashMap 
		 System.out.println("Names are:");
		 //creates an object 
			Iterator valueIterator=hashmap.values().iterator();
			while(valueIterator.hasNext())
			{
				System.out.println(valueIterator.next());	
			
			}
			//it will place the values in 
		 hashmap.put(5,"priyanka");
		 System.out.println("\nNames are:");
			Iterator valueIterator1=hashmap.values().iterator();
			while(valueIterator1.hasNext())
			{
				System.out.println(valueIterator1.next());	
			
			}
			
		
		 String val=hashmap.get(4);//tries to get the value 4
		 System.out.println("\nThe value mapped to key 4 is:"+val);
	
		 String val2=hashmap.get(7);//tries to get the value 7
		 System.out.println("\nThe value mapped to key 7 is:"+val2);
		 
		 
		 System.out.println("\nHashMap:");//prints hashmap
		 System.out.println(hashmap);
		 System.out.println("\nclear HashMap:");
		 hashmap.clear();//clears the hash map
		 System.out.println("After clearing hashmap:");
		 System.out.println(hashmap);
	
	
	
	}

}
