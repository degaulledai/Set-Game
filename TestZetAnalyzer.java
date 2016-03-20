
/**
 * Write a description of class TestZetAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class TestZetAnalyzer
{
    public static void main(String[] args)
    {
        ZetDeck testDeck = new ZetDeck();
        ZetCard[] handOfCards = new ZetCard[21];
        for (int x = 0;x<21;x++)
        {
            ZetCard card = (ZetCard)testDeck.topDeck();
            handOfCards[x]= card;
            System.out.println(card.toString());
        }
        System.out.print("\n");
        int setNum = 1;
        for (int x = 0; x < 21; x++)
        {
            for (int y = x+1; y < 21; y++)
            {
                for (int z = y+1; z < 21; z++)
                {
                    if (ZetAnalyzer.isZet(handOfCards[x],handOfCards[y],handOfCards[z])==true)
                    {
                        System.out.println("Set #"+ setNum +":\n"+handOfCards[x].toString()+", "+handOfCards[y].toString()+", "+handOfCards[z].toString());
                        setNum++;
                    }
                }   
            }
        }
        int[] foundZet = ZetAnalyzer.findZet(handOfCards);
        System.out.println("findZet tester\n" +foundZet[0]+", "+foundZet[1]+", "+foundZet[2]);
    }
}
