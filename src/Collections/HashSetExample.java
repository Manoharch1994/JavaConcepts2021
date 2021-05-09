package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

	//HashSet,TreeSet,LinkedHashSet implements Set Interface.
	//Does not Accpet Duplicate Values.
	//There is no guarantee elements stored in sequential order,Random Order.
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("LONDON");
		//hs.add("LONDON");
		hs.add("CANADA");
		
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());	
		//Traversing through all values using Iterator Interface.
		System.out.println("************************************");
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) 
		{
		System.out.println(it.next());
		
			
	}

	}
}
