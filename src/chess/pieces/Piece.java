package chess.pieces;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    
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
    private String position;
    
    List<String> moveAvailable;
    
    public int getXPosition() {
        return this.position.charAt(0) - 'a';
    }
    public int getYPosition() {
        return 8 - Character.getNumericValue(this.position.charAt(1));
    }
    
    protected Piece(Color color, Type type, String position) {
        this.color = color;
        this.type = type;
        this.position = position;
    }
    
    public abstract boolean checkMoveAvailable(String target);
    protected abstract void setMoveAvailable();
    
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
    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    
    public boolean checkSamePiece(Color color, Type type) {
        return (this.color.equals(color) && this.type.equals(type));
    }
    public boolean checkSameTeam(Piece target) {
        return this.color.equals(target.color);
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
