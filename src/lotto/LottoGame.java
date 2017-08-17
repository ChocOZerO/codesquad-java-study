package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGame {
    private int money;
    private ArrayList<Lotto> lottos = new ArrayList<>();
    
    public LottoGame(int money) {
        this.money = money;
    }
    
    public int getAvailableCount() {
        return (int)(this.money / 1000);
    }
    
    public ArrayList<Lotto> generateLottos() {
        int count = getAvailableCount();
        for (int i = 0; i < count; i++) {
            lottos.add(lottoGenerator());
        }
        return lottos;
    }
    private Lotto lottoGenerator() {
        List<Integer> lottoArray = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            lottoArray.add(i);
        }
        Collections.shuffle(lottoArray);
        lottoArray = lottoArray.subList(0,6);
        Collections.sort(lottoArray);
        Lotto lotto = new Lotto(Collections.unmodifiableList(lottoArray));
        return lotto;
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
