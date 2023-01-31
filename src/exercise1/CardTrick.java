package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 *@author Pablo Carmona 31/1/2023
 */
public class CardTrick extends Card{
    

    public static void main(String[] args) {
        Random random = new Random();
        Scanner askUser = new Scanner(System.in);
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
        }

        System.out.println("Pick a card");
        System.out.println("Value of Card is between 1-13. 11: Jack / 12: Queen / 13: King");
        System.out.println("Pick Value: ");
        int userValue = askUser.nextInt();
        System.out.println("Write the Suit you want: ");
        String userSuit  = askUser.nextLine();

        for (int i = 0; i < hand.length; i++) {
            if(hand[i].getValue()== userValue && hand[i].getSuit().equals(userSuit)){
                printInfo();
            }

        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Pablo Carmona 31/1/2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Pablo, nice to meet you");
        System.out.println();
        
        System.out.println("What I want in life is to be rich and live a good life around the world");

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Listening Music");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing soccer");
	System.out.println("-- Hanging with Friends");
        
    
    }

}
