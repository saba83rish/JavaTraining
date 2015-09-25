package programming.assignments;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelCount1 {
	public static void Vowel() throws IOException{
	
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the string please");
		String in = input.readLine();
		System.out.println("Vowels in this string are : ");
		String inp = in.toLowerCase();
		
		int count =0;
		for( int i =0; i<inp.length();i++){
			char vowel = inp.charAt(i);
			if(vowel =='a' ||vowel =='e' ||vowel =='i' ||vowel =='o' ||vowel =='u'){
				count++;
				System.out.println(vowel);
			}
			
			
		}
		System.out.println("No.of vowels are " + count);
		
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Vowel();
	}

}
