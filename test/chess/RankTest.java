package chess;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import chess.pieces.Piece;

public class RankTest {

    @Test
    public void testBlankRank() {
        Rank rank = new Rank();
        List<Piece> blank = rank.getBlankRank();
        assertEquals('.', blank.get(0).getRepresentation());
        assertEquals(8, blank.size());
    }
    
    @Test
    public void testRank() {
        Rank rank = new Rank();
        rank.add(Piece.createBlackBishop());
        assertEquals('B', rank.get(0).getRepresentation());
        assertEquals(Piece.Color.BLACK, rank.get(0).getColor());
        assertEquals(Piece.Type.BISHOP, rank.get(0).getType());
    }
}
