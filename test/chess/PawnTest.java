package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {

    @Test
    public void create() {
        String whiteColor = "white";
        String blackColor = "black";
        
        verifyPawn(whiteColor);
        verifyPawn(blackColor);
    }
    
    void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertEquals(color, pawn.getColor());
    }

}
