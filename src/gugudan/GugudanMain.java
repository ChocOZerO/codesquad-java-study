package gugudan;

public class GugudanMain {

    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        /* 
        사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다. 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
        팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
        위 요구사항 구현을 다음과 같이 클래스를 분리해 구현한다.
        
        사용자의 입력을 받는 클래스 - GugudanInput
        사용자가 입력한 두 개의 값을 저장할 수 있는 클래스 - InputValue
        사용자 입력 값에 따른 구구단을 실행하는 클래스 - Gugudan
        구구단 실행 결과를 출력하는 클래스 - GugudanOutput
        이 3개의 클래스를 조합해 프로그램을 실행하는 클래스 - GuguandanMain
        
        사용자가 입력한 값을 문자열(String)로 받는다.
        
        */
        
        GugudanOutput.print(Gugudan.calculate(GugudanInput.input()));
        
    }
}
