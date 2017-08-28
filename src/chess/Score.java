package chess;

import chess.pieces.Piece;
import chess.pieces.Piece.Color;

public class Score {
    Board board;
    Score(Board board) {
        this.board = board;
    }
    
    double getScore(Color color) {
        int whiteScore = 0;
        whiteScore += getPawnScore(color);
        whiteScore += getRookScore(color);
        whiteScore += getKnightScore(color);
        whiteScore += getBishopScore(color);
        whiteScore += getQueenScore(color);
        return whiteScore;
    }
    
    private double getPawnScore(Color color) {
        return 1.0 * board.getPieceCount(color, Piece.Type.PAWN);
    }
    private double getRookScore(Color color) {
        return 5.0 * board.getPieceCount(color, Piece.Type.ROOK);
    }
    private double getKnightScore(Color color) {
        return 2.5 * board.getPieceCount(color, Piece.Type.KNIGHT);
    }
    private double getBishopScore(Color color) {
        return 3.0 * board.getPieceCount(color, Piece.Type.BISHOP);
    }
    private double getQueenScore(Color color) {
        return 9.0 * board.getPieceCount(color, Piece.Type.QUEEN);
    }
}
