package OOPsConcepts;

//When same method is present in parent class as well as in child class with same name and same no.of arguments,
//is called Method Overriding.
//preference given to child class method by the compiler.

public class Car extends Vehicle {
	public  void Start() {
		System.out.println("Parent Car Start Method");
	}
	public void Stop() {
		System.out.println("Parent Car  Stop Method");
	}
	public void Refuel() {
		System.out.println("Parent Car  Refuel Method");
	}
}
