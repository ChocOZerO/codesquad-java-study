package gugudan;

public class Gugudan {
    
    public static int[] calculate(int dan, int maxDan) {

        int[] result = new int[maxDan];
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 배열에 저장
            result[i] = dan * (i + 1);
        }
        return result;
    }
    
    public static void print(int dan, int[] result) {
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 화면에 출력
            System.out.println(dan + " x " + (i + 1) + " = " + result[i]);
        }
    }
    
}
