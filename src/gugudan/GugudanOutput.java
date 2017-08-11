package gugudan;

import java.util.ArrayList;

public class GugudanOutput {
    public static void print(ArrayList<Integer> result) {
        for (int i = 0; i < result.size(); i++) {
            // 계산 결과를 화면에 출력
            System.out.println(result.get(i));
        }
    }
}
