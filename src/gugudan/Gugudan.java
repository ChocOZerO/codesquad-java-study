package gugudan;

import java.util.ArrayList;

public class Gugudan {
    
    public static ArrayList<Integer> calculate(int dan) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= dan; i++) {
            for (int j = 1; j <= dan; j++) {
             // 계산 결과를 ArrayList에 저장
                result.add(i * j);
            }
        }
        return result;
    }
}
