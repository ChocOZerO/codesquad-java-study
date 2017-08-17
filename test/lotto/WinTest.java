package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class WinTest {

    @Test
    public void winTest() {
        Win win = new Win("1, 2");
        assertEquals(true, win.isContains(1));
        assertEquals(true, win.isContains(2));
    }

}
