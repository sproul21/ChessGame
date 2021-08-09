import javax.swing.*;

abstract class Piece
{
    boolean isBlackplayer;
    ImageIcon image;
    public abstract boolean canMove(int startx, int starty, int endx, int endy);
}
