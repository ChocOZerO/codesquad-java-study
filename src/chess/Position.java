package chess;

import java.util.ArrayList;

import chess.pieces.InvalidTargetPosition;
import chess.pieces.Piece;

public class Position {
    int x;
    int y;
    
    Board board;
    public Position(Board board) {
        this.board = board;
    }
    
    Piece findPiece(String position) {
        return this.board.getRank(getYPosition(position)).getPiece(getXPosition(position));
    }
    private int getXPosition(String position) {
        return position.charAt(0) - 'a';
    }
    private int getYPosition(String position) {
        return 8 - Character.getNumericValue(position.charAt(1));
    }
    
    void generatePiece(String position, Piece piece) {
        this.board.getRank(getYPosition(position)).setPiece(getXPosition(position), piece);
    }
    void move(String startPosition, String endPosition) {
        Piece targetPiece = board.findPiece(endPosition);
        Piece orderPiece = board.findPiece(startPosition);
        if (orderPiece.checkSameTeam(targetPiece)) {
            throw new InvalidTargetPosition("같은 편이 있는 자리 입니다.");
        }
        generatePiece(endPosition, orderPiece);
        generatePiece(startPosition, Piece.createBlank());
    }
    
}
