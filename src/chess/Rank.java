package chess;

import java.util.ArrayList;
import java.util.List;

import chess.pieces.Piece;
import chess.pieces.Piece.Color;
import chess.pieces.Piece.Type;

public class Rank {
    private List<Piece> rank = new ArrayList<>();
    private int rankNum;
    
    Rank(int rankNum) {
        setBlankRank();
        this.rankNum = 8 - rankNum;
    }
    
    public void setPiece(int index, Piece piece) {
        this.rank.set(index, piece);
    }
    public Piece getPiece(int index) {
        return this.rank.get(index);
    }
    
    int getRankNum() {
        return this.rankNum;
    }
    private void setBlankRank() {
        for (int i = 0; i < 8; i++) {
            this.rank.add(Piece.createBlank(String.valueOf((char)(97+i)) + this.rankNum));
        }
    }
    public List<Piece> getBlankRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createBlank(String.valueOf((char)(97+i)) + this.rankNum));
        }
        return this.rank;
    }
    
    public List<Piece> initializeWhitePawnRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createWhitePawn(String.valueOf((char)(97+i)) + this.rankNum));
        }
        return this.rank;
    }
    public List<Piece> initializeWhitePieceRank() {
        this.rank.set(0, Piece.createWhiteRook(String.valueOf((char)(97+0)) + this.rankNum));
        this.rank.set(1, Piece.createWhiteKnight(String.valueOf((char)(97+1)) + this.rankNum));
        this.rank.set(2, Piece.createWhiteBishop(String.valueOf((char)(97+2)) + this.rankNum));
        this.rank.set(3, Piece.createWhiteQueen(String.valueOf((char)(97+3)) + this.rankNum));
        this.rank.set(4, Piece.createWhiteKing(String.valueOf((char)(97+4)) + this.rankNum));
        this.rank.set(5, Piece.createWhiteBishop(String.valueOf((char)(97+5)) + this.rankNum));
        this.rank.set(6, Piece.createWhiteKnight(String.valueOf((char)(97+6)) + this.rankNum));
        this.rank.set(7, Piece.createWhiteRook(String.valueOf((char)(97+7)) + this.rankNum));
        return this.rank;
    }
    public List<Piece> initializeBlackPawnRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createBlackPawn(String.valueOf((char)(97+i)) + this.rankNum));
        }
        return this.rank;
    }
    public List<Piece> initializeBlackPieceRank() {
        this.rank.set(0, Piece.createBlackRook(String.valueOf((char)(97+0)) + this.rankNum));
        this.rank.set(1, Piece.createBlackKnight(String.valueOf((char)(97+1)) + this.rankNum));
        this.rank.set(2, Piece.createBlackBishop(String.valueOf((char)(97+2)) + this.rankNum));
        this.rank.set(3, Piece.createBlackQueen(String.valueOf((char)(97+3)) + this.rankNum));
        this.rank.set(4, Piece.createBlackKing(String.valueOf((char)(97+4)) + this.rankNum));
        this.rank.set(5, Piece.createBlackBishop(String.valueOf((char)(97+5)) + this.rankNum));
        this.rank.set(6, Piece.createBlackKnight(String.valueOf((char)(97+6)) + this.rankNum));
        this.rank.set(7, Piece.createBlackRook(String.valueOf((char)(97+7)) + this.rankNum));
        return this.rank;
    }
    
    public List<Piece> getRank() {
        return this.rank;
    }
    int countPiece(Color color, Type type) {
        int pieceCount = 0;
        for (Piece piece: this.rank) {
            if (piece.checkSamePiece(color, type)) {
                pieceCount++;
            }
        }
        return pieceCount;
    }
    String getRankRepresentation() {
        StringBuilder sb = new StringBuilder();
        for (Piece piece: this.rank) {
            sb.append(piece.getRepresentation());
        }
        return sb.toString();
    }
}
