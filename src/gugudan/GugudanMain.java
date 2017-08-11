package gugudan;

import java.util.Scanner;

public class GugudanMain {

    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        /* 
        사용자가 숫자 값 하나를 입력하면 입력한 숫자의 구구단 결과를 출력한다.
        위 요구사항 구현을 다음과 같이 클래스를 분리해 구현한다.
        
        사용자의 입력을 받는 클래스 - GugudanInput
        사용자 입력 값에 따른 구구단을 실행하는 클래스 - Gugudan
        구구단 실행 결과를 출력하는 클래스 - GugudanOutput
        이 3개의 클래스를 조합해 프로그램을 실행하는 클래스 - GuguandanMain
        
        GugudanInput은 int input() 메소드를 구현해야 한다.
        Gugudan은 ArrayList<Integer> calculate(int times) 메소드를 구현해야 한다.
        GugudanOutput은 void print(ArrayList<Integer> result) 메소드를 구현해야 한다.
        GuguandanMain은 main() 메소드를 가지면 위 3개의 메소드를 조합해야 한다.
        */
        
        GugudanOutput.print(Gugudan.calculate(GugudanInput.input()));
        
    }
}
