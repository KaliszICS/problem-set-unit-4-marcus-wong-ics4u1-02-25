import java.util.ArrayList;
import java.util.Random;

/**
 * The Deck Class contains two constructors (array of Card and unshuffled deck)
 * Methods that return the number of card, drawing cards and shuffle the cards randomly
 * @author Marcus Wong
 * @verison 1.0.0
 */

public class Deck {

    private ArrayList<Card> deck;
    public int length;
    
    /**
     * Construct in an array of cards and sets it as the deck
     * @param cards initial of the deck
     */
    public Deck(Card[] cards) {
        this.deck = new ArrayList<>();
        for (int i = 0; i < cards.length; i++) {
            this.deck.add(cards[i]);
        }
    }

    /**
     * Constructs a deck with 52 cards with ordered by suit (Diamond, Clubs, Hearts and Spades) and Ace to King
     */
    public Deck() {
        String[] cardNames = {"Ace", "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "Jack" , "Queen" , "King"};
        String[] suitNames = {"Diamonds" , "Clubs" , "Hearts" , "Spades"};
        int[] valueNames = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i < suitNames.length; i++) {
            for (int j = 0; j < cardNames.length; j++) {
                Card card = new Card(cardNames[j], suitNames[i], valueNames[i]);
                deck.add(card);
            }
        }
    }

    /**
     * Return current number of cards
     * @return size of the deck
     */
    public int size() {
        return this.deck.size();
    }

    /**
     * Draws the top card
     * @return null when the deck is empty or the drawn card 
     */
    public Card draw() {
        if (size() == 0) {
            return null;
        }
        else {
            return deck.remove(deck.size() - 1);

        }
         
    }
    /**
     * Shuffle the deck googled and use fisher-yates method which use swapping to do shuffle
     */
    public void shuffle() {
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = this.deck.get(i);
            this.deck.set(i, this.deck.get(j));
            this.deck.set(j,temp);
        }        
       
            
    }

    /**
     * Add a card to the bottom of the deck after
     * Can manually return the card back to the bottom (e.g. return a drawn card)
     * @param card that's the card that will add to the bottom
     */
    public void addCard(Card card) {
        deck.add(card);
    }

    /**
     * Reshuffle the deck when there are still cards in it
     */
    public void reshuffle() {
        if (deck.size() > 0) {
            shuffle();
            }
        
    }

    
}