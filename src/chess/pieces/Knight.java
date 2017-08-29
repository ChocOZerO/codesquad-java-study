package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    
    private Knight(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createWhiteKnight(String position) {
        return new Knight(Color.WHITE, Type.KNIGHT, position);
    }
    public static Piece createBlackKnight(String position) {
        return new Knight(Color.BLACK, Type.KNIGHT, position);
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
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+1)) + (this.getYPosition()+2));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+1)) + (this.getYPosition()-2));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+2)) + (this.getYPosition()+1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()+2)) + (this.getYPosition()-1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-1)) + (this.getYPosition()+2));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-1)) + (this.getYPosition()-2));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-2)) + (this.getYPosition()+1));
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition()-2)) + (this.getYPosition()-1));
    }

}
