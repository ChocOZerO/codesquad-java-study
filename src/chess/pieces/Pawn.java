package chess.pieces;

import java.util.ArrayList;

public class Pawn extends Piece {
    
    private Pawn(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createWhitePawn(String position) {
        return new Pawn(Color.WHITE, Type.PAWN, position);
    }
    public static Piece createBlackPawn(String position) {
        return new Pawn(Color.BLACK, Type.PAWN, position);
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
        if (this.isBlack()) setMoveBlackAvailable();
        setMoveWhiteAvailable();
    }
    private void setMoveBlackAvailable(){
        this.moveAvailable = new ArrayList<>();
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()-1));
    }
    private void setMoveWhiteAvailable(){
        this.moveAvailable = new ArrayList<>();
        this.moveAvailable.add(String.valueOf((char)(97+this.getXPosition())) + (this.getYPosition()+1));
    }
}
