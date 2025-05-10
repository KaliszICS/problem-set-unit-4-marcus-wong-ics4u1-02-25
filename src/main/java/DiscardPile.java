import java.util.ArrayList;

/**
 * The DiscardPile contains two constructors with methods like getter, checking the size, adding or remvoing cards
 * not finished tho i gave up
 * @author Marcus Wong
 * @version 1.0.0
 */

public class DiscardPile {
    
    private ArrayList<Card> discardPile;

    public DiscardPile(ArrayList<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public ArrayList<Card> getDiscardPile() {
        return this.discardPile;
    }

    public int size() {
        return discardPile.size();
    }

    public void addCard(Card card) {
        discardPile.add(card);
    }

    public boolean removeCard(Card card) {
        if (discardPile.contains(card)) {
            return discardPile.remove(card);
        }
        else {
            return false;
        }
    }
}