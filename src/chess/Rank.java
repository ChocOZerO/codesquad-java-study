package chess;

import java.util.ArrayList;
import java.util.List;

import chess.pieces.Piece;
import chess.pieces.Piece.Color;
import chess.pieces.Piece.Type;

public class Rank {
    private List<Piece> rank = new ArrayList<>();
    
    Rank() {
        setBlankRank();
    }
    
    public void setPiece(int index, Piece piece) {
        this.rank.set(index, piece);
    }
    public Piece getPiece(int index) {
        return this.rank.get(index);
    }
    
    private void setBlankRank() {
        for (int i = 0; i < 8; i++) {
            this.rank.add(Piece.createBlank());
        }
    }
    public List<Piece> getBlankRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createBlank());
        }
        return this.rank;
    }
    
    public List<Piece> initializeWhitePawnRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createWhitePawn());
        }
        return this.rank;
    }
    public List<Piece> initializeWhitePieceRank() {
        this.rank.set(0, Piece.createWhiteRook());
        this.rank.set(1, Piece.createWhiteKnight());
        this.rank.set(2, Piece.createWhiteBishop());
        this.rank.set(3, Piece.createWhiteQueen());
        this.rank.set(4, Piece.createWhiteKing());
        this.rank.set(5, Piece.createWhiteBishop());
        this.rank.set(6, Piece.createWhiteKnight());
        this.rank.set(7, Piece.createWhiteRook());
        return this.rank;
    }
    public List<Piece> initializeBlackPawnRank() {
        for (int i = 0; i < 8; i++) { 
            this.rank.set(i, Piece.createBlackPawn());
        }
        return this.rank;
    }
    public List<Piece> initializeBlackPieceRank() {
        this.rank.set(0, Piece.createBlackRook());
        this.rank.set(1, Piece.createBlackKnight());
        this.rank.set(2, Piece.createBlackBishop());
        this.rank.set(3, Piece.createBlackQueen());
        this.rank.set(4, Piece.createBlackKing());
        this.rank.set(5, Piece.createBlackBishop());
        this.rank.set(6, Piece.createBlackKnight());
        this.rank.set(7, Piece.createBlackRook());
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
