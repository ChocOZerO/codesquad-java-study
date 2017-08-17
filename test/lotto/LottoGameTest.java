package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoGameTest {

    @Test
    public void test() {
        LottoGame lg = new LottoGame(15000);
        int count = lg.getAvailableCount();
        lg.generateLottos();
        assertEquals(15, count);
        lg.printLottos();
        assertEquals(1, lg.getLotto(0).getLottoNum(1)); // 일부러 틀리게 하여 추출되는 값 확인
    }
}
