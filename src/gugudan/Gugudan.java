package gugudan;

import java.util.ArrayList;

public class Gugudan {
    
    public static ArrayList<Integer> calculate(int dan) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            // 계산 결과를 ArrayList에 저장
            result.add(dan * i);
        }
        return result;
    }
    
}
