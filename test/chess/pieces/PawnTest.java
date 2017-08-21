package chess.pieces;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PawnTest {
    Pawn pawn;
    String whiteColor = Pawn.WHITE_COLOR;
    String blackColor = Pawn.BLACK_COLOR;
    
    @Before
    public void setup() {
        pawn = new Pawn();
    }
    
    @Test
    public void create() {
        verifyPawn(whiteColor);
        verifyPawn(blackColor);
    }
    
    @Test
    public void create_empty() {
        verifyPawn("");
        assertEquals(whiteColor, pawn.getColor());
    }
    
    void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertEquals(color, pawn.getColor());
    }

}
