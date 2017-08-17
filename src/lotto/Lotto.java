package lotto;

import java.util.List;

public class Lotto {
    private List<Integer> lotto;
    public Lotto(List<Integer> lotto) {
        this.lotto = lotto;
    }
    
    public int getPickedNumCount() {
        return this.lotto.size();
    }
    
    public int findLottoNum(int index) {
        return lotto.get(index);
    }
    
    public void printLotto() {
        System.out.print("[");
        for (int i = 0; i < lotto.size(); i++) {
            if (i != 0) System.out.print(", ");
            System.out.print(lotto.get(i));
        }
        System.out.print("]");
    }
}
