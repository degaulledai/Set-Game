
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Card extends java.lang.Object implements Comparable<Card>
{
    private int iD;
    /**
     * Constructor for objects of class Card
     */
    public Card(int id)
    {
        iD=id;
    }
    
    public int getId()
    {
        return iD;
    }
    
    public boolean equals(Card other)
    {
        if(iD==other.getId()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int compareTo(Card other)
    {
        if(iD < other.getId())
        {
            return -1;
        }
        else if(iD==other.getId())
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public java.lang.String toString()
    {
        return ("The cards id is:"+iD);
    }
}
