package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperAndScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        System.out.print("Choose [r]ock, [p]aper or [s]cissors:  ");
        Scanner scanner = new Scanner(System.in);
        String playersMove = scanner.nextLine();
        if (playersMove.equals("r") || playersMove.equals("rock")) {
            playersMove = ROCK;
        } else if (playersMove.equals("p") || playersMove.equals("paper")) {
            playersMove = PAPER;
        } else if (playersMove.equals("s") || playersMove.equals("scissors")) {
            playersMove = SCISSORS;
        } else {
            System.out.println("Invalid input! Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 1:
                computerMove = ROCK;
                break;
            case 2:
                computerMove = PAPER;
                break;
            case 3:
                computerMove = SCISSORS;
                break;
        }
        System.out.printf("The computer chose %s.%n", computerMove);
        if ((playersMove.equals(ROCK) && computerMove.equals(SCISSORS))
                || (playersMove.equals(PAPER) && computerMove.equals(ROCK))
                || (playersMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
            System.out.println("You win!");
        } else if ((playersMove.equals(ROCK) && computerMove.equals(PAPER))
                || (playersMove.equals(PAPER) && computerMove.equals(SCISSORS))
                || (playersMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
            System.out.println("You lose!");
        } else {
            System.out.println("The game was a draw.");
        }
    }
}




