package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoCheckerTest {

    @Test
    public void test() {
        LottoUser lottoUser = new LottoUser(15000);
        lottoUser.buyLottos();
        lottoUser.printLottos();
        System.out.println("-------------");
        Win win = new Win("1, 2, 3, 4, 5, 6");
        Win win2 = new Win("lottery");
        win.getWin().printLotto();
        System.out.println(" 보너스번호 : [" + win.getBonus() + "]");
        System.out.println();
        win2.getWin().printLotto();
        System.out.println(" 보너스번호 : [" + win2.getBonus() + "]");
        LottoChecker lc = new LottoChecker(lottoUser, win);
        LottoChecker lc2 = new LottoChecker(lottoUser, win2);
        lc.matchUp();
        
        assertEquals(0, lc.getMatch3());
        assertEquals(0, lc.getMatch4());
        assertEquals(0, lc.getMatch5());
        assertEquals(0, lc.getMatch5Bonus());
        assertEquals(0, lc.getMatch6());
        
        assertEquals(0, lc2.getMatch3());
        assertEquals(0, lc2.getMatch4());
        assertEquals(0, lc2.getMatch5());
        assertEquals(0, lc2.getMatch5Bonus());
        assertEquals(0, lc2.getMatch6());
    }

}
