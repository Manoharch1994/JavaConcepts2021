package OOPsConcepts;

public class MethodOverloding {
	public static void main(String[] args) {
	
		MethodOverloding obj=new MethodOverloding();
		obj.Sum();
		obj.Sum(10);
		obj.Sum(10, 30);
	}
//we can overload main method also by passing diffrent arguments.
	public static void main(int i) {
		System.out.println("Main method Overloaded");
	}
	public static void main(double d) {
		System.out.println("Main method Overloaded");
	}
	
//you can't create a method inside a method.
	
//Duplicate Methods not allowed,i.e.same method name with same no.of arguments are not allowed.
	
//Method OverLoading:When the method name is same with diffrent arguments or input parameters
//with in the same class is called Method OverLoading.
	public void Sum() {//0 Parameter
		System.out.println("Sum Method-zero Input Parameters");
	}
	public void Sum(int i) {//1 Parameter
		System.out.println("Sum Method-One Input Parameters");
		System.out.println(i);
	}
	public void Sum(int i,int j) {//2 Parameter
		System.out.println("Sum Method-Two Input Parameters");
		System.out.println(i+j);
	}

}
