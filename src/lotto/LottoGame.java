package lotto;

import java.util.ArrayList;

public class LottoGame {
    private int money;
    private ArrayList<Lotto> lottos = new ArrayList<>();
    
    public LottoGame(int money) {
        this.money = money;
    }
    
    public int getAvailableCount() {
        return (int)(this.money / 1000);
    }
    
    public void buyLottos() {
        int count = getAvailableCount();
        for (int i = 0; i < count; i++) {
            lottos.add(new Lotto());
        }
    }
    
    Lotto getLotto(int index) {
        return lottos.get(index);
    }
    
    public void printLottos() {
        for (Lotto lotto : lottos) {
            lotto.printLotto();
            System.out.println();
        }
    }
}
