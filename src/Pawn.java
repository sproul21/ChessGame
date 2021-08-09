import javax.swing.*;

public class Pawn extends Piece
{

    public Pawn(boolean isBlackPlayer)
    {
        this.isBlackplayer= isBlackPlayer;
        if(isBlackPlayer==true) {
            image = new ImageIcon("bpawn.gif");
        }
        else
            image = new ImageIcon("wpawn.gif");
    }
    public boolean canMove(int startx, int starty, int endx, int endy)
    {
        return(true);
    }
}
