package gugudan;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        int i = 2;
        while (i < 10) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            i++;
        }
        
    }
}
