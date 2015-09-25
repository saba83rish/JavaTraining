package programming.assignments;
import java.util.Scanner;

public class ReverseString {
	
	public static void Reverse(){
		
		String original;
		String reverse = "";
		
		System.out.println("Enter the string : ");
		Scanner input = new Scanner(System.in);
		 original = input.nextLine();
		 
		 int len = original.length();
		 
		 for (int i = len-1; i>-1; i--){
			 reverse = reverse + original.charAt(i); 
			 
		 }
		 
		 System.out.println("Original string is : " + original);
		 System.out.println("Reverse string is : " + reverse);
		
	}

	public static void main(String[] args) {
		
		Reverse();
		// TODO Auto-generated method stub

	}

}
