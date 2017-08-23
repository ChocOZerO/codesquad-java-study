package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.pieces.Piece.Color;

public class PieceTest {
    
    @Test
    public void getRepresentationPerPiece() throws Exception {
        assertEquals('p', Piece.Type.PAWN.getWhiteRepresentation());
        assertEquals('P', Piece.Type.PAWN.getBlackRepresentation());
    }
    
    @Test
    public void create_piece() {
        verifyPiece(Piece.createWhitePawn(), Piece.Color.WHITE, Piece.Type.PAWN.getWhiteRepresentation());
        verifyPiece(Piece.createBlackPawn(), Piece.Color.BLACK, Piece.Type.PAWN.getBlackRepresentation());
        
        verifyPiece(Piece.createWhiteKnight(), Piece.Color.WHITE, Piece.Type.KNIGHT.getWhiteRepresentation());
        verifyPiece(Piece.createBlackKnight(), Piece.Color.BLACK, Piece.Type.KNIGHT.getBlackRepresentation());
        
        verifyPiece(Piece.createWhiteRook(), Piece.Color.WHITE, Piece.Type.ROOK.getWhiteRepresentation());
        verifyPiece(Piece.createBlackRook(), Piece.Color.BLACK, Piece.Type.ROOK.getBlackRepresentation());
        
        verifyPiece(Piece.createWhiteBishop(), Piece.Color.WHITE, Piece.Type.BISHOP.getWhiteRepresentation());
        verifyPiece(Piece.createBlackBishop(), Piece.Color.BLACK, Piece.Type.BISHOP.getBlackRepresentation());
        
        verifyPiece(Piece.createWhiteQueen(), Piece.Color.WHITE, Piece.Type.QUEEN.getWhiteRepresentation());
        verifyPiece(Piece.createBlackQueen(), Piece.Color.BLACK, Piece.Type.QUEEN.getBlackRepresentation());
        
        verifyPiece(Piece.createWhiteKing(), Piece.Color.WHITE, Piece.Type.KING.getWhiteRepresentation());
        verifyPiece(Piece.createBlackKing(), Piece.Color.BLACK, Piece.Type.KING.getBlackRepresentation());     
    }
    
    private void verifyPiece(final Piece piece, final Color color, final char representation) {
        assertEquals(color, piece.getColor());
        assertEquals(representation, piece.getRepresentation());
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
}
