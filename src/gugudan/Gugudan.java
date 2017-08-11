package gugudan;

public class Gugudan {
    
    public static int[] calculate(int dan) {

        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = dan * (i + 1);
        }
        return result;
    }
    
    public static void print(int dan, int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(dan + " x " + (i + 1) + " = " + result[i]);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        for (int i = 2; i < 10; i++) {
            print(i, calculate(i));
        }
        
    }
}
