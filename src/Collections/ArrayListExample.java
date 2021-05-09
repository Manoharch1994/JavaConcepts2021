package Collections;

import java.util.ArrayList;

public class ArrayListExample {
//Can Accept duplicate Values
	//ArrayList,LinkedList,Vector--Implementing List Interface.
	//Array have Fixed Size where as ArrayList can grow Dynamically.
	//You can Access and Insert any value in any index.
	
	
	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Selenium");
		ar.add("Jenkins");
		ar.add("Jenkins");
		ar.add("Maven");
		System.out.println(ar);
		//Adding the value to ArrayList using index.
		ar.add(0, "CoreJava");
		System.out.println(ar);
		//Fetching the value from ArrayList using Get Method.
		System.out.println(ar.get(3));
		//Testing:Verify the Text is in ArrayList or not.?
		System.out.println(ar.contains("Testing"));
		//To know the index of String in ArrayList
		System.out.println(ar.indexOf("Jenkins"));
		//To Verify weather the ArrayList is Empty.?If it will empty it will return true,if not return false.
		System.out.println(ar.isEmpty());
		//To know the ArrayList Size
		System.out.println(ar.size());
		
	}

}
