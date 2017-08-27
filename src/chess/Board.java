package chess;

import java.util.ArrayList;

import chess.pieces.Piece;
import chess.pieces.Piece.Color;
import chess.pieces.Piece.Type;

public class Board {
    
    ArrayList<Rank> board = new ArrayList<>();
    
    Board() {
        for (int i = 0; i < 8; i++) {
            this.board.add(new Rank());
        }
    }
    
    int getPieceCount(Color color, Type type) {
        int pieceCount = 0;
        for (Rank rank : this.board) {
            pieceCount += rank.countPiece(color, type);
        }
        return pieceCount;
    }
    
    private int countBlank() {
        int blankCount = 0;
        for (Rank rank: this.board) {
            blankCount += rank.countPiece(Color.NO_COLOR, Type.NO_PIECE);
        }
        return blankCount;
    }
    int countTotalPiece() {
        return 64 - countBlank();
    }
    
    void blankBoard() {
        for (int i = 0; i < this.board.size(); i++) {
            board.set(i, new Rank());
        }
    }
    void initialize() {
        this.board.get(0).initializeBlackPieceRank();
        this.board.get(1).initializeBlackPawnRank();
        for (int i = 2; i <= 5; i++) {
            this.board.get(2).getBlankRank();
        }
        this.board.get(6).initializeWhitePawnRank();
        this.board.get(7).initializeWhitePieceRank();
    }
    
    String showBoard() {
        StringBuilder sb = new StringBuilder();
        for (Rank rank: board) {
            sb.append(rank.getRankRepresentation() + "\n");
        }
        return sb.toString();
    }
    
    Piece findPiece(String position) {
        return this.board.get(getYPosition(position)).getPiece(getXPosition(position));
    }
    private int getXPosition(String position) {
        return position.charAt(0) - 'a';
    }
    private int getYPosition(String position) {
        return 8 - Character.getNumericValue(position.charAt(1));
    }
    
    void generatePiece(String position, Piece piece) {
        this.board.get(getYPosition(position)).setPiece(getXPosition(position), piece);
    }
    void move(String startPosition, String endPosition, Piece piece) {
        generatePiece(endPosition, piece);
        generatePiece(startPosition, Piece.createBlank());
    }
    
}
