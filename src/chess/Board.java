package chess;

import java.util.ArrayList;

import chess.pieces.Pawn;

public class Board {
    ArrayList<Pawn> pawns = new ArrayList<>();
    
    public void add(Pawn pawn) {
        this.pawns.add(pawn);
    }
    
    public int size() {
        return pawns.size();
    }
    
    public Pawn findPawn(int index) {
        return pawns.get(index);
    }
}
