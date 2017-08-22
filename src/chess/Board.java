package chess;

import java.util.ArrayList;

import chess.pieces.Pawn;

public class Board {
    ArrayList<Pawn> whitePawns = new ArrayList<>();
    ArrayList<Pawn> blackPawns = new ArrayList<>();
    
    void addWhitePawn(Pawn pawn) {
        this.whitePawns.add(pawn);
    }
    void addBlackPawn(Pawn pawn) {
        this.blackPawns.add(pawn);
    }
    
    int size() {
        return this.whitePawns.size() + this.blackPawns.size();
    }
    
    Pawn findWhitePawn(int index) {
        return this.whitePawns.get(index);
    }
    Pawn findBlackPawn(int index) {
        return this.blackPawns.get(index);
    }
    
    void initialize() {
        for (int i = 0; i < 8; i++) {
            whitePawns.add(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
            blackPawns.add(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
        }
    }
    private String getPawnsResult(ArrayList<Pawn> pawns) {
        StringBuilder sb = new StringBuilder();
        for (Pawn pawn: pawns) {
            sb.append(pawn.getRepresentation());
        }
        return sb.toString();
    }
    String getWhitePawnsResult() {
        return this.getPawnsResult(whitePawns);
    }
    String getBlackPawnsResult() {
        return this.getPawnsResult(blackPawns);
    }
    
    private String getBlankLine() {
        return "........";
    }
    
    void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i == 1) sb.append(this.getWhitePawnsResult() + "\n");
            else if (i == 6) sb.append(this.getBlackPawnsResult() + "\n");
            else sb.append(this.getBlankLine() + "\n");
        }
        System.out.println(sb.toString());
    }
}
