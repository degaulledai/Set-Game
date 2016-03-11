/**
 *  Represents a generic deck of cards.
 */

/*

Tips:

- Use an ArrayList<Card> to hold the cards.
- Add and remove cards at the end of the list.
- Use Collections.shuffle and Collections.sort to shuffle and sort the deck,
or write your own methods.  If you write your own, use selection sort
to sort and a similar algorithm to shuffle.  Use Math.random().
- In the toString method, separate strings for individual cards with "\n".

 */

import java.util.*;

public class Deck
{
    public Deck (int capacity) {
        ArrayList <Card> arrayList = new ArrayList <Card> (capacity);

    }

    public void add (Card card) {
        arrayList.add();
    }

    public void remove (Card card) {
        arrayList.remove();
    }

    public int getNumCards() {
        return arrayList.size();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public void shuffle () {
        Collections.shuffle (arrayList);
    }

    public void sort () {
        Collections.sort (arrayList);
    }

    public Card takeTop() {
        return arrayList.get(0);
    }

    public String toString () {
for (int i=0; i<arrayList.size(); i++) {

    return arrayList.get(i) + "\n";
    }
}
}
