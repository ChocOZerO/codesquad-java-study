package chess;

import java.util.ArrayList;
import java.util.List;

import chess.pieces.Piece;

public class Rank {
    private List<Piece> rank = new ArrayList<>();
    
    public void add(Piece piece) {
        this.rank.add(piece);
    }
    public Piece get(int index) {
        return this.rank.get(index);
    }
    
    private void setBlankRank() {
        for (int i = 0; i < 8; i++) {
            this.rank.add(Piece.createBlank());
        }
    }
    public List<Piece> getBlankRank() {
        setBlankRank();
        return this.rank;
    }
    
    public List<Piece> getRank() {
        return this.rank;
    }
}
