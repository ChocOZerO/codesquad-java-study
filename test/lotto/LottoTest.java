package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoTest {

    @Test
    public void lottoNum() {
        Lotto lotto = new Lotto();
        assertEquals(6, lotto.getPickedNumCount());
        assertEquals((new Lotto()).findLottoNum(0), lotto.findLottoNum(0));
    }

}
