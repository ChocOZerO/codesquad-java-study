package chess;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.pieces.Pawn;

public class BoardTest {

    @Test
    public void create() {
        Board board = new Board();
        
        Pawn whitePawn = new Pawn();
        Pawn blackPawn = new Pawn(Pawn.BLACK_COLOR);
        
        board.add(whitePawn);
        assertEquals(1, board.size());
        assertEquals(whitePawn, board.findPawn(0));
        
        board.add(blackPawn);
        assertEquals(2, board.size());
        assertEquals(blackPawn, board.findPawn(1));
    }
    
    

}
