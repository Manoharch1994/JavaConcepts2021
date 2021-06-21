package excpetions;

public class DemoFinally {
	public static void main(String[] args) {
		try {
			
			int[] myNumbers= {1,2,3};
			System.out.println(myNumbers[4]);
		} catch (Exception e) {
			System.out.println("Something Went Wrong...!");
		}
		finally {
			System.out.println("I am 'Finally Block'.....!");
		}
	
		
	}

}
