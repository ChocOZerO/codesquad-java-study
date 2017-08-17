package lotto;

import java.util.ArrayList;

public class Win {
    private ArrayList<Integer> win = new ArrayList<>();
    public Win(String win) {
        String[] winTmp = win.split(", ");
        for (int i = 0; i < winTmp.length; i++) {
            this.win.add(Integer.parseInt(winTmp[i]));
        }
    }
    
    boolean isContains(int num) {
        return win.contains(num);
    }
}
