
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Card extends java.lang.Object
{
    ArrayList Cards= new ArrayList();
    /**
     * Constructor for objects of class Card
     */
    public Card(int id)
    {
        Cards = new ArrayList(id);
    }
    
    public int getId()
    {
        return Cards;
    }
    
    public boolean equals(java.lang.Object other)
    {
        if(Cards==other){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int compareTo(Card other)
    {
        if(Cards.getId() < other)
        {
            return -1;
        }
        else if(Cards.getId()==other)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public java.lang.String toString()
    {
        return ("The cards id is:"+Cards.getId());
    }
}
