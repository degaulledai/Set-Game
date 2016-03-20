
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Card extends java.lang.Object implements Comparable<Card>
{
    private int ID;
    /**
     * Constructor for objects of class Card
     */
    public Card(int id)
    {
        ID=id;
    }

    public int getId()
    {
        return ID;
    }

    public boolean equals(java.lang.Object other)
    {
        if (this.compareTo((Card)other)==0)
            return true;

        return false;
    }

    public int compareTo(Card other)
    {
        if(this.ID<other.getId()) 
            return -1;
        if (this.ID>other.getId())
            return 1;
        return 0;
    }

    public java.lang.String toString()
    {
        return ("The cards id is: "+ID);
    }
}
