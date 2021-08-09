import javax.swing.*;

public class King extends Piece
{

    public King(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true)
            image = new ImageIcon("bking.gif");

        else
            image = new ImageIcon("wking.gif");
    }
    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        if(startx-endx>=-1 && startx-endx<=1)
            return true;
        else
        return false;
    }
}
