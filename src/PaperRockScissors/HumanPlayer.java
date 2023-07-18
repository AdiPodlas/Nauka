package PaperRockScissors;

import PaperRockScissors.Enums.Move;

import java.util.Scanner;

class HumanPlayer implements Player {
    private final Scanner scanner = new Scanner(System.in);

    public Move getMove() {
        System.out.print("Twój ruch (ROCK/PAPER/SCISSORS): ");
        String input = scanner.nextLine().toUpperCase();

        while (!isValidMove(input)) {
            System.out.print("Nieprawidłowy ruch. Spróbuj jeszcze raz: ");
            input = scanner.nextLine().toUpperCase();
        }

        return Move.valueOf(input);
    }

     private boolean isValidMove(String move) {
        for (Move validMove : Move.values()) {
            if (validMove.name().equals(move)) {
                return true;
            }
        }
        return false;
    }
}

