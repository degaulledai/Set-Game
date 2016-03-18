
public class ZetDeck extends Deck
{
    //Constructs a deck for the Set game.
    public ZetDeck()
    {
        super(81);
        int nbr=1;
        for ( int color=1; color<=3; color++)
        {
            for ( int shape=1; shape<=3; shape++)
            {
                for ( int fill=1; fill<=3; fill++)
                {
                    for ( int num=1; num<=3; num++)
                    {
                        ZetCard crd=new ZetCard(nbr,num,shape,fill,color);
                        add(crd);
                        nbr++;
                    }
                }
            }
        }
        shuffle();
    }    
}
