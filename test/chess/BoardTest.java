package chess;

import static org.junit.Assert.*;
import static utils.StringUtils.*;

import org.junit.Before;
import org.junit.Test;

import chess.pieces.Piece;

public class BoardTest {
    
    private Board board;
    
    @Before
    public void setup() {
        board = new Board();
    }
    
    @Test
    public void create() {
        board.initialize();
        assertEquals(32, board.countTotalPiece());
        String blankLine = appendNewLine(getBlankLine());
        assertEquals(
            appendNewLine("RNBQKBNR") +
            appendNewLine("PPPPPPPP") +
            blankLine + blankLine + blankLine + blankLine +
            appendNewLine("pppppppp") +
            appendNewLine("rnbqkbnr"),
            board.showBoard());
    }
    
    @Test
    public void print() throws Exception {
        board.initialize();
        System.out.println(board.showBoard());
        assertEquals(2, board.getPieceCount(Piece.Color.WHITE, Piece.Type.KNIGHT));
    }
    
    @Test
    public void pieceCount() throws Exception {
        board.blankBoard();
        assertEquals(64, board.getPieceCount(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE));
        
    }
    
    @Test
    public void chceckBlankBoardRepresentation() {
        board.blankBoard();
        String blankLine = appendNewLine(getBlankLine());
        assertEquals(blankLine + blankLine
                + blankLine + blankLine
                + blankLine + blankLine
                + blankLine + blankLine, board.showBoard());
    }
    
    @Test
    public void position() {
        board.initialize();
        assertEquals(Piece.createBlackBishop(), board.findPiece("f8"));
        assertEquals(Piece.createBlank(), board.findPiece("f4"));
        assertEquals(Piece.createWhiteRook(), board.findPiece("a1"));
    }
    
    @Test
    public void generate() throws Exception {
        board.blankBoard();
        
        String position = "b5";
        Piece piece = Piece.createBlackRook();
        board.generatePiece(position, piece);

        assertEquals(piece, board.findPiece(position));
        System.out.println(board.showBoard());
    }
    
    @Test
    public void move() throws Exception {
        board.initialize();
        assertEquals(Piece.createWhiteRook(), board.findPiece("a1"));
        String position = "b5";
        Piece piece = Piece.createBlackRook();
        board.move("a1" ,position, piece);

        assertEquals(piece, board.findPiece(position));
        System.out.println(board.showBoard());
    }
}
