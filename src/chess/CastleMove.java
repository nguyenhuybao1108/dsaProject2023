/* Name: GROUP 8 
    Ma Phung Nghia - ITCSIU2106
    Huynh Thi Ngoc Tram - ITCSIU21238
    Nguyen Huy Bao - ITDSIU21076
    Purpose : create a game apply data structure and all knowledge about coding*/
package chess;

import java.awt.Point;

public class CastleMove extends Move {  
    private Piece rook;
    private Point moveRookTo;
    public CastleMove(Piece king, Point moveKing, Piece rook, Point moveRook) {
        super(king, moveKing, null);
        this.moveRookTo = moveRook;
        this.rook = rook;
    }
    public Point getRookMoveTo() {
        return moveRookTo;
    }

    public Piece getRook() {
        return rook;
    }
}
