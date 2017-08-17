package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGame {
    private int money;
    private ArrayList<Lotto> lottos = new ArrayList<>();
    List<Integer> lottoArray;
    
    public LottoGame(int money) {
        this.money = money;
    }
    
    public int getAvailableCount() {
        return (int)(this.money / 1000);
    }
    
    public ArrayList<Lotto> generateLottos() {
        int count = getAvailableCount();
        for (int i = 0; i < count; i++) {
            this.lottos.add(this.generateLotto());
        }
        return this.lottos;
    }
    private Lotto generateLotto() {
        this.lottoArray = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            this.lottoArray.add(i);
        }
        Collections.shuffle(this.lottoArray);
        this.lottoArray = this.lottoArray.subList(0,6);
        Collections.sort(this.lottoArray);
        Lotto lotto = new Lotto(Collections.unmodifiableList(this.lottoArray));
        return lotto;
    }
    
    public Lotto generateAutoWinLotto() {
        return this.generateLotto();
    }
    
    public Lotto generateWinLotto(String[] winInput) {
        this.lottoArray = new ArrayList<>();
        for (int i = 0; i < winInput.length; i++) {
            this.lottoArray.add(Integer.parseInt(winInput[i]));
        }
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
