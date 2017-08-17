package lotto;

import java.util.ArrayList;

public class LottoUser {
    private int money;
    private ArrayList<Lotto> lottos = new ArrayList<>();
    private int lottoCount;
    
    public LottoUser(int money) {
        this.money = money;
        this.lottoCount = (int)(this.money / 1000);
    }
    
    public int getMoney() {
        return this.money;
    }
    
    public int getLottoCount() {
        return this.lottoCount;
    }
    
    public void buyLottos() {
        LottoGame lottoGame = new LottoGame(this.money);
        this.lottos = lottoGame.generateLottos();
    }
    public ArrayList<Lotto> getLottos() {
        return this.lottos;
    }
    
    public void printLottos() {
        for (Lotto lotto : lottos) {
            lotto.printLotto();
            System.out.println();
        }
    }
    
    Lotto getLotto(int index) {
        return lottos.get(index);
    }
}
