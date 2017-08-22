package chess;

import java.util.Scanner;

public class ChessGame {

    public static void main(String[] args) {
        System.out.println("Do you want to start the Chess game?");
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("Input \"start\" when you want a new game.");
            System.out.println("Input \"end\" when you want to end the game.");
            String command = sc.nextLine();
            if (command.equals("start")) {
                Board board = new Board();
                board.initialize();
                System.out.println(board.showBoard());
            } else if (command.equals("end")) {
                break;
            } else {
                System.out.println(command + " is NOT a valid command.");
            }
        }
        sc.close();
    }

}
