package Two95.DeckOfCards;

public class SetParamsOfCards {

	int value, k = 0;
	static int l = 0;
	String suit;
	String[] suite = { "hearts", "diamonds", "clubs", "spades" };
	static SetParamsOfCards[] card = new SetParamsOfCards[52];
	static SetParamsOfCards[][] person = new SetParamsOfCards[4][13];

	public void generateCards() {

		for (int j = 0; j < 4; j++) {
			String currentSuit = suite[j];

			for (int i = 2; i <= 14; i++, k++) {
				card[k] = new SetParamsOfCards();
				card[k].value = i;
				card[k].suit = currentSuit;
			}
		}
		shuffle(card);
		distribute(card);
	}

	static void shuffle(SetParamsOfCards[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int random = i + (int) (Math.random() * (n - i));
			SetParamsOfCards randomElement = array[random];
			array[random] = array[i];
			array[i] = randomElement;
		}
	}

	static void distribute(SetParamsOfCards[] array) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++, l++) {
				person[i][j] = array[l];
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++, l++) {
				System.out.println("Card distributed to person " + (i + 1) + " is: " + person[i][j].value + " of "
						+ person[i][j].suit);
			}
			System.out.println("------------------------------------------------------------------------");
		}
	}
}