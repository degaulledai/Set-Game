import java.util.*;
public class ZetDeck extends Deck
{
    public ZetDeck()
    {
        super(81);
        int number = 1, shape = 1 , fill = 1; 
        for(int i = 0; i < 81; i++)
        {
            if(i%3==0)
            fill = (++fill)%3+1;
            if(i%9==0) 
            shape = (++shape)%3+1;
            if(i%27==0) 
            number = (++number)%3+1;
            
            this.add(new ZetCard(number,shape,fill,i%3+1) );
        }
        this.shuffle();
    }
}