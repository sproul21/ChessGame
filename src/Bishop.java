import javax.swing.*;

public class Bishop extends Piece
{

    public Bishop(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("bbishop.gif");
        }
        else
            image = new ImageIcon("wbishop.gif");
    }
}
