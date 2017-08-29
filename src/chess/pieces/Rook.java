package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    
    private Rook(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createWhiteRook(String position) {
        return new Rook(Color.WHITE, Type.ROOK, position);
    }
    public static Piece createBlackRook(String position) {
        return new Rook(Color.BLACK, Type.ROOK, position);
    }
    
    @Override
    public boolean checkMoveAvailable(String target) {
        setMoveAvailable();
        if (this.moveAvailable.size() < 1) return false;
        for (String move: this.moveAvailable) {
            if (move.equals(target)) return true;
        }
        return false;
    }

    @Override
    protected void setMoveAvailable() {
        this.moveAvailable = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()+i));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+i)) + (this.getYPosition()));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()-i));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-i)) + (this.getYPosition()));
        }
    }

}
