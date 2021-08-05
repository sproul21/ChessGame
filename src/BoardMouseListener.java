import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class BoardMouseListener implements MouseListener
{

    int startx;
    int starty;



    public void mouseClicked(MouseEvent e)
    {


    }


    public void mousePressed(MouseEvent e) {
        int pressx=e.getX();
        int pressy=e.getY();
        startx=pressx/Chess.piecesize;
        starty=pressy/Chess.piecesize;

    }


    public void mouseReleased(MouseEvent e) {

        int releasex=e.getX();
        int releasey=e.getY();
        int endx=releasex/Chess.piecesize;
        int endy=releasey/Chess.piecesize;

        if(startx==endx && starty==endy)
            return;
        if(startx>=8 || startx<0)
            return;
        if(endx>=8 || endy<0)
            return;
        if(Chess.position[startx][starty]==null)
            return;
        if(Chess.position[startx][starty]!=null && Chess.position[endx][endy]!=null && Chess.position[endx][endy].isBlackplayer==Chess.position[startx][starty].isBlackplayer)
            return;

        Chess.position[endx][endy] = Chess.position[startx][starty];
        Chess.position[startx][starty]= null;
        Chess.Board.repaint();




    }


    public void mouseEntered(MouseEvent e) {

    }


    public void mouseExited(MouseEvent e) {

    }
}
