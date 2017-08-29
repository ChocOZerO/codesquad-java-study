package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    
    private King(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createWhiteKing(String position) {
        return new King(Color.WHITE, Type.KING, position);
    }
    public static Piece createBlackKing(String position) {
        return new King(Color.BLACK, Type.KING, position);
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
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()+1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+1)) + (this.getYPosition()+1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+1)) + (this.getYPosition()));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+1)) + (this.getYPosition()-1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()-1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-1)) + (this.getYPosition()-1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-1)) + (this.getYPosition()));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-1)) + (this.getYPosition()+1));
    }

}
