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
    public boolean canMove(int startx, int starty, int endx, int endy)
    {

            if (startx == endx || starty == endy) {
                for (int y = starty - 1; y > endy; y = y - 1) {
                    if (Chess.position[startx][y] != null)
                        return false;
                }
                return (true);
            } else
                return false;

    }
}
