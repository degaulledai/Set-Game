<<<<<<< HEAD
/**
 *  Represents a generic deck of cards.
 */

/*

Tips:

- Use an cardArray<Card> to hold the cards.
- Add and remove cards at the end of the list.
- Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
or write your own methods.  If you write your own, use selection sort
to sort and a similar algorithm to shuffle.  Use Math.random().
- In the toString method, separate strings for individual cards with "\n".

 */

import java.util.*;

public class Deck
{
    private ArrayList <Card> cardArray;
    public Deck (int capacity) {
        cardArray = new ArrayList <Card> (capacity);

    }

    public void add (Card card) {
        cardArray.add(card);
    }

    public void remove (Card card) {
        cardArray.remove(card);
    }

    public int getNumCards() {
        return cardArray.size();
    }

    public boolean isEmpty() {
        return cardArray.isEmpty();
    }

    public void shuffle () {
        Collections.shuffle (cardArray);
    }

    public void sort () {
        Collections.sort (cardArray);
    }

    public Card takeTop() {
        return cardArray.get(0);
    }

    public String toString () {
        String str="";
        for (int i=0; i<cardArray.size(); i++) {

            str+= cardArray.get(i) + "\n";
        }
        return str;
    }
}
=======
/**
 *  Represents a generic deck of cards.
 */

/*

Tips:

- Use an cardArray<Card> to hold the cards.
- Add and remove cards at the end of the list.
- Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
or write your own methods.  If you write your own, use selection sort
to sort and a similar algorithm to shuffle.  Use Math.random().
- In the toString method, separate strings for individual cards with "\n".

 */

import java.util.*;

public class Deck
{
    private ArrayList <Card> cardArray;
    public Deck () {
        cardArray = new ArrayList <Card> ();

    }

    public void add (Card card) {
        cardArray.add(card);
    }

    public void remove (Card card) {
        cardArray.remove(card);
    }

    public int getNumCards() {
        return cardArray.size();
    }

    public boolean isEmpty() {
        return cardArray.isEmpty();
    }

    public void shuffle () {
        Collections.shuffle (cardArray);
    }

    public void sort () {
        Collections.sort (cardArray);
    }

    public Card takeTop() {
        return cardArray.get(0);
    }

    public String toString () {
        String str="";
        for (int i=0; i<cardArray.size(); i++) {

            str+= cardArray.get(i) + "\n";
        }
        return str;
    }
}
>>>>>>> aae69ed36082249d6172109e00cf19d493045ea1
