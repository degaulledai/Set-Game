
/**
 * Write a description of class ZetCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZetCard extends Card
{
    private static int ID;
    private int number; 
    private int shape; 
    private int fill; 
    private int color;
    private final String[] shapeNames = {null,"oval","squiggle","diamond"};
    private final String[] fillNames = {null,"outlined","solid","striped"};
    private final String[] colorNames = {null,"red","green","blue"};

    public ZetCard(int n, int s, int f, int c)
    {
        super(ID);
        number = n; 
        shape = s; 
        fill = f; 
        color = c;
        ID++;
    }

    public int getNumber()
    {
        return number;
    }

    public int getShape()
    {
        return shape;
    }

    public int getFill()
    {
        return fill;
    }

    public int getColor()
    {
        return color; 
    }

    public String toString()
    {
        return (number+" "+shapeNames[shape]+"(s) that are/is "+fillNames[fill]+" in "+colorNames[color]);
    }
}
