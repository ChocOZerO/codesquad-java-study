package gugudan;

import java.util.Scanner;

public class GugudanMain {

    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        /* 추가 요구사항
         -> 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력
            예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
        */
        System.out.println("원하시는 구구단 단수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int maxDan = sc.nextInt();
        
        for (int i = 2; i <= maxDan; i++) {
            Gugudan.print(i, Gugudan.calculate(i, maxDan));
        }
        
    }
}
