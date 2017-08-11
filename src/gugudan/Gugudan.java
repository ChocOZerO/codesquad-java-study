package gugudan;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");

        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = 2 * (i + 1);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("2 x " + (i + 1) + " = " + result[i]);
        }
    }
}
