package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities=new HashMap<String,String>();
		capitalCities.put("England","London");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
	//Access an Item from HashMap we use get() method.
		System.out.println(capitalCities.get("USA"));
	//To Remove an Item from Hashmap we use remove() method.
		//System.out.println(capitalCities.remove("Norway"));
		System.out.println(capitalCities);
	//To remove all items, use the clear() method:
		//capitalCities.clear();
		System.out.println(capitalCities);
	//To find out how many items there are, use the size method:
		System.out.println(capitalCities.size());
	/*Use the keySet() method if you only want the keys,
	and use the values() method if you only want the values:
		for(String i:capitalCities.keySet()) {
			System.out.println(i);
		}
	
		// Print values
		for (String i : capitalCities.values()) {
		  System.out.println(i);
		}*/
		// Print keys and values
		for (String i : capitalCities.keySet()) {
		  System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
