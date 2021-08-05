import javax.swing.*;
import java.awt.*;

public class BoardComponent extends JComponent {
    protected void paintComponent(Graphics g) {


        Color lightBrown;
        lightBrown = new Color(233, 174, 95);
        Color darkBrown;
        darkBrown = new Color(177, 113, 24);


        g.setColor(lightBrown);
        g.fillRect(0, 0, Chess.WIDTH, Chess.HEIGHT);


        g.setColor(darkBrown);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 != j % 2) {
                    g.fillRect(i * Chess.piecesize, j * Chess.piecesize, Chess.piecesize, Chess.piecesize);
                }


            }
        }
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {

            if (Chess.position[x][y] != null) {
                Chess.position[x][y].image.getImage();
                g.drawImage(Chess.position[x][y].image.getImage(), x * Chess.piecesize, y * Chess.piecesize, null);
            }
        }
    }
        }
    }

/*
        Color lightBrown;
        lightBrown= new Color(233,174,95);
        Color darkBrown;
        darkBrown= new Color(177,113,24);
        g.setColor(lightBrown);
        g.fillRect(0*Chess.piecesize,0*Chess.piecesize,Chess.piecesize,Chess.piecesize);
        g.setColor(darkBrown);
        g.fillRect(1*Chess.piecesize,0*Chess.piecesize,Chess.piecesize,Chess.piecesize);
*/



