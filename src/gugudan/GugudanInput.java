package gugudan;

import java.util.Scanner;

public class GugudanInput {
    public static InputValue input() {
        System.out.println("원하시는 구구단 단수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputValues = input.split(",");
        InputValue inputValue = new InputValue(Integer.parseInt(inputValues[0]), Integer.parseInt(inputValues[1]));
        
        return inputValue;
    }
}
