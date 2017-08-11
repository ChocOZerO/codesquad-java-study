package gugudan;

import java.util.Scanner;

public class GugudanMain {

    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        /* 추가 요구사항 2
         -> 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력
            예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
            팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
        */
        System.out.println("원하시는 구구단을 쉼표로 구분하여 입력하세요. 예) '8,7' ");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] gugudan = input.split(",");
        int first = Integer.parseInt(gugudan[0]);
        int second = Integer.parseInt(gugudan[1]);
        
        for (int i = 2; i <= first; i++) {
            Gugudan.print(i, Gugudan.calculate(i, second));
        }
        
    }
}
