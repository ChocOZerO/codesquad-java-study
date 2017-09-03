package chess.pieces;

import chess.Board;

public class Blank extends Piece {
    
    private Blank(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createBlank(String position) {
        return new Blank(Color.NO_COLOR, Type.NO_PIECE, position);
    }
    
    @Override
    protected void setMoveAvailable(Board board) {
        // blank 는 none
    }

}
