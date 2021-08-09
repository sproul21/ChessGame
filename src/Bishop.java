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
    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        return(true);
    }
}
