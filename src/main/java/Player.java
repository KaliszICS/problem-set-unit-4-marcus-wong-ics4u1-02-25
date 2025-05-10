import java.util.Arrays;

/**
 * The Player class represents the player with the name, age and their hand of cards
 * It contains two constructors
 * Methods that will output the info of the player and what action can they do for the next turn
 * i gave up
 * @author Marcus Wong
 * @version 1.0.0
 */

public class Player {
    
    private static final Card[][] Card = null;
    private String playerName;
    private int playerAge;
    private Card[] hand;

    public Player(String playerName, int playerAge, Card[] hand) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.hand = hand;
    }

    public String getPlayerName() {
        return this.playerName;
    }
    public int getPlayerAge() {
        return this.playerAge;
    }
    public Card[] getHand() {
        return this.hand;
    }

    public int size() {
        return hand.length;
    }

    public Card[] draw(Deck deck) {
        return Card[i];
    }

    public boolean discardCard(Card card, DiscardPile discardPile) {
        return true;

    }

    public boolean returnCard(Card card, Deck deck) {
        for (int i = 0; i < deck.length; i++) {
            

        }
        return true;
    }

    public String toString() {

    if (Card == null) {
        return this.playerName + ", " + this.playerAge + ".";
    }
    
        return this.playerName + ", " + this.playerAge + ", " + Card + ".";
    }
}