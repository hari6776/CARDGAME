import java.util.Scanner;

/**
 * Author: Unknown
 * Modifier: Your Name
 * Student ID: YourStudentNumber
 * Date Modified: 2025-05-22
 */
public class CardTrick {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        Card[] magicHand = new Card[7];

        // Generate 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1); // 1–13
            c.setSuit(suits[(int)(Math.random() * 4)]);
            magicHand[i] = c;

            // Print cards to confirm what's in the hand
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1–13): ");
        int userValue = input.nextInt();

        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitIndex = input.nextInt();
        String userSuit = suits[suitIndex];

        // Search for card
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You picked the right card!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
