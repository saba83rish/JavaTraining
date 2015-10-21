package ProgrammingAssinments;
import java.util.*;
public class StringToList 
{
	public static void main(String[] args) 
	{
		String[] games = {"cricket","soccer","rugby","golf","hockey"};
		
		List list = new ArrayList();

		for (int i=0;i<games.length;i++)
		{
			list.add(games[i]);
		}
		
		for (int i=0;i<list.size();i++)
		{
			String s1 = (String) list.get(i);
			System.out.println(s1);
		}
	}
}