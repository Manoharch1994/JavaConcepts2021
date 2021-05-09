package Collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args)
	{
		//HashTable stores the Values on the Basis of Key and Value Pair.
		//HashTable is similar to HashMap.
		//HashTable is Synchronized and It is Thread Safe.
		//One Thread can access Only one HashTable Object at a Time.
		//So, The Performance of the Application will be Slow.
		//Key will be stored in the Form of Object --> HashCode --> Value.
		//Put method is used to add Data into HashTable.
		//Null Keys and Null Values are not Allowed in HashTable.
		Hashtable<String,Integer> marks = new Hashtable<String,Integer>();
		marks.put("Manohar", 200);
		marks.put("Naveen", 400);
		marks.put("Mukesh", 600);
		marks.put("Raghav", 800);
		marks.put(null, 1200);
		System.out.println(marks);
		System.out.println(marks.get("Test"));
		
		
	
		
		
	}

}
