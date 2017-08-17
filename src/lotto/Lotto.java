package lotto;

import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    private ArrayList<Integer> lotto = new ArrayList<>();
    public Lotto() {
        for (int i = 1; i <= 45; i++) {
            this.lotto.add(i);
        }
        Collections.shuffle(this.lotto);
        this.lotto = new ArrayList<>(this.lotto.subList(0, 6));
        Collections.sort(this.lotto);
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
