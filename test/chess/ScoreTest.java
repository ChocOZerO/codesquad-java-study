package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chess.pieces.Piece;

public class ScoreTest {
    Board board;
    Position position;
    @Before
    public void setup() {
        board = new Board();
    }
    
    @Test
    public void whiteScore() {
        board.initialize();
        System.out.println(board.showBoard());
        Score score = new Score(board);
        assertEquals(38.0, score.getScore(Piece.Color.WHITE), 0.01);
    }
    
    @Test
    public void caculcatePoint() throws Exception {
        board.blankBoard();
        Score score = new Score(board);
        
        addPiece("b6", Piece.createBlackPawn("b6"));
        addPiece("e6", Piece.createBlackQueen("e6"));
        addPiece("b8", Piece.createBlackKing("b8"));
        addPiece("c8", Piece.createBlackRook("c8"));

        addPiece("f2", Piece.createWhitePawn("f2"));
        addPiece("g2", Piece.createWhitePawn("g2"));
        addPiece("e1", Piece.createWhiteRook("e1"));
        addPiece("f1", Piece.createWhiteKing("f1"));

        assertEquals(15.0, score.getScore(Piece.Color.BLACK), 0.01);
        assertEquals(7.0, score.getScore(Piece.Color.WHITE), 0.01);

        System.out.println(board.showBoard());
    }

    private void addPiece(String target, Piece piece) {
        board.generatePiece(target, piece);
    }
}
