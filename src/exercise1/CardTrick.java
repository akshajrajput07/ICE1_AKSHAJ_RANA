package exercise1;
import java.util.Scanner;

/*
 * @author AKSHAJ RANA
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
             hand[i]=card;
           
        }
        System.out.println("Choose a number from 2-10 for numbers, 1 for Ace, 11 for jack, 12 for queen, 13 for king: \n ");
        int value= in.nextInt();
        
        System.out.println("Choose a suit. Type Hearts, Diamonds, Spades, or Clubs  \n ");
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
        
    }
	
    //I AM DONE !
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Akshaj Rana , but you can call me Akshaj.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Being a Billionaire.");
	

        System.out.println("My hobbies:");
        System.out.println("-- Playing Cricket. ");
        System.out.println("-- Playing Chess.");
        System.out.println("-- Watching Movies.");
        
    
    }

}
