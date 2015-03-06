/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        boolean matched;

        Card card1 = new Card("King", "Hearts", 12);
        Card card2 = new Card("Jack", "Diamonds", 10);
        Card card3 = new Card("King", "Hearts", 12);

        matched = card1.matches(card2);
        if (matched == true)
        {
            System.out.println("The cards match!");
        }
        else
        {
            System.out.println("The cards do not match.");
        }
        
        matched = card1.matches(card3);
        if (matched == true)
        {
            System.out.println("The cards match!");
        }
        else
        {
            System.out.println("The cards do not match.");
        }
    }
}
