package InterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String name ="AutomationTesting";
		String reversedString="";
		for(int i=name.length()-1;i>=0;i--) {
			reversedString=reversedString+name.charAt(i);
		}
		System.out.println("The Reversed String is : " +reversedString);

	}

}
