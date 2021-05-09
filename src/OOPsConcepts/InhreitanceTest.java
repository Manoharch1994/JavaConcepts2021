package OOPsConcepts;

public class InhreitanceTest {

	public static void main(String[] args) {
		
	//Static Polymorphysm / Compile time Polymorphysm:
	//At the time of compilation java will decided which method i need to call.
		
		Bmw bm=new Bmw();
		bm.Start();
		bm.Refuel();
		bm.TheftSafety();
		bm.Stop();
		bm.Engine();
		System.out.println("****************************");
		Car c= new Car();
		c.Start();
		c.Stop();
		c.Refuel();
		System.out.println("****************************");		
		//Child class object can be referred by parent class reference variable is called,
		//Dynamic Polymorphism or Runtime Polymorphism.
		Car c1=new Bmw();//Top Casting
		c1.Start();
		c1.Start();
		c1.Refuel();
		
		
		
	}

}
