package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Akshaj Rana
 * @author Akshaj Rana Jan 27, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+(Math.random()*13)));
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            System.out.println("get value "+card.getValue()+" get suit "+card.getSuit());
             hand[i]=card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Choose a number from 2-10 for numbers, 1 for Ace, 11 for jack, 12 for queen, 13 for king: \n ");
        int value= in.nextInt();
        
        System.out.println("Choose a suit. Type Hearts, Diamonds, Spades, or Clubs.  \n ");
        String suit= in.next();
        
        
        
        for(int j=0; j<hand.length; j++)
        {
            if(hand[j].getValue()==value && hand[j].getSuit().equals(suit))
            {
                printInfo();
            }
            else
            {
                continue;
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
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        
        System.out.println("My name is Akshaj Rana, but you can call me Akshaj");
        
        System.out.println("My career ambitions:");
        System.out.println("-- Being a Billionaire");
		
        System.out.println("My hobbies:");
        System.out.println("-- Playing Cricket");
        System.out.println("-- Playing Chess");
        System.out.println("-- Watching Movies");

      
        
    
    }

}
