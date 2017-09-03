package chess;

import java.util.Scanner;

public class ChessGame {

    public static void main(String[] args) {
        System.out.println("Do you want to start the Chess game?");
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        Score score = new Score(board);
        System.out.println("Input \"start\" when you want a new game.");
        String command = "";
        while (true) {
            
            command = sc.nextLine();
            if (command.equals("start")) {
                System.out.println("Input \"end\" when you want to end the game.");
                System.out.println("Input \"move\" when you want to move your piece.");
                board.initialize();
                System.out.println(board.showBoard());
            } else if (command.equals("end")) {
                break;
            } else if (command.startsWith("move")) {
                String[] commandTmp = command.split(" ");
                board.move(commandTmp[1], commandTmp[2]);
                System.out.println(board.showBoard());
            } else {
                System.out.println(command + " is NOT a valid command.");
            }
        }
        System.out.println("game is over.");
        System.out.println(score.getWinner() + " team win!!!");
        sc.close();
    }

}
