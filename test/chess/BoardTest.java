package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chess.pieces.Pawn;

public class BoardTest {
    
    private Board board;
    
    @Before
    public void setup() {
        board = new Board();
    }
    
    @Test
    public void create() {
        Pawn whitePawn = new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION);
        board.addWhitePawn(whitePawn);
        assertEquals(1, board.size());
        assertEquals(whitePawn, board.findWhitePawn(0));
        
        Pawn blackPawn = new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION);
        board.addBlackPawn(blackPawn);
        assertEquals(2, board.size());
        assertEquals(blackPawn, board.findBlackPawn(0));
    }
    
    @Test
    public void initialize() throws Exception {
        board.initialize();
        assertEquals("pppppppp", board.getWhitePawnsResult());
        assertEquals("PPPPPPPP", board.getBlackPawnsResult());
    }
    
    @Test
    public void print() throws Exception {
        board.initialize();
        board.print();
    }
}
