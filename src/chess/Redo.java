package chess;

public class Redo {
    private Board board;
    public Redo(Board board){
        this.board = board;
    }

    public void Execute(GamePanel gp){
        gp.getBoard().Redo(gp);
       gp.repaint();
    }
}
