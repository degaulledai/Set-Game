import java.lang.Comparable;
public class ZetCard extends Card
{

    private int number; 
    private int shape; 
    private int fill; 
    private int color;

    public ZetCard(int id, int n, int s, int f, int c)
    {
        super(id);
        number = n; 
        shape = s; 
        fill = f; 
        color = c;
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
        String card = number + " ";
        if (shape == 1)
            card+="oval ";
        if (shape == 2)
            card +="squiggle ";
        if (shape == 3)
            card+="diamond ";
        if (fill == 1)
            card +="outlined ";
        if (fill == 2)
            card +="solid ";
        if (fill == 3)
            card +="striped ";
        if (color == 1)
            card +="red ";
        if (color == 2)
            card +="green ";
        if (color == 3)
            card +="blue "; 
        return card;
    }
}
