package hash;
//Package is a grouping of related types providing access protection and name

import java.util.HashMap;
import java.util.Map;

public class Generic

{
//Java's Map interface (java.util.Map) can be generified.
//In other words, you can set the specific type of both the keys and 
//values in a generic Map instance. 
//This Map can now only accept String instances as keys, and String 
//instances as values.
	static Map<String, String> hashmap = new HashMap<>();
	 
	private static void checkIfValueExist(String value) {
		// Let's checkout if Value exist
		String result = hashmap.containsValue(value) ? ("Value (" + value + ") exist")
				: ("Value (" + value + ") doesn't exist");
		log(result);
	}
 
	private static void checkIfKeyExist(String key) {
		// Let's checkout if Key exist
		String result = hashmap.containsKey(key) ? (hashmap.get(key))
				: ("Key (" + key + ") doesn't exist");
		log(result);
		//print result
	}
 
	public static void main(String[] args) {
		 //static is used for memory management
		//void is used to define the return type of the method
		//String[] args is actually an array of java.lang.String type and it's name is args here
//HashMap is a Map based collection class that is used for storing Key & 
//value pairs, it is denoted as HashMap<Key, Value> or HashMap<K, V>.			
		hashmap.put("Google", "Mountain View, CA");
		hashmap.put("Yahoo", "Santa Clara, CA");
		hashmap.put("Microsoft", "Redmond, WA");
 //checks whether the element in list or not
		
		checkIfKeyExist("Google");
		checkIfKeyExist("Facebook");
		checkIfKeyExist("Twitter");
		checkIfKeyExist("Yahoo");
 
		System.out.println("\n");
		checkIfValueExist("Mountain View, CA");
		checkIfValueExist("San Jose, CA");
	}
 
	private static void log(Object object) 
	//prints the object
	{
		System.out.println(object);
		 //system is final class
	      //out is a static member of system class and type printStream
	      //println is method of printStream class.ln means nextline
	   
	}
}

