package OOPsConcepts;

public class StaticandNonStaticConcept {
//global variables:the scope of global vars will be available across all the functions with some conditions.	
	String name="Manohar";
	static int Age=26;
	public static void main(String args[])
	{
		//how to call static methods and variables.?
		//1.Direct Calling by using methodname.
		  ComposeEmail();
		  System.out.println(Age);
		//2.By using Class name
		 StaticandNonStaticConcept.ComposeEmail();
		 System.out.println(StaticandNonStaticConcept.Age);
	  //How to call non static methods and variables:
		StaticandNonStaticConcept obj=new StaticandNonStaticConcept();
		obj.WriteEmail();
		System.out.println(obj.name);
	//Can I access static methods by using object reference.? Yes
		obj.ComposeEmail();
		
		
		
	}
	
	public void WriteEmail() {//non static method
		System.out.println("WriteEmail Method");
	}
	
	public static void ComposeEmail() {//Static method
		System.out.println("ComposeEmail Method");
	}
	
}
