import javax.swing.*;

public class Queen extends Piece
{

    public Queen(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("bqueen.gif");
        }
        else
            image = new ImageIcon("wqueen.gif");
    }
    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        return(true);
    }
}
