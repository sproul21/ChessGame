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
    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        return(true);
    }
}
