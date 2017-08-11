package gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("Hello CodeSquad");
        
        System.out.println("2 x 1 = " + (2 * 1));
        System.out.println("2 x 2 = " + (2 * 2));
        System.out.println("2 x 3 = " + (2 * 3));
        System.out.println("2 x 4 = " + (2 * 4));
        System.out.println("2 x 5 = " + (2 * 5));
        System.out.println("2 x 6 = " + (2 * 6));
        System.out.println("2 x 7 = " + (2 * 7));
        System.out.println("2 x 8 = " + (2 * 8));
        System.out.println("2 x 9 = " + (2 * 9));
        
        System.out.println("3 x 1 = " + (3 * 1));
        System.out.println("3 x 2 = " + (3 * 2));
        System.out.println("3 x 3 = " + (3 * 3));
        System.out.println("3 x 4 = " + (3 * 4));
        System.out.println("3 x 5 = " + (3 * 5));
        System.out.println("3 x 6 = " + (3 * 6));
        System.out.println("3 x 7 = " + (3 * 7));
        System.out.println("3 x 8 = " + (3 * 8));
        System.out.println("3 x 9 = " + (3 * 9));
        
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        int result = dan * 1;
        System.out.println(dan + " x 1 = " + result);
        result = dan * 2;
        System.out.println(dan + " x 2 = " + result);
        result = dan * 3;
        System.out.println(dan + " x 3 = " + result);
        result = dan * 4;
        System.out.println(dan + " x 4 = " + result);
        result = dan * 5;
        System.out.println(dan + " x 5 = " + result);
        result = dan * 6;
        System.out.println(dan + " x 6 = " + result);
        result = dan * 7;
        System.out.println(dan + " x 7 = " + result);
        result = dan * 8;
        System.out.println(dan + " x 8 = " + result);
        result = dan * 9;
        System.out.println(dan + " x 9 = " + result);
        
    }
}
