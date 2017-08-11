package gugudan;

public class GugudanMain {

    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        for (int i = 2; i < 10; i++) {
            Gugudan.print(i, Gugudan.calculate(i));
        }
        
    }
}
