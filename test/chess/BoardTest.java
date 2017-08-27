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
}
