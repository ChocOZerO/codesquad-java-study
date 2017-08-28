package chess.pieces;

public class Piece {
    
    public enum Color {
        WHITE, BLACK, NO_COLOR;
    }
    public enum Type {
        PAWN('p', 1.0), KNIGHT('n', 2.5), ROOK('r', 5.0), BISHOP('b', 3.0), QUEEN('q', 9.0), KING('k', 0.0), NO_PIECE('.', 0.0);
        private final char representation;
        private double score;
        Type(char representation, double score) {
            this.representation = representation;
            this.score = score;
        }
        public char getWhiteRepresentation() {
            return this.representation;
        }
        public char getBlackRepresentation() {
            return Character.toUpperCase(this.representation);
        }
        public double getScore() {
            return this.score;
        }
    }
    
    private Color color;
    private Type type;
    
    private Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }
    
    public Color getColor() {
        return this.color;
    }
    public Type getType() {
        return this.type;
    }
    public char getRepresentation() {
        if (this.isBlack()) {
            return this.type.getBlackRepresentation();
        }
        return this.type.getWhiteRepresentation();
    }
    
    public boolean checkSamePiece(Color color, Type type) {
        return (this.color.equals(color) && this.type.equals(type));
    }
    
    private static Piece createWhite(Type type) {
        return new Piece(Color.WHITE, type);
    }
    private static Piece createBlack(Type type) {
        return new Piece(Color.BLACK, type);
    }
    
    public static Piece createWhitePawn() {
        return createWhite(Type.PAWN);
    }
    public static Piece createBlackPawn() {
        return createBlack(Type.PAWN);
    }
    public static Piece createWhiteKnight() {
        return createWhite(Type.KNIGHT);
    }
    public static Piece createBlackKnight() {
        return createBlack(Type.KNIGHT);
    }
    public static Piece createWhiteRook() {
        return createWhite(Type.ROOK);
    }
    public static Piece createBlackRook() {
        return createBlack(Type.ROOK);
    }
    public static Piece createWhiteBishop() {
        return createWhite(Type.BISHOP);
    }
    public static Piece createBlackBishop() {
        return createBlack(Type.BISHOP);
    }
    public static Piece createWhiteQueen() {
        return createWhite(Type.QUEEN);
    }
    public static Piece createBlackQueen() {
        return createBlack(Type.QUEEN);
    }
    public static Piece createWhiteKing() {
        return createWhite(Type.KING);
    }
    public static Piece createBlackKing() {
        return createBlack(Type.KING);
    }
    
    public static Piece createBlank() {
        return new Piece(Color.NO_COLOR, Type.NO_PIECE);
    }

    public boolean isWhite() {
        return this.color.equals(Color.WHITE);
    }
    public boolean isBlack() {
        return this.color.equals(Color.BLACK);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Piece other = (Piece) obj;
        if (color != other.color)
            return false;
        if (type != other.type)
            return false;
        return true;
    }
}
