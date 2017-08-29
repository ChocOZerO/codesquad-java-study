package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public class Blank extends Piece {
    
    private Blank(Color color, Type type, String position) {
        super(color, type, position);
    }
    public static Piece createBlank(String position) {
        return new Blank(Color.NO_COLOR, Type.NO_PIECE, position);
    }
    
    @Override
    public boolean checkMoveAvailable(String target) {
        setMoveAvailable();
        return false;
    }

    @Override
    protected void setMoveAvailable() {
        this.moveAvailable = new ArrayList<>();
    }

}
