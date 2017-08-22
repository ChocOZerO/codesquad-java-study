package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PawnTest {
    private Pawn pawn;
    
    private String whiteColor = Pawn.WHITE_COLOR;
    private String blackColor = Pawn.BLACK_COLOR;
    
    private char whiteRepresentation = Pawn.WHITE_REPRESENTATION;
    private char blackRepresentation = Pawn.BLACK_REPRESENTATION;
    
    @Before
    public void setup() {
        pawn = new Pawn();
    }
    
    @Test
    public void create_empty() {
        assertEquals(whiteColor, pawn.getColor());
        assertEquals(whiteRepresentation, pawn.getRepresentation());
    }
    
    @Test
    public void create() {
        verifyPawn(whiteColor, whiteRepresentation);
        verifyPawn(blackColor, blackRepresentation);
    }
    
    void verifyPawn(final String color, final char representation) {
        Pawn pawn = new Pawn(color, representation);
        assertEquals(color, pawn.getColor());
        assertEquals(representation, pawn.getRepresentation());
    }
}
