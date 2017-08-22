package chess;

import static utils.StringUtils.appendNewLine;

import java.util.ArrayList;

import chess.pieces.Piece;

public class Board {
    private static int pieceCount = 0;
    ArrayList<Piece> whitePawns = new ArrayList<>();
    ArrayList<Piece> whitePieces = new ArrayList<>();
    ArrayList<Piece> blackPawns = new ArrayList<>();
    ArrayList<Piece> blackPieces = new ArrayList<>();
    
    private void addWhitePawn(Piece pawn) {
        this.whitePawns.add(pawn);
        pieceCount++;
    }
    private void addWhitePiece(Piece piece) {
        this.whitePieces.add(piece);
        pieceCount++;
    }
    private void addBlackPawn(Piece pawn) {
        this.blackPawns.add(pawn);
        pieceCount++;
    }
    private void addBlackPiece(Piece piece) {
        this.blackPieces.add(piece);
        pieceCount++;
    }
    
    int pieceCount() {
        return pieceCount;
    }
    
    void initialize() {
        addWhitePiece(Piece.createWhiteRook());
        addWhitePiece(Piece.createWhiteKnight());
        addWhitePiece(Piece.createWhiteBishop());
        addWhitePiece(Piece.createWhiteQueen());
        addWhitePiece(Piece.createWhiteKing());
        addWhitePiece(Piece.createWhiteBishop());
        addWhitePiece(Piece.createWhiteKnight());
        addWhitePiece(Piece.createWhiteRook());
        for (int i = 0; i < 8; i++) {
            addWhitePawn(Piece.createWhitePawn());
            addBlackPawn(Piece.createBlackPawn());
        }
        addBlackPiece(Piece.createBlackRook());
        addBlackPiece(Piece.createBlackKnight());
        addBlackPiece(Piece.createBlackBishop());
        addBlackPiece(Piece.createBlackQueen());
        addBlackPiece(Piece.createBlackKing());
        addBlackPiece(Piece.createBlackBishop());
        addBlackPiece(Piece.createBlackKnight());
        addBlackPiece(Piece.createBlackRook());
    }
    
    private String getPawnsResult(ArrayList<Piece> pawns) {
        StringBuilder sb = new StringBuilder();
        for (Piece pawn: pawns) {
            sb.append(pawn.getRepresentation());
        }
        return sb.toString();
    }
    private String getWhitePawnsResult() {
        return this.getPawnsResult(whitePawns);
    }
    private String getWhitePiecesResult() {
        return this.getPawnsResult(whitePieces);
    }
    private String getBlackPawnsResult() {
        return this.getPawnsResult(blackPawns);
    }
    private String getBlackPiecesResult() {
        return this.getPawnsResult(blackPieces);
    }
    
    private String getBlankLine() {
        return "........";
    }
    String showBoard() {
        StringBuilder sb = new StringBuilder();
        String blankLine = appendNewLine(this.getBlankLine()); 
        sb.append(appendNewLine(getBlackPiecesResult()));
        sb.append(appendNewLine(getBlackPawnsResult()));
        for (int i = 0; i < 4; i++) {
            sb.append(blankLine);
        }
        sb.append(appendNewLine(getWhitePawnsResult()));
        sb.append(appendNewLine(getWhitePiecesResult()));
        return sb.toString();
    }
}
