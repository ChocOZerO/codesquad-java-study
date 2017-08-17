package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoCheckerTest {

    @Test
    public void test() {
        LottoUser lottoUser = new LottoUser(15000);
        lottoUser.buyLottos();
        Win win = new Win("1, 2, 3, 4, 5, 6");
        
        LottoChecker lc = new LottoChecker(lottoUser, win);
        lc.matchUp();
        
        assertEquals(0, lc.getMatch3());
        assertEquals(0, lc.getMatch4());
        assertEquals(0, lc.getMatch5());
        assertEquals(0, lc.getMatch6());
    }

}
