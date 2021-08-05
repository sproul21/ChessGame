import javax.swing.*;

public class Knight extends Piece
{

    public Knight(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("bknight.gif");
        }
        else
            image = new ImageIcon("wknight.gif");
    }
}
