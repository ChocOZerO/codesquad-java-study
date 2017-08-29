package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.Board;
import chess.pieces.Piece.Color;
import chess.pieces.Piece.Type;

public class PieceTest {
    
    @Test
    public void getRepresentationPerPiece() throws Exception {
        assertEquals('p', Piece.Type.PAWN.getWhiteRepresentation());
        assertEquals('P', Piece.Type.PAWN.getBlackRepresentation());
    }
    
    @Test
    public void create_piece() {
        verifyPiece(Piece.createWhitePawn("a1"), Piece.createBlackPawn("a1"), Type.PAWN);
        verifyPiece(Piece.createWhiteKnight("a1"), Piece.createBlackKnight("a1"), Type.KNIGHT);
        verifyPiece(Piece.createWhiteRook("a1"), Piece.createBlackRook("a1"), Type.ROOK);
        verifyPiece(Piece.createWhiteBishop("a1"), Piece.createBlackBishop("a1"), Type.BISHOP);
        verifyPiece(Piece.createWhiteQueen("a1"), Piece.createBlackQueen("a1"), Type.QUEEN);
        verifyPiece(Piece.createWhiteKing("a1"), Piece.createBlackKing("a1"), Type.KING);

        Piece blank = Piece.createBlank("a1");
        assertFalse(blank.isWhite());
        assertFalse(blank.isBlack());
        assertEquals(Type.NO_PIECE, blank.getType());
    }

    private void verifyPiece(final Piece whitePiece, final Piece blackPiece, final Type type) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());

        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
    }
    
    @Test
    public void isWhiteAndBlack() throws Exception {
        assertTrue(Piece.createWhitePawn("a1").isWhite());
        assertTrue(Piece.createWhiteRook("a1").isWhite());
        assertTrue(Piece.createWhiteKnight("a1").isWhite());
        assertTrue(Piece.createWhiteBishop("a1").isWhite());
        assertTrue(Piece.createWhiteQueen("a1").isWhite());
        assertTrue(Piece.createWhiteKing("a1").isWhite());
        
        assertTrue(Piece.createBlackPawn("a1").isBlack());
        assertTrue(Piece.createBlackRook("a1").isBlack());
        assertTrue(Piece.createBlackKnight("a1").isBlack());
        assertTrue(Piece.createBlackBishop("a1").isBlack());
        assertTrue(Piece.createBlackQueen("a1").isBlack());
        assertTrue(Piece.createBlackKing("a1").isBlack());
    }
    
    @Test
    public void checkSamePiece() {
        assertTrue(Piece.createWhitePawn("a1").checkSamePiece(Color.WHITE, Type.PAWN));
    }
    
    @Test
    public void Score() {
        System.out.println(Piece.Type.ROOK.getScore());
    }
    
    /* 다음 단계
    @Test
    public void getPosition() {
        Board board = new Board();
        board.initialize();
        assertEquals("c7", Piece.createBlackKnight().getPosition());
    }
    */
}
