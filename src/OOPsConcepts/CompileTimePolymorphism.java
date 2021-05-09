package OOPsConcepts;

public class CompileTimePolymorphism {
	public void myMethod (int a){
		System.out.println("value of a is " + a);
	}
	
	public void myMethod (int a, int b){
		System.out.println("value of a is " + a + " and value of b is " + b);
	}
	
	public void myMethod (String a){
		System.out.println(a);
	}
	public static void main(String[] args) {
	
	CompileTimePolymorphism ctp=new CompileTimePolymorphism();
	ctp.myMethod(10);
	ctp.myMethod("Java");
	ctp.myMethod(10,30);
	}

}
