
public class ZetAnalyzer
{
    public static boolean isZet(ZetCard card1, ZetCard card2, ZetCard card3)
    {
        // this program takes three cards and checks if the four characteristics are all same or all different.
        // If one characteristic is true, its corresponding boolean is true
        // at the end of the method, if all booleans are true, it returns true that it is a set. Otherwise it returns false
        boolean isNumber;
        boolean isShape;
        boolean isFill;
        boolean isColor;

        //checks if the numbers are all same or all different
        if ((card1.getNumber()==card2.getNumber() && card1.getNumber()==card3.getNumber()) 
        || (card1.getNumber()!=card2.getNumber() && card2.getNumber()!=card3.getNumber() && card3.getNumber()!=card1.getNumber()))
        {
            isNumber=true;
        }
        else
        {
            isNumber=false;
        }
        //checks if the Shape are all same or all different
        if ((card1.getShape()==card2.getShape() && card1.getShape()==card3.getShape()) 
        || (card1.getShape()!=card2.getShape() && card2.getShape()!=card3.getShape() && card3.getShape()!=card1.getShape()))
        {
            isShape=true;
        }
        else
        {
            isShape=false;
        }
        //checks if the filling are all same or all different
        if ((card1.getFill()==card2.getFill() && card1.getFill()==card3.getFill()) 
        || (card1.getFill()!=card2.getFill() && card2.getFill()!=card3.getFill() && card3.getFill()!=card1.getFill()))
        {
            isFill=true;
        }
        else
        {
            isFill=false;
        }
        //checks if the color are all same or all different
        if ((card1.getColor()==card2.getColor() && card1.getColor()==card3.getColor()) 
        || (card1.getColor()!=card2.getColor() && card2.getColor()!=card3.getColor() && card3.getColor()!=card1.getColor()))
        {
            isColor=true;
        }
        else
        {
            isColor=false;
        }

        //if all booleans are true, return true
        if (isNumber==true && isShape==true && isFill==true && isColor==true)
        {
            return true;
        }
        return false;
    }

    // findZet finds a set in the deck, if the player needs a hint or something
    public static int[] findZet (ZetCard[] cards)
    {
        //declaring an array to hold the set indices
        int [] arr=new int[3];
        arr[0]=0;
        arr[1]=0;
        arr[2]=0;
        // i is index of 1 card, x is index of another card, y is index of another card. 
        // use the nested for loops to traverse every card combination
        for (int i=0; i<cards.length; i++)
        {
            for (int x=i+1; x<cards.length; x++)
            {
                for (int y=x+1; y<cards.length; y++)
                {
                    // first set found, put it into the array and return it
                    if (isZet(cards[i],cards[x],cards[y])==true)
                    {
                        arr[0]=i;
                        arr[1]=x;
                        arr[2]=y;
                        return arr;
                    }
                }
            }
        }
        // if no set found, returns an empty array.
        return arr;
    }
}
