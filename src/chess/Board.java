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
        for (int i = 0; i < this.board.size(); i++) {
            pieceCount += board.get(i).countPiece(color, type);
        }
        return pieceCount;
        
    }
    
    int countBlankPiece() {
        int blankCount = 0;
        for (int i = 0; i > this.board.size(); i++) {
            blankCount += this.board.get(i).countPiece(Color.NO_COLOR, Type.NO_PIECE);
        }
        return blankCount;
    }
    int countTotalPiece() {
        return 32 - countBlankPiece();
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
        for (int i = 0; i < this.board.size(); i++) {
            sb.append(this.board.get(i).getRankRepresentation() + "\n");
        }
        return sb.toString();
    }
    
    Piece findPiece(String position) {
        int x = position.charAt(0) - 'a';
        int y = 8 - Character.getNumericValue(position.charAt(1));
        return this.board.get(y).getPiece(x);
    }
}
