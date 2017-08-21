package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {

    @Test
    public void create() {
        Pawn pawn = new Pawn("white");
        assertEquals("white", pawn.getColor());
    }

}
