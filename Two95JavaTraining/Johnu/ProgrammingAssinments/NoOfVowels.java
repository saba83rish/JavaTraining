package ProgrammingAssinments;

public class NoOfVowels 
{
	public static void noOfVowels()
	{
		int noofvowels=0;
		String input="My name";
		int length = input.length();
		for(int i=0;i<length;i++)
		{
			switch(Character.toLowerCase(input.charAt(i)))
			{
				case 'a':noofvowels=noofvowels+1;
				break;
				case 'e':noofvowels=noofvowels+1;
				break;
				case 'i':noofvowels=noofvowels+1;
				break;
				case 'o':noofvowels=noofvowels+1;
				break;
				case 'u':noofvowels=noofvowels+1;
			}
		}
		System.out.println("Number of vowels = "+noofvowels);
	}
	public static void main(String[] args)
	{
		noOfVowels();
	}
}