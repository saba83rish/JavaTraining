


	
	package com.training.springclasses.cards;

	import java.util.ArrayList;

	import java.util.Collections;
	import java.util.List;



	public class Card1 
	{

		private Rank rank;
		private Suit suit;
		static List<Card1> deck;
		
		public Card1(Suit suit,Rank rank)
		{
			this.setRank(rank);
			this.setSuit(suit);
		}
		
		

		public enum Suit
		{
			Clubs(1), Diamond(2), Heart(3), Spade(4);
			
			private int suitValue;

			private Suit(int suitValue)
			{
				this.suitValue=suitValue;
			}
			
		}
		public enum Rank
		{
			Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);
			
			private int rankValue;

			private Rank(int rankValue)
			{
				this.rankValue=rankValue;
			}
		}
		
		
		
		public static List<Card1> cardSet()
		{
			System.out.println("******ORIGINAL CARDSET************");
			Suit[] suits = Suit.values();
			Rank[] ranks =Rank.values();
			
			deck = new ArrayList<Card1>();
			
			for (int i=0;i< suits.length;i++)
			{
				for (int j=0;j<ranks.length;j++)
				{
					deck.add(new Card1(suits[i],ranks[j]));
				}
				
			}
			
			return deck;
			
		}
		
		public static void showCards()
		{
			cardSet();
			int i=1;
			for(Card1 c:deck) {
	        System.out.println("Card "+(i++)+" : "+c.getRank()+"-"+c.getSuit());
			}	
		}
		
		public static List<Card1> shuffleCards()
		{
			
			System.out.println("////////////SHUFFLED CARDS///////////////////");
			List<Card1> tempDeck = deck;
			Collections.shuffle(tempDeck);
			int i=1;
			for(Card1 tc:tempDeck) {
	        System.out.println("Card "+(i++)+" : "+tc.getRank()+"-"+tc.getSuit());
			}
			return tempDeck;	
		}

		public Suit getSuit() {
			return suit;
		}

		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		public Rank getRank() {
			return rank;
		}

		public void setRank(Rank rank) {
			this.rank = rank;
		}
		
	}



