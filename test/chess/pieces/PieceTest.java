package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

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
        verifyPiece(Piece.createWhitePawn(), Piece.createBlackPawn(), Type.PAWN);
        verifyPiece(Piece.createWhiteKnight(), Piece.createBlackKnight(), Type.KNIGHT);
        verifyPiece(Piece.createWhiteRook(), Piece.createBlackRook(), Type.ROOK);
        verifyPiece(Piece.createWhiteBishop(), Piece.createBlackBishop(), Type.BISHOP);
        verifyPiece(Piece.createWhiteQueen(), Piece.createBlackQueen(), Type.QUEEN);
        verifyPiece(Piece.createWhiteKing(), Piece.createBlackKing(), Type.KING);

        Piece blank = Piece.createBlank();
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
        assertTrue(Piece.createWhitePawn().isWhite());
        assertTrue(Piece.createWhiteRook().isWhite());
        assertTrue(Piece.createWhiteKnight().isWhite());
        assertTrue(Piece.createWhiteBishop().isWhite());
        assertTrue(Piece.createWhiteQueen().isWhite());
        assertTrue(Piece.createWhiteKing().isWhite());
        
        assertTrue(Piece.createBlackPawn().isBlack());
        assertTrue(Piece.createBlackRook().isBlack());
        assertTrue(Piece.createBlackKnight().isBlack());
        assertTrue(Piece.createBlackBishop().isBlack());
        assertTrue(Piece.createBlackQueen().isBlack());
        assertTrue(Piece.createBlackKing().isBlack());
    }
    
    @Test
    public void checkSamePiece() {
        assertTrue(Piece.createWhitePawn().checkSamePiece(Color.WHITE, Type.PAWN));
    }
}
