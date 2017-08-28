package chess;

import static org.junit.Assert.*;

import org.junit.Test;

import chess.pieces.Piece;

public class ScoreTest {

    @Test
    public void whiteScore() {
        Board board = new Board();
        board.initialize();
        System.out.println(board.showBoard());
        Score score = new Score(board);
        assertEquals(38.0, score.getScore(Piece.Color.WHITE), 0.01);
    }
    
}
