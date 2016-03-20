/**
 *  Provides static methods for finding sets.
 */

/*

Tips:

- Given a, b, c from {1, 2, 3}, they are all equal or all different if and only if
(a + b + c) % 3 == 0.  This property can be used for testing three cards for a set
easily.

(For more mathematically inclined, the SET deck corresponds to the 4-dimensional vector
space over the algebraic field {0, 1, 2} with modulo 3 arithmetic.  Three cards form a "set"
if and only if the sum of the corresponding vectors is 0.)

- isZet and findZet are static methods.

- in isZet, don't forget to check that the cards are not all the same.

- Note that an array passed to findZet can have nulls in some of the elements.

 */

public class ZetAnalyzer
{
    public static boolean isZet (ZetCard card1,ZetCard card2, ZetCard card3) 
    {
        if (card1 == null || card2 == null || card3 == null) return false;
        if ((card1.getNumber()+card2.getNumber()+card3.getNumber())%3 !=0) return false;
        if ((card1.getColor()+card2.getColor()+card3.getColor())%3 !=0) return false;
        if ((card1.getShape()+card2.getShape()+card3.getShape())%3 !=0) return false;
        if ((card1.getFill()+card2.getFill()+card3.getFill())%3 != 0) return false;
        return true;

    }

    public static int[ ] findZet (ZetCard[ ] cards)
    {
        for (int x = 0; x < cards.length; x++)
        {
            for (int y = x+1; y < cards.length; y++)
            {
                for (int z = y+1; z < cards.length; z++)
                {
                    if (isZet(cards[x],cards[y],cards[z])) return new int[] {x,y,z};                    
                }   
            }
        }
        return null;
    }
}
