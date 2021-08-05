import javax.swing.*;

public class Chess
{
    public static final int piecesize= 44;
    public static final int WIDTH=piecesize*8;
    public static final int HEIGHT=piecesize*8;
    public static BoardComponent Board;
    public static Piece[][] position = new Piece[8][8];

    public static void main(String[] args)


    {
        position[0][0]= new Rook(true);
        position[0][7]= new Rook(false);
        position[1][0]= new Knight(true);
        position[1][7]= new Knight(false);
        position[2][0]= new Bishop(true);
        position[2][7]= new Bishop(false);
        position[3][0]= new Queen(true);
        position[3][7]= new Queen(false);
        position[4][0]= new King(true);
        position[4][7]= new King(false);
        position[5][0]= new Bishop(true);
        position[5][7]= new Bishop(false);
        position[6][0]= new Knight(true);
        position[6][7]= new Knight(false);
        position[7][0]= new Rook(true);
        position[7][7]= new Rook(false);
        position[0][1]= new Pawn(true);
        position[0][6]= new Pawn(false);
        position[1][1]= new Pawn(true);
        position[1][6]= new Pawn(false);
        position[2][1]= new Pawn(true);
        position[2][6]= new Pawn(false);
        position[3][1]= new Pawn(true);
        position[3][6]= new Pawn(false);
        position[4][1]= new Pawn(true);
        position[4][6]= new Pawn(false);
        position[5][1]= new Pawn(true);
        position[5][6]= new Pawn(false);
        position[6][1]= new Pawn(true);
        position[6][6]= new Pawn(false);
        position[7][1]= new Pawn(true);
        position[7][6]= new Pawn(false);



        JFrame window;
        window = new JFrame("Chess");
        window.setSize(WIDTH+10,HEIGHT+40);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board= new BoardComponent();
        BoardMouseListener boardMouseListener= new BoardMouseListener();
        Board.addMouseListener(boardMouseListener);
        window.add(Board);


        window.setVisible(true);

    }
}
