package com.training.springclasses.cards;

import java.util.ArrayList;

import java.util.List;

public class Shuffle1 
{


	static List<Card1> shuffleCards;
	static int j=1;
	static int i=1;
	public static void main(String[] args)
	{

		Card1.showCards();
	
		List<Card1> shuffledCards = Card1.shuffleCards();

		List<Card1> person1 = new ArrayList<Card1>();
		List<Card1> person2 = new ArrayList<Card1>();
		List<Card1> person3 = new ArrayList<Card1>();
		List<Card1> person4 = new ArrayList<Card1>();

		for(int i=0;i<52;i++)
		{
			
			

			if (j == 1) 
			{ 

				person1.add(shuffledCards.get(i)); 
				j++; 
				continue; 

			} else if (j == 2) { 


				person2.add(shuffledCards.get(i)); 
				j++; 
				continue;


			} else if (j == 3) { 

				person3.add(shuffledCards.get(i)); 
				j++; 
				continue; 

			} 
			else if (j == 4)
			{ 

				person4.add(shuffledCards.get(i)); 
				j=1; 
				continue;

			} 

		}
		
		System.out.println("Person1");
		for(Card1 p1:person1)
		{
			
	        System.out.println("Card "+(i++)+" : "+p1.getRank()+"-"+p1.getSuit());
		}
		
		
		System.out.println("Person2");
		i=1;
		for(Card1 p2:person2)
		{
			
	        System.out.println("Card "+(i++)+" : "+p2.getRank()+"-"+p2.getSuit());
		}
		
		
		System.out.println("Person3");
		i=1;
		for(Card1 p3:person3)
		{
			
	        System.out.println("Card "+(i++)+" : "+p3.getRank()+"-"+p3.getSuit());
		}
		
		
		System.out.println("Person4");
		i=1;
		for(Card1 p4:person4)
		{
			
	        System.out.println("Card "+(i++)+" : "+p4.getRank()+"-"+p4.getSuit());
		}
		
	}
}
