package lotto;

import static org.junit.Assert.*;

import org.junit.Test;

public class LottoUserTest {

    @Test
    public void test() {
        LottoUser lu = new LottoUser(15000);
        assertEquals(15000, lu.getMoney());
        lu.buyLottos();
        assertEquals(6, lu.getLottos().get(0).getLottoNumCount());
        
    }

}
