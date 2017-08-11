package gugudan;

import java.util.ArrayList;

public class Gugudan {
    
    public static ArrayList<Integer> calculate(InputValue inputValue) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= inputValue.getFirst(); i++) {
            for (int j = 1; j <= inputValue.getSecond(); j++) {
             // 계산 결과를 ArrayList에 저장
                result.add(i * j);
            }
        }
        return result;
    }
}
