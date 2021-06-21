package OOPsConcepts;

public class MethodOverLoading {
	public void methodOne(int a){
        System.out.println(a);
    }
    
	public void methodOne(String a)
    {
       System.out.println(a);
    }	
	public static void main(String[] args) {
		MethodOverLoading MOL = new MethodOverLoading();
		MOL.methodOne(10);
		MOL.methodOne("Hello");

		
		
		
		
	}

}
