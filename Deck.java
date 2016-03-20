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
    private ArrayList <Card> cardArray;
    public Deck ( ) 
    { 
        cardArray = new ArrayList <Card>();
    }

    public Deck (int capacity)
    { 
        cardArray = new ArrayList <Card> (capacity);
    }// creates an empty deck of given capacity
    
    public int getNumCards ( )
    { 
        return cardArray.size();
    }

    public boolean isEmpty ( )
    { 
        return cardArray.isEmpty();
    }
    
    public void shuffle ( )
    {
        Collections.shuffle(cardArray);
    }

    public void sort ( )
    {
        Collections.sort(cardArray);
    }
    
    public void add (Card card)
    { 
        cardArray.add(card);
    }// adds card to the top
    
    public Card topDeck ( )
    { 
        return cardArray.remove(cardArray.size()-1);
    }// removes card from the top


    public String toString ( ) 
    { 
        String str="";
        for (int i=0; i<cardArray.size(); i++) {

            str+= cardArray.get(i) + "\n";
        }
        return str;
    }
}

