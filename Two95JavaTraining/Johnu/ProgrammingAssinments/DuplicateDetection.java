package ProgrammingAssinments;
public class DuplicateDetection 
{
	public static void detector()
	{
	String input="Johnu Celestine";
	int length = input.length();
	int noOfDuplicates=0;
	for(int i=0;i<length;i++)
	{
		for(int j=i+1;j<length;j++)
		{
			if(Character.toLowerCase(input.charAt(i))==Character.toLowerCase(input.charAt(j)) && input.charAt(i)!='\0')
			{
				System.out.println("Character "+input.charAt(i)+" at index "+i+" is repeated at index "+j);
				String input_new = input.substring(0,j)+'\0'+input.substring(j+1,length);
				input = input_new;
				noOfDuplicates=noOfDuplicates+1;
			}
		}
	}
	if(noOfDuplicates==0)
	{
		System.out.println("No duplicates found");
	}
}

public static void main(String[] args)
	{
		detector();
	}
}