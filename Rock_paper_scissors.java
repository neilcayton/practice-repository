package project.exercise;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        Scanner scanner = new Scanner(System.in);
        String playerMove;


        while (true) {
            System.out.println("Please enter your move (r , p, s)");
            playerMove = scanner.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {;
                break;
            }
            System.out.println(playerMove + " is not a valid move");
        }
        System.out.println("Computer played: " + computerMove);
        if (playerMove.equals(computerMove)) {
            System.out.println("its a tie");
        } else if (playerMove.equals("r")) {
            if(computerMove.equals(("p"))) {
                System.out.println("you lose");
            }else System.out.println("you win");

        } else if (playerMove.equals("p")) {
            if (computerMove.equals("s")) {
                System.out.println("you lose");
            }else System.out.println("you win");

        } else {
            if (computerMove.equals("r")) {
                System.out.println("you lose");
            } else System.out.println("you win");

        }

    }
}
