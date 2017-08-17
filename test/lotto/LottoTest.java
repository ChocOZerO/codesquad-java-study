package lotto;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class LottoTest {

    @Test
    public void lottoNum() {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        Lotto lotto = new Lotto(arrList);
        assertEquals(6, lotto.getPickedNumCount());
        assertEquals(1, lotto.findLottoNum(0));
        assertEquals((new Lotto(arrList)).findLottoNum(0), lotto.findLottoNum(0));
    }

}
