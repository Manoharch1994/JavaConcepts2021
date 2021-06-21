package methods;

public class MultiParam {
 
	public static void myMethod(String fname,int age) {
		System.out.println(fname + "is"+age);
	}
	
	public static void main(String[] args) {
		myMethod("Manohar",26);
		myMethod("Raj", 20);
		myMethod("John", 28);
		
	}
	
}
