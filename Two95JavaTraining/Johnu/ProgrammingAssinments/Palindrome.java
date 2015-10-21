package ProgrammingAssinments;
public class Palindrome 
{
	public static void pali()
	{
		String input="God damn mad dog";
		String input_only_alphabets=input.replaceAll("\\W","");
		input=input_only_alphabets;
		int length = input.length();
		int i,j;
		int pali_detector=0;
		for(i=length-1,j=0;i>=(length-1)/2;i--,j++)
		{
			System.out.println("i="+input.charAt(i));
			System.out.println("j="+input.charAt(j));
			if(Character.toLowerCase(input.charAt(i))!=Character.toLowerCase(input.charAt(j)))
			{
				pali_detector=1;
				System.out.println("pali_detector="+pali_detector);
				break;
			}
		}
		if(pali_detector==1)
		{
			System.out.println(input+" is not a palindrome.");
		}
		else
		{
			System.out.println(input+" is a palindrome.");
		}
			
	}
	public static void main(String[] args)
	{
		pali();
	}
}
