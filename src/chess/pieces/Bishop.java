package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    
    private Bishop(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createWhiteBishop(String position) {
        return new Bishop(Color.WHITE, Type.BISHOP, position);
    }
    public static Piece createBlackBishop(String position) {
        return new Bishop(Color.BLACK, Type.BISHOP, position);
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
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+i)) + (this.getYPosition()+i));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+i)) + (this.getYPosition()-i));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-i)) + (this.getYPosition()-i));
            this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-i)) + (this.getYPosition()+i));
        }
    }

}
