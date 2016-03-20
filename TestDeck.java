
/**
 * Write a description of class TestDeck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDeck
{
    public static void main(String[] args)
    {
        int numCards = 10;
        Deck testDeck = new Deck(numCards);

        testDeck.add(new Card(2));
        testDeck.add(new Card(5));
        testDeck.add(new Card(6));
        testDeck.add(new Card(1));
        testDeck.add(new Card(7));
        testDeck.add(new Card(3));

        System.out.println(testDeck.toString()+"\n");

        testDeck.shuffle();
        System.out.println(testDeck.toString()+"\n");

        testDeck.sort();
        System.out.println(testDeck.toString()+"\n");

        while (testDeck.isEmpty() == false)
        {
            System.out.println(testDeck.topDeck().toString());
        }
    }
}
