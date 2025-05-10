/**
* The Card class created using three parameters: name, suit and value.  
* It also include getter methods to get the three parameters and 
* Methods that returns the full name of the card and checks is there same cards.
* @author Marcus Wong
* @version 1.0.0
*/

public class Card {
    //Instance variables
    private String name;
    private String suit;
    private int value;
    
    //Constructor
    /**
     * Name of the card
     * @param name
     * Suit of the card
     * @param suit
     * Value of the card
     * @param value
     */
    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    
    //Getters
    /**
     * Get the name of the card
     * @return name of the card
     */
    public String getName() {
        return this.name;
    }
     /**
     * Get the suit of the card
     * @return suit of the card
     */
    public String getSuit() {
        return this.suit;
    }
    /**
     * Get the value of the card
     * @return value of the card
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Returns a string representation of the card
     * @return "Name of Suit"
     */
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }

    /**
     * Check if this card is equal to another card (equal when name, suit and value are the same)
     * @param obj 
     * @return true if one card has the same name and suit to another card, false if don't
     */
    @Override
    public boolean equals(Object obj) {
    Card card = (Card)obj;
    if (card.getName().equals(getName()) && card.getSuit().equals(getSuit()) && card.getValue() == getValue()) {
        return true;
    }
    return false;
    }
    
}