import javax.swing.*;

public class King extends Piece
{

    public King(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("bking.gif");
        }
        else
            image = new ImageIcon("wking.gif");
    }
}
