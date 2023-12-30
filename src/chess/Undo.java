package chess;

public class Undo {
    private Board board;
    public Undo(Board board){
        this.board = board;
    }

    public void Execute(GamePanel gp){
        gp.getBoard().Undo(gp);
        gp.repaint();
    }
}
