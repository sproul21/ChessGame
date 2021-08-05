import javax.swing.*;

public class Rook extends Piece
{

    public Rook(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("brook.gif");
        }
        else
            image = new ImageIcon("wrook.gif");
    }
}
