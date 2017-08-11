package gugudan;

import java.util.Scanner;

public class GugudanInput {
    public static int input() {
        System.out.println("원하시는 구구단 단수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        return inputValue;
    }
}
