package ProgrammingAssinments;

public class ReversreString
{
	public static void reverse()
	{
	String input="12345johnu";
	int length = input.length();
	int i,j;
	char[] input_new = new char[length];
	for(i=length-1,j=0;i>=0;i--,j++)
	{
		input_new[j]=input.charAt(i);
	}
	System.out.println(input_new);
}
	
	public static void main(String[] args)
	{
		reverse();
	}
}
