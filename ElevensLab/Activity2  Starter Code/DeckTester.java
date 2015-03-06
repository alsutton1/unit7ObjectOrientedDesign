/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jacks", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] values = {11,12,13};
		
		Deck d = new Deck(ranks, suits, values);
		Card delt = d.deal();
		System.out.println(delt.toString());
		System.out.println(d.toString());
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		delt = d.deal();
		System.out.println(d.toString());
	}
	
	
	/** questions
	 * 1. the relationship between a Deck and Card is Card is part of Deck, and Deck would be
	 * usless without Card, so Deck is soley reliable on the existance of Card.
	 * 
	 * 2. The deck contains 6 cards
	 * 
	 * 3. String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}
	 * String[] suits = {"spades","hearts","diamonds","clubs"}
	 * int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,10,11}
	 * 
	 * 4. Yes, it matters because there is specific order that the Card object accepts them in
	 */
}
