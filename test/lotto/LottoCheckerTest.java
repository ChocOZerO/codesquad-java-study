package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoCheckerTest {

    @Test
    public void test() {
        LottoGame lg = new LottoGame(15000);
        lg.buyLottos();
        Win win = new Win("1, 2, 3, 4, 5, 6");
        
        LottoChecker lc = new LottoChecker(lg, win);
        lc.matchUp();
        
        assertEquals(0, lc.getMatch3());
        assertEquals(0, lc.getMatch4());
        assertEquals(0, lc.getMatch5());
        assertEquals(0, lc.getMatch6());
    }

}
