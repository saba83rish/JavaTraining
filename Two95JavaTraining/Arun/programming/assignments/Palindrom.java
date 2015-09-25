package programming.assignments;

public class Palindrom {
	public static void palindrome(){
		String s = "Racecar";
		String sub = s.toLowerCase();
		int startPos = 0;
		int endPos = s.length()-1;
		
		boolean isS = true;
		
		while(startPos <endPos){
			String startLetter = sub.substring(startPos, startPos+1);
			String endLetter = sub.substring(endPos, endPos+1);
			
			if(startLetter.equals(endLetter)==false){
				isS=false;
				break;
			}
			startPos++;
			endPos--;
		
			}
		if(isS==true){
			System.out.println( s + " is palindrome");
		}
		else{
			System.out.println(s+ " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		
		palindrome();
		// TODO Auto-generated method stub

	}

}
