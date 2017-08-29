package chess;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.pieces.Piece;

public class RankTest {

    @Test
    public void testBlankRank() {
        Rank rank = new Rank(0);
        
        assertEquals(Piece.createBlank(), rank.getPiece(0));
        assertEquals(8, rank.getRank().size());
    }
    
    @Test
    public void testRank() {
        Rank rank = new Rank(0);
        rank.setPiece(0, Piece.createBlackBishop());
        assertEquals('B', rank.getPiece(0).getRepresentation());
        assertEquals(Piece.Color.BLACK, rank.getPiece(0).getColor());
        assertEquals(Piece.Type.BISHOP, rank.getPiece(0).getType());
    }
    
    @Test
    public void countPiece() {
        Rank rank = new Rank(0);
        rank.setPiece(0, Piece.createBlackBishop());
        rank.setPiece(3, Piece.createBlackBishop());
        assertEquals(2, rank.countPiece(Piece.Color.BLACK, Piece.Type.BISHOP));
    }
    
    @Test
    public void chceckRankRepresentation() {
        Rank rank = new Rank(0);
        assertEquals("........", rank.getRankRepresentation());
    }
}
